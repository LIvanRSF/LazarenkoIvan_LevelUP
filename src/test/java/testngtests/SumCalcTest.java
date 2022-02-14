package testngtests;

import dataproviders.DataProviderSumAndMultFunc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumCalcTest extends BaseCalcTestClass {

    @Test(dataProviderClass = DataProviderSumAndMultFunc.class,
          dataProvider = "sumCalcTest")
    public void calcSumLongTest(long a, long b, long expectedResult) {
        long actualResult = calc.sum(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProviderClass = DataProviderSumAndMultFunc.class,
          dataProvider = "sumCalcTest")
    public void calcSumDoubleTest(double a, double b, double expectedResult) {
        double actualResult = calc.sum(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
