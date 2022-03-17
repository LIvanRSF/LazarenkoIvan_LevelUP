package testngtests;

import dataproviders.DataProviderOtherFunc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PowSqrtCalcTest extends BaseCalcTestClass {

    @Test(dataProviderClass = DataProviderOtherFunc.class,
          dataProvider = "powCalcTest")
    public void calcPowDoubleTest(double a, double b, double expectedResult) {
        double actualResult = calc.pow(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProviderClass = DataProviderOtherFunc.class,
          dataProvider = "sqrtCalcTest")
    public void calcSqrtDoubleTest(double a, double expectedResult) {
        double actualResult = calc.sqrt(a);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
