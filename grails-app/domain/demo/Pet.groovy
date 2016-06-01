// grails-app/domain/demp/Pet.groovy
package demo

class Pet {
    String name

    static constraints = {
        name(nullable: false, blank: false)
    }
}
