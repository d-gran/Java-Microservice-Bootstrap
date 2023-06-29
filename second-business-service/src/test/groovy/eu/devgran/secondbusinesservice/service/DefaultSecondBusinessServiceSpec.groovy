package eu.devgran.secondbusinesservice.service

import spock.lang.Specification

class DefaultSecondBusinessServiceSpec extends Specification {

    DefaultSecondBusinessService underTest
    FirstBusinessServiceClient firstBusinessServiceClientMock

    void setup() {
        firstBusinessServiceClientMock = Mock()
        underTest = new DefaultSecondBusinessService(firstBusinessServiceClientMock)
    }

    def "callFirst() should be invoked once"() {
        when:
        underTest.callFirst()
        then:
        1 * firstBusinessServiceClientMock.callFirst()
    }
}
