package oracle.se.modules.sample.entity;

import oracle.se.modules.sample.core.UtilityClass;

public class EntityOne {

    public EntityOne(String s) {
        UtilityClass.doSomethingStatic("EntityOne instaled " + s);
    }
}
