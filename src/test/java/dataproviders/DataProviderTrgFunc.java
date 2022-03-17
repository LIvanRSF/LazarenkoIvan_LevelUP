package dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderTrgFunc {

    @DataProvider
    public static Object[][] tangCalcTest() {
        return new Object[][] {
            {Math.toRadians(45.0), 1.0},
            {Math.toRadians(225), 1.0}
        };
    }

    @DataProvider
    public static Object[][] catangCalcTest() {
        return new Object[][] {
            {Math.toRadians(45.0), 1.0},
            {Math.toRadians(225), 1.0}
        };
    }

    @DataProvider
    public static Object[][] cosCalcTest() {
        return new Object[][] {
            {Math.toRadians(0.0), 1.0},
            {Math.toRadians(180.0), 0.0}
        };
    }

    @DataProvider
    public static Object[][] sinCalcTest() {
        return new Object[][] {
            {Math.toRadians(90.0), 1.0},
            {Math.toRadians(270.0), -1.0}
        };
    }
}
