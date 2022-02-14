package dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderSubAndDivFunc {

    @DataProvider
    public static Object[][] subCalcTest() {
        return new Object[][] {
            {7, 4, 3},
            {3, 1, 2}
        };
    }

    @DataProvider
    public static Object[][] divCalcTest() {
        return new Object[][] {
            {44, 4, 11},
            {100, 5, 20}
        };
    }
}
