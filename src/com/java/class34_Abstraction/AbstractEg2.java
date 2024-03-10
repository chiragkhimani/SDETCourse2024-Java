package com.java.class34_Abstraction;

abstract class CentralBank {

    public abstract void showIntRate();
}

class CityBank extends CentralBank {
    public void showIntRate() {
        System.out.println("int rate is 6%");
    }

}

class BOA extends CentralBank {
    public void showIntRate() {
        System.out.println("int rate is 7%");
    }

}

class HSBC extends CentralBank {
    public void showIntRate() {
        System.out.println("int rate is 8%");
    }
}


public class AbstractEg2 {
    public static void main(String[] args) {

        CentralBank obj[] = new CentralBank[3];

        obj[0] = new CityBank();
        obj[1] = new BOA();
        obj[2] = new HSBC();

        for (CentralBank parentRef : obj) {
            parentRef.showIntRate();
        }

//        CentralBank A1 = new CityBank();
//        CentralBank A2 = new BOA();
//        CentralBank A3 = new HSBC();
//
//        A1.showIntRate();
//        A2.showIntRate();
//        A3.showIntRate();

    }


}




