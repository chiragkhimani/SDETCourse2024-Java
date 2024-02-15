package com.java.class17;

public class a2DArray {

    public static void main(String[] args) {

        //1. Declaration and init
        int num[][] = {{10,20,30}, {40,50,60,100}, {70,80,90}};

        //2. Print one value from array
        System.out.println(num[2][0]);

        //3.Total ROW in Array
        System.out.println(num.length);

        //4. Total elements at particular row in Array
        System.out.println(num[0].length);

        //5. Print all elements

        System.out.print(num[0][0]);
        System.out.print(num[0][1]);
        System.out.println(num[0][2]);
        System.out.print(num[1][0]);
        System.out.print(num[1][1]);
        System.out.println(num[1][2]);
        System.out.print(num[2][0]);
        System.out.print(num[2][1]);
        System.out.println(num[2][2]);

        System.out.println("================================================");
//        int num[][] = {{10,20,30}, {40,50,60,100}, {70,80,90}};

        //6. Print all elements with for loop
        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("================================================");
        //7. Print all elements with for each
        for (int[] i : num) {
            for (int j: i){
                System.out.print(j +" ");
            }
            System.out.println();
        }

        //8. Another way to Declaration and init
        // int num[][] = {{10,20,30}, {40,50,60,100}, {70,80,90}};

        int num1 [][] = new int[3][3];       //000, 000, 000

        for (int i = 0; i < num1.length ; i++) {
            for (int j = 0; j < num1[i].length; j++) {
                System.out.print(num1[i][j] + " ");
            }
            System.out.println();
        }



    }





}
