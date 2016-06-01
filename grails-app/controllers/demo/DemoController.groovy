// grails-app/controllers/demo/DemoController.groovy
package demo

class DemoController {

    def index() {
        def p = new Pet()
        p.validate()
        def hasErrors = p.hasErrors()

        render "Has Errors? $hasErrors"
    }
}
