package com.orgmodule.base;

import com.orgglobal.ApplicationConstance;
import com.orgmodule.util.Countable;

public class BaseEntity implements Countable {

    public BaseEntity() {
        countMe();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            BaseEntity b1 = new BaseEntity();
        }
        System.out.println(ApplicationConstance.APP_NAME + " Created " + ApplicationConstance.getCounter());
    }

    @Override
    public void countMe() {
        ApplicationConstance.addCounter();
    }
}
