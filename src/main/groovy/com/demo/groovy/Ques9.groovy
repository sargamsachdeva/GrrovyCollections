package com.demo.groovy

class Ques9 {

    static void splitAndTokenize() {

        String string = "this string needs to be split";

        println("Using tokenize:")
        println(string.tokenize());
        println(string.tokenize(" "));

        println("================================")
        println("Using split:")
        println(string.split(" "));
        println(string.split(/\s/))

        println("using tokenize")
        println(string.tokenize(/\s/))

        String str = "are.you.trying.to.split.me.mister?"

        println("===================================")
        println("another string using tokenize and split")
        println str.tokenize(".")
        println str.split(".")

    }


    static void main(String[] args) {

        splitAndTokenize();
    }
}
