package com.java.interviewprep;

public class OverrideExample {

    public static void main(String[]args) {
        Base base = new Base();
        String baseValue = base.baseMethod();
        System.out.println("Base Value is::"+baseValue);

        Base baseD = new DerivedClass(); // calls Derived Class methods.
        String baseDValue = baseD.baseMethodExt();
        System.out.println("baseDValue Value is::"+baseDValue);
    }
}

class Base {
    public String baseMethod() {
        return "Base Method";
    }

    protected String baseMethodExt() {
        return "Base Method Extension";
    }
}

class DerivedClass extends Base {
    public String baseMethod() {
        return "Derived Method";
    }

    public String baseMethodExt() {
        return "Derived Method Extension";
    }

}