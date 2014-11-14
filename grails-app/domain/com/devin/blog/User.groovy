package com.devin.blog

class User {
    String firstName
    String lastName
    String email
    String status
    Date createdAt

    static hasMany=[posts:Post]

    static constraints = {
       firstName size: 1..15
       email blank: true,nullable: true,email: true
       status inList: ['Active','Inactive']
    }
}
