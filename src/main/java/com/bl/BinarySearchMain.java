package com.bl;

public class BinarySearchMain {

   public static void main(String[] args) {
       BinarySearch ob= new BinarySearch();
        String[] arr   ={"kajal","kk","lata"};
        String x="kk";
        int result=ob.binarySearch(arr,x);
        if(result == -1){
            System.out.println(" String is not found");
        }else{
            System.out.println("String found at : " +" index  " + result);
        }
    }
}
