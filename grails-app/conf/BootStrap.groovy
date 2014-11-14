import com.devin.blog.User
import com.devin.blog.Category
import com.devin.blog.Post

class BootStrap {

    def init = { servletContext ->

       def categoria=new Category(name:'Blog',createdAt:new Date())
       categoria.save(flush:true)

       def usuario=new User(firstName:'Alex',lastName:'Oviedo',email: 'alexove@fedoraproject.org',status:'Active',createdAt:new Date())
       
       usuario.addToPosts(new Post(title:'Post 1',slug:'xyz',content:'Hola mundo',createdAt:new Date(),category:categoria))

       usuario.save(flush:true)

       new User(firstName:'Paul',lastName:'Flores',email:'aa@bb.cc',status:'Active',createdAt:new Date()).save(flush:true)
       new User(firstName:'Abel',lastName:'Vargas',email:'aa@bb.cc',status:'Active',createdAt:new Date()).save(flush:true)
       new User(firstName:'Cintia',lastName:'Fernandez',email:'aa@bb.cc',status:'Active',createdAt:new Date()).save(flush:true)
       new User(firstName:'Jennifer',lastName:'Farfan',email:'aa@bb.cc',status:'Active',createdAt:new Date()).save(flush:true)
    }
    def destroy = {
    }
}
