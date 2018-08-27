package sandbox_v3213

import com.example.HelperBean
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(MyDomain)
class MyDomainSpec extends Specification {

    // This doesn't work
    static doWithSpring = {
        helperBean(HelperBean)
    }

    void "helper bean is injected"() {

        given: 'an instance'
        def instance = new MyDomain(name: 'foo')
        instance.save(failOnError: true)

        expect: 'helper bean exists'
        instance.helperBean != null

    }
}
