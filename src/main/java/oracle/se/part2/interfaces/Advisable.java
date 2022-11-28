package oracle.se.part2.interfaces;

interface Advisable {

    enum GradeLevel {
        FRESHMAN("Math", "History"),
        SOPHOMORE("Math", "Political Science"),
        JUNIOR("CompSci", "DiffEq"),
        SENIOR("ElectroMagnetics", "Statistics");
        private String[] course;

        GradeLevel(String... course) {
            this.course = course;
        }
    }

    enum AcademicLevel {
        FAILING, UNSATISFACTORY, SATISFACTORY, OVERACHIEVING
    }

    void advise(GradeLevel gradeLevel, AcademicLevel[] academicLevels);

    default String getRequirements(GradeLevel gradeLevel, AcademicLevel[] academicLevels) {
        String gergs = gradeLevel.toString();
        for (int i = 0; i < gradeLevel.course.length; i++) {
                   String levelCode = getLevelCode(academicLevels[i]);
            gergs += ": " + gradeLevel.course[i] + " " + (gradeLevel.ordinal() + 1) + "000" + levelCode;
        }
        return gergs;
    }

    default String getClass(GradeLevel gradeLevel, String cource, AcademicLevel academicLevel) {
        String levelCode = getLevelCode(academicLevel);
        return cource + " " + (gradeLevel.ordinal() + 1) + "000" + levelCode;
    }

        public static String getLevelCode(AcademicLevel academicLevel) {
            String levelCode = "";
            switch (academicLevel) {
                case FAILING:
                case UNSATISFACTORY:
                    levelCode = "UD";
                    break;
                case OVERACHIEVING:
                    levelCode = "ADV";
            }
            return levelCode;
        }
}

class PrivateExamples implements Advisable {
    @Override
    public void advise(GradeLevel gradeLevel, AcademicLevel[] academicLevels) {
        System.out.println(getRequirements(gradeLevel, academicLevels));
    }

    public static void main(String[] args) {
        PrivateExamples p = new PrivateExamples();
        p.advise(GradeLevel.SOPHOMORE, new AcademicLevel[] {AcademicLevel.UNSATISFACTORY, AcademicLevel.SATISFACTORY});
        p.advise(GradeLevel.FRESHMAN, new AcademicLevel[] {AcademicLevel.OVERACHIEVING, AcademicLevel.OVERACHIEVING});
        System.out.println(p.getClass(GradeLevel.FRESHMAN, "Math", AcademicLevel.UNSATISFACTORY));
    }
}
