package com.devin.blog

class Category {
    String name
    Date createdAt

    static hasMany=[posts:Post]

    static constraints = {
        name unique: true
    }
}
