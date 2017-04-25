package com.demo.groovy

class Ques1 {

    static void main(String[] args) {

        List list = [1,2,3,4,5,6,8,7,9,67,54]

        list[11] = "myElement"
        println ("11th element is: "+list[11])

        println("5th element: "+list.get(5))

        println(list)

        def range = 1..10;

       println range.findAll {

            it % 2 == 0
        }
    }
}