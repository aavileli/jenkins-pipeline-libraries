package lib

import org.junit.Before
import org.junit.Test
import utilities.AssertCommandAndExecute
import utilities.ScriptLoader

import static org.hamcrest.CoreMatchers.equalTo
import static org.junit.Assert.assertThat
import static utilities.AssertAndExecute.assertCommandRegexAndExecute

class DateTest implements AssertCommandAndExecute {

    def date

    @Before
    void setUp() {
        date = ScriptLoader.load("lib/date.groovy")
    }

    @Test
    void shouldPipeResult() {
        def result = date.timestamp(new Date(20160624100859))
        assertThat(result as String, equalTo("26081112132140"))
    }
}