package testngtests;

import dataproviders.DataProviderOtherFunc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoolCalcTest extends BaseCalcTestClass {

    @Test(dataProviderClass = DataProviderOtherFunc.class,
          dataProvider = "negCalcTest")
    public void calcIsNegativeTest(long a, boolean expectedResult) {
        boolean actualResult = calc.isNegative(a);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProviderClass = DataProviderOtherFunc.class,
          dataProvider = "posCalcTest")
    public void calcIsPositiveTest(long a, boolean expectedResult) {
        boolean actualResult = calc.isPositive(a);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
