package oracle.se.modules.sample.service;

import oracle.se.modules.sample.core.UtilityClass;
import oracle.se.modules.sample.entity.EntityOne;

public class ServiceOne {

    private EntityOne e = new EntityOne("service one has entity");

    public ServiceOne(String s) {
        UtilityClass.doSomethingStatic("ServiceOne instiated  " + s);
    }
}
