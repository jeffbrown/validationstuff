// grails-app/conf/BootStrap.groovy
class BootStrap {

    def init = { servletContext ->
        def pet = new demo.Pet()
        pet.validate()

        println "Has Errors? ${pet.hasErrors()}"
    }
    def destroy = {
    }
}
