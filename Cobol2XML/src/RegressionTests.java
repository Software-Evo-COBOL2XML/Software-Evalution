import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AssemblyClassTest.class, CobolClassTests.class, XMLPayloadClassTest.class })
public class RegressionTests {

}
