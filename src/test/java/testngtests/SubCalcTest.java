package testngtests;

import dataproviders.DataProviderSubAndDivFunc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubCalcTest extends BaseCalcTestClass {

    @Test(dataProviderClass = DataProviderSubAndDivFunc.class,
          dataProvider = "subCalcTest")
    public void calcSubLongTest(long a, long b, long expectedResult) {
        long actualResult = calc.sub(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProviderClass = DataProviderSubAndDivFunc.class,
          dataProvider = "subCalcTest")
    public void calcSubDoubleTest(double a, double b, double expectedResult) {
        double actualResult = calc.sub(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
