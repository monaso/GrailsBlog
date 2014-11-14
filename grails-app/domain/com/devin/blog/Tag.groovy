package com.devin.blog

class Tag {
    String name
    Date createdAt

    static hasMany=[posts:TagPost]

    static constraints = {
        name unique: true
    }

    static mapping = {
        table name: 'Tag'
        id column: 'IdTag'
	name column: 'NAME'
    }
}
