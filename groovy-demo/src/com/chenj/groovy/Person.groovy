package com.chenj.groovy



class Person {
    String name
    Integer age =10
    def increaseAge(Integer years) {
        this.age += years
    }
}


