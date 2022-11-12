module org.module.util {
    requires transitive org.global.example;
    exports com.orgmodule.util to org.module.base, org.module.concrete;
}