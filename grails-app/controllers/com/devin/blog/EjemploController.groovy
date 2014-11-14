package com.devin.blog

import grails.converters.JSON
import com.devin.blog.User
import com.devin.blog.Post
import org.springframework.transaction.annotation.*

class EjemploController {

    def index() {
       def usuarios=User.list()
       [usuarios:usuarios]
       // ---->> Estos son ejemplos

       //def consulta=User.findAllByEmailLikeAndFirstNameLike('%AA%','Pa%')
       //[listaUsuarios:usuarios]

       /*
       def consulta=User.withCriteria{
           like('email','%aa%')
	   and{
	       like('firstName','Pa%')
	   }
       }

       def consulta=Post.withCriteria(){
           user{
	       eq('firstName','Alex')
	   }
       }
       render consulta as JSON
       */
    }

    def edit(User userInstance){
        println userInstance as JSON
    	[userInstance:userInstance]
    }

    @Transactional
    def update(User userInstance){
        println params
	println userInstance

        userInstance.save(flush:true)
	redirect action:'index'
    }
}
