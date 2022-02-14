package dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderSumAndMultFunc {

    @DataProvider
    public static Object[][] sumCalcTest() {
        return new Object[][] {
            {2, 4, 6},
            {3, 1, 4},
            {7, 2, 9}
        };
    }

    @DataProvider
    public static Object[][] multCalcTest() {
        return new Object[][] {
            {3, 4, 12},
            {2, 5, 10}
        };
    }
}
