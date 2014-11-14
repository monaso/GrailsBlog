package com.devin.blog

class Post {
    String title
    String slug
    String content
    Date createdAt
    Date updatedAt

    // Relaciones
    static belongsTo=[user:User,category:Category]
    static hasMany=[tags:TagPost]

    static constraints = {
        updatedAt blank: true, nullable: true
	content size: 0..20000
    }
}
