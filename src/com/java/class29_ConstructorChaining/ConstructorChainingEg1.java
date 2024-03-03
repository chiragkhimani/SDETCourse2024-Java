package com.java.class29_ConstructorChaining;

class Parent {
    Parent(){
        super();
        System.out.println("1.Non Para in Parent");
    }
    Parent(int a){
        super();
        System.out.println("2. Parameterised Const in Parent");
    }
}

class Child extends Parent{
    Child(){
        super();
        System.out.println("3. Non Para in Child");
    }
    Child(int a){
        super(10);
        System.out.println("4. Parameterised Const in Child");
    }
}

public class ConstructorChainingEg1 {
    public static void main(String[] args) {
      Child c1 = new Child();           //1,3
      Child c2 = new Child(10);     //2,4

    }


}
