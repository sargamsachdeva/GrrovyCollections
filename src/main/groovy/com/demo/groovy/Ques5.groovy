package com.demo.groovy

class Ques5 {

    static removeOddIndexedElements() {

        List list1 = [11, 12, 13, 14, 15, 16];

        int count = 1;

        list1.removeAll {

            ++count % 2 !=0;
        }

        println(list1)
    }


    static void main(String[] args) {

        removeOddIndexedElements();
    }

}