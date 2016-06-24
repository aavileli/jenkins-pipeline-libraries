package lib

import org.codehaus.groovy.control.CompilerConfiguration
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import stubs.WorkflowStub
import utilities.ScriptLoader

import static org.hamcrest.core.IsEqual.equalTo
import static org.junit.Assert.assertThat

class PomTest {

    def pom

    @Before
    void setUp() {
        pom = ScriptLoader.load("lib/pom.groovy")

    }

    @Test
    void shouldReturnPomVersion() {
        String result = pom.version("pom.xml")
        assertThat(result, equalTo("1.0.0"))
    }

    @Test
    void shouldReturnArtifactId() {
        String result = pom.artifactId("pom.xml")
        assertThat(result, equalTo("jenkins-pipeline-libraries"))
    }

    @Test
    void shouldReturnGroupId() {
        String result = pom.groupId("pom.xml")
        assertThat(result, equalTo("com.wiprodigital"))
    }
}