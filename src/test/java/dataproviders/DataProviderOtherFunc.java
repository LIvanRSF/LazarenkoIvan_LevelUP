package dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderOtherFunc {

    @DataProvider
    public static Object[][] powCalcTest() {
        return new Object[][] {
            {3, 4, 81},
            {2, 5, 32}
        };
    }

    @DataProvider
    public static Object[][] sqrtCalcTest() {
        return new Object[][] {
            {9, 3},
            {16, 4}
        };
    }

    @DataProvider
    public static Object[][] negCalcTest() {
        return new Object[][] {
            {-3, true},
            {3, false}
        };
    }

    @DataProvider
    public static Object[][] posCalcTest() {
        return new Object[][] {
            {3, true},
            {-3, false}
        };
    }
}
