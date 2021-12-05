package com.interfaces;

public interface Studing {
    public void studing();
    public void relax();

//    static HscStuding newInstance() {
//        return new HscStuding();
//    }

    class HscStuding implements Studing {
        public void studing() {
            System.out.println("hsc is studing");
        }
        public void relax() {
            System.out.println("hsc is relaxing");
        }
    }
}