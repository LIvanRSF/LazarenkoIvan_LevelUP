package testngtests;

import dataproviders.DataProviderSumAndMultFunc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultCalcTest extends BaseCalcTestClass {

    @Test(dataProviderClass = DataProviderSumAndMultFunc.class,
          dataProvider = "multCalcTest")
    public void calcMultLongTest(long a, long b, long expectedResult) {
        long actualResult = calc.mult(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProviderClass = DataProviderSumAndMultFunc.class,
          dataProvider = "multCalcTest")
    public void calcMultDoubleTest(double a, double b, double expectedResult) {
        double actualResult = calc.mult(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
