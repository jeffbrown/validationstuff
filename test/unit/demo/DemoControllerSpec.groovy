// test/unit/demo/DemoControllerSpec.groovy
package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DemoController)
@Mock(Pet)
class DemoControllerSpec extends Specification {

    void "test validation"() {
        when:
        controller.index()

        then:
        response.text == 'Has Errors? true'
    }
}
