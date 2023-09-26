package com.chenj.groovy


//assert 1+2 == 6
//循环
//def x = 0
//for ( i in 0..3 ) {
//    x += i
//}
//println("x:"+x);
//assert x==5;
//println("-------------------");
//for(int i=0;i<5;i++){
//    println("i:"+i);
//}

//def x = 16
//def result = ""
//
//switch ( x ) {
//    case "ok":
//        result = "found ok"
//    case [1, 2, 4, 'list']:
//        result = "list"
//        break
//    case 10..19:
//        result = "range"
//        break
//    case Integer:
//        result = "integer"
//        break
//    default:
//        result = "default"
//}
//
//println("result:"+result);

def str = 'Android进阶解密';
println("str:"+str);
println("----------------")
def name = 'Android进阶之光'
println "hello ${name}"
println "hello $name"
println "------------------------------"
def str2 = '''Android进阶之光
                    Android进阶解密
Android进阶？'''
println str2

println "------------------------------"

//集合
//def number = [1, 2, 3]
//for (i in number) {
//    println("i:"+i);
//}
//
//def linkedList = [1, 2, 3] as LinkedList
//assert linkedList instanceof java.util.LinkedList
//集合
def number  = [1, 2, 3, 4]
assert number [1] == 2
assert number [-1] == 4 //1

number << 5     //2  追加一个元素
assert number [4] == 5
assert number [-1] == 5




