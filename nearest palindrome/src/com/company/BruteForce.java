package com.company;

class BruteForce {

    static int bruteMethod(int number){
        int i;
        for(i=number;i>10;i--){
            String a = Integer.toString(i);
            StringBuilder b = new StringBuilder(Integer.toString(i));
            b.reverse();
            if(a.compareTo(String.valueOf(b)) == 0){
                break;
            }
        }
        int j;
        for(j=number;;j++){
            String c = Integer.toString(j);
            StringBuilder d = new StringBuilder(Integer.toString(j));
            d.reverse();
            if(c.compareTo(String.valueOf(d)) == 0){
                break;
            }
        }
        return min(i,j,number);
    }

    private static int min(int a,int b,int number){
        if(number-a > b-number){
            return b;
        }
        else {
            return a;
        }
    }
}
