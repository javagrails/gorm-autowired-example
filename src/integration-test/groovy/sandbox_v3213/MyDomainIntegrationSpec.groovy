package sandbox_v3213

import grails.test.mixin.integration.Integration
import grails.transaction.Rollback
import spock.lang.Specification

@Integration
@Rollback
class MyDomainIntegrationSpec extends Specification {

    void "helper bean is injected"() {

        given: 'an instance'
        def instance = new MyDomain(name: 'foo')
        instance.save(failOnError: true)

        expect: 'helper bean exists'
        instance.helperBean != null

    }
}
