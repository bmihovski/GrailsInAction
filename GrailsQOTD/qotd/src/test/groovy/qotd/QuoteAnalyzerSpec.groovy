package qotd

import org.grails.testing.GrailsUnitTest
import spock.lang.Specification

class QuoteAnalyzerSpec extends Specification implements GrailsUnitTest {

	@Shared quotes = [
		new Quote(author: "Peter Ledbrook",
			content: "Time waits for no man"),
		new Qoute(author: "Glen Smith",
			content: "Groovy")
		]
    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
        true == false
    }
}