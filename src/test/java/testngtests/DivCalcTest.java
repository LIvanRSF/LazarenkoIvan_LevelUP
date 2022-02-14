package testngtests;

import dataproviders.DataProviderSubAndDivFunc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivCalcTest extends BaseCalcTestClass {

    @Test(dataProviderClass = DataProviderSubAndDivFunc.class,
          dataProvider = "divCalcTest")
    public void calcDivLongTest(long a, long b, long expectedResult) {
        long actualResult = calc.div(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProviderClass = DataProviderSubAndDivFunc.class,
          dataProvider = "divCalcTest")
    public void calcDivDoubleTest(double a, double b, double expectedResult) {
        double actualResult = calc.div(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
