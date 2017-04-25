package com.demo.groovy

class Q15 {

    public static void main(String[] args) {

        Stack s = new Stack(['Groovy', 'is', 'great!']);
        println s
        println s.pop()

        s.push('rocks!')

        println s

    }
}
