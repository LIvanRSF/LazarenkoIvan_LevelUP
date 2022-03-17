package testngtests;

import org.testng.annotations.BeforeMethod;
import ru.levelup.qa.at.calculator.Calculator;

public class BaseCalcTestClass {

    protected Calculator calc;

    @BeforeMethod
    public void setUp() {
        calc = new Calculator();
    }
}
