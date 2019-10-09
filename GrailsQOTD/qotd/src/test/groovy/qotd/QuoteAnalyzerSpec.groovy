package qotd

import qotd.Quote
import org.grails.testing.GrailsUnitTest
import spock.lang.Specification

class QuoteAnalyzerSpec extends Specification implements GrailsUnitTest {

	@Shared quotes = [
		new Quote(author: "Peter Ledbrook",
			content: "Time waits for no man"),
		new Qoute(author: "Glen Smith",
			content: "Groovy solves all problems")
		]

	@Unroll
	def "total numbers of quotes"() {
		given: "An analyzer initialized with known quotes"
		def analyzer = new QuoteAnalyzer(inputQuotes)
		
		when: "I ask for quote count"
		def quoteCount = analyzer.quoteCount
		
		then: "The total number of quote count"
		quoteCount == expected
		
		where:
		inputQuotes  | expexted
			[]       |    0
			quotes   |    2
	}
	
	@Unroll
	def "Numbers of quotes per author"() {
		given: "An analyzer initialized with known quotes"
		def analyzer = new QuoteAnalyzer(quoteList)
		
		expect: "Then per-author quote count is correct"
		expected == analyzer.quoteCountPerAuthor
		
		where:
		quoteList     |   expected
		    []        |   [:]
			quotes    |   ["Peter Ledbrook": 1, "Glen Smith": 1]
	}
	
}