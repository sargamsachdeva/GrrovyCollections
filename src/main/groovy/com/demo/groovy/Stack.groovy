package com.demo.groovy;


class Stack {
    List list = []

    Stack(list){
        this.list = list
    }

    public void push(def obj){
        list.push(obj)
    }

    public def pop(){
        return list.pop()
    }

    public def top(){
        return list.last()
    }


    @Override
    public String toString() {
        return "Stack{"+ list + "}";
    }
}
