// test/unit/demo/PetSpec.groovy
package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(Pet)
class PetSpec extends Specification {

    void "test constraints"() {
        expect:
        !new Pet().validate()
    }
}
