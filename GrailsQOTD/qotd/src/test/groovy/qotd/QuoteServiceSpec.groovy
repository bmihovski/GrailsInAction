package qotd

import grails.testing.gorm.DataTest
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification


class QuoteServiceSpec extends Specification implements ServiceUnitTest<QuoteService>, DataTest {

    void "when static quote service then always returns quiche quote"() {

		when:
		Quote staticQuote = service.getStaticQuote()
		
		then:
		staticQuote.author == "Anonymous"
		staticQuote.content == "Real Programmers Don't eat much Quich"
    }
}
