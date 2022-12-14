package oracle.se.modules.sample.api;

import oracle.se.modules.sample.core.UtilityClass;
import oracle.se.modules.sample.entity.EntityOne;
import oracle.se.modules.sample.service.ServiceOne;

import java.util.logging.Logger;

public class ControllerOne {

    ServiceOne s = new ServiceOne("Injecting in controller serviceOne");
    EntityOne e = new EntityOne("Injecting in controller entityOne");

    public ControllerOne(String s) {
        UtilityClass.doSomethingStatic("Controller instantieted "  + s );
    }

    public static void main(String[] args) {
        queryModuleData(UtilityClass.class);
        queryModuleData(ControllerOne.class);
        queryModuleData(Logger.class);

    }

    public static void queryModuleData(Class cls) {
        System.out.println("---------class--------");
        Module module = cls.getModule();
        System.out.println(module);
        System.out.println(module.getName());
        System.out.println(module.isNamed());
        System.out.println(module.getDescriptor());
   //     System.out.println(module.getDescriptor().isAutomatic());
    }
}
