package com.chenj.groovy


//方法
def add(int a,int b) {
    println a+b //3
}
//def minus(a,b) {//2
//    println a-b
//}

add(23,34)
//minus(12,2)

int minus(a,b) {
     //return a-b
    a-b
}
def number=minus 1,2
println number

println("--------------------------------");
def p = new Person();
p.increaseAge(23);
println("age:"+p.getAge());

