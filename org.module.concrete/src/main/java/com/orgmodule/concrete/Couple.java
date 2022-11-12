package com.orgmodule.concrete;

import com.orgglobal.ApplicationConstance;
import com.orgmodule.util.Countable;

public class Couple implements Countable {

    public Couple() {
        countMe();
    }
    @Override
    public void countMe() {
        ApplicationConstance.addCounter();
        ApplicationConstance.addCounter();
    }
}
