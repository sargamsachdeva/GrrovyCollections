package com.demo.groovy

class Ques18 {

    static void main(String[] args) {

        Map map = ['sargam':23, 'priya':25, 'ankit':32, 'rahul':21,1:'s'];

        println(map.getClass());

        /*
        We are supposed to be able to access the entries in the map like

        m.sargam (in above map).
        in other words, access into the map is like getting a property on the map object. If

        m.class returned the class, it would break those semantics, because 'class' is not a key added to the map

        So, it returns null
         */
        println map.class

    }
}
