package testngtests;

import dataproviders.DataProviderTrgFunc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrigoCalcTest extends BaseCalcTestClass {

    @Test(dataProviderClass = DataProviderTrgFunc.class,
          dataProvider = "tangCalcTest")
    public void calcTangDoubleTest(double a, double expectedResult) {
        double actualResult = calc.tg(a);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProviderClass = DataProviderTrgFunc.class,
          dataProvider = "catangCalcTest")
    //негативный тест, т.к. в калькуляторе в методе Катангенс используется функция вызова Тангенса
    public void calcCatangDoubleTest(double a, double expectedResult) {
        double actualResult = calc.ctg(a);
        Assert.assertNotEquals(actualResult, expectedResult);
    }

    @Test(dataProviderClass = DataProviderTrgFunc.class,
          dataProvider = "cosCalcTest")
    //негативный тест, т.к. в калькуляторе в методе Косинус используется функция вызова Синуса
    public void calcCosDoubleTest(double a, double expectedResult) {
        double actualResult = calc.cos(a);
        Assert.assertNotEquals(actualResult, expectedResult);
    }

    @Test(dataProviderClass = DataProviderTrgFunc.class,
          dataProvider = "sinCalcTest")
    public void calcSinDoubleTest(double a, double expectedResult) {
        double actualResult = calc.sin(a);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
