package com.chenj.groovy

//闭包

//{println "hello,Closure"}

//第一步：定义闭包

//def running = {param ->println param}
//def running = {it ->println it}
//def running = {println it}

//running(123);//第二步：调用闭包
//
//def abc= { String a, String b ->
//    println "${a} is a ${b}"
//}
//
////abc("aaaa","bbbb");
//abc "aaaa","bbbb"
//abc.call("aaaa","bbbb");//调用闭包


//闭包作为方法的参数

//无参数的闭包
def test1(Closure wwww){
    println "test1 start......"
    wwww();//调用闭包
    println "test1 end......"
}

test1 ({println("hello,closure")})

println("---------------------------");
//有参数的闭包
def test2(Closure closure){
    int a = 100;
    int b = 200;
    println "test1 start......"
   def result =closure(a,b);//调用闭包
    println("result:"+result)
    println "test1 end......"
}
test2 {a,b-> a+b}