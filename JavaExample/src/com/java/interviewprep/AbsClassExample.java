package com.java.interviewprep;

public abstract class AbsClassExample {

   // private abstract int display();
    protected abstract int visit();

    public abstract int visited();

    public static void returnClassName() {
        System.out.println("ClassName::"+AbsClassExample.class.getName());
    }



    public static void main(String[]args) {
       AbsClassExample.returnClassName();

       Derived d = new Derived();
      int i =  d.visit();
      System.out.println("Visit method call::"+i);

    }

}

class Derived extends AbsClassExample {

    @Override
    protected int visit() {
        return 0;
    }

    @Override
    public int visited() {
        return 0;
    }
}