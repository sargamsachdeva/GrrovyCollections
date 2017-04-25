package com.demo.groovy

class Ques7 {

    static sortInDescending() {

        List list1 = [14, 12, 11, 10, 16, 15, 12, 10, 99, 90, 14, 16, 35];

        println("Sorting list in descending order having distinct elements");

        list1.unique().sort {

            element1,element2->

                element1 < element2 ? 1 : element1 == element2 ? 0 : -1
        }

        println(list1)
    }


    static void main(String[] args) {

        sortInDescending();
    }

}