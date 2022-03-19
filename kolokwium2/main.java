package com.company;

public class Main {

    public static void main(String[] args){


        System.out.println("Wynik: "+sum(new String[] {"1","2","3"}));
    }

    public static String sum(String[] arr){

        var wynik = 0;
        for(String i : arr){
            wynik = Integer.parseInt(i)+wynik;
        }


        return Integer.toString(wynik);
    }
}
