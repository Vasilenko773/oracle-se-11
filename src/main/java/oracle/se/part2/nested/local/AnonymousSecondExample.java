package oracle.se.part2.nested.local;

public class AnonymousSecondExample {

    private interface Summable {
        double getTotal(float[] data);
    }

    public static void invokeSummable(Summable summable, float[] data) {
        System.out.println("Total = " + String.format("%.2f", summable.getTotal(data)));
    }

    public static void main(String[] args) {
        invokeSummable(new Summable() {
            @Override
            public double getTotal(float[] data) {
                double total = 0.0;
                for (var i : data) {
                    total += i;
            }
                return total;
        }}, new float[]{12.4f, 1.4f, 1.2f});
    }
}
