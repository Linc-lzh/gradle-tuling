package com.chenj.groovy

class HelloWorld {
    static void main(String[] args) {
        println("groovy,hello,world!!");
        //变量
        def age = 12;
        println("age:"+age);
        def name = "zhangsan";
        println("name:"+name);

        println("-------------------------------");

        add(23,34);

    }


    static def add(int a,int b) {
        println a+b //3
    }
    def minus(a,b) {//2
        println a-b
    }
}
