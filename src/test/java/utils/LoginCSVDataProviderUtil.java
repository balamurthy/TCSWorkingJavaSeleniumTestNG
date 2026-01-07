package utils;
import org.testng.annotations.DataProvider;

public class LoginCSVDataProviderUtil {

    @DataProvider(name = "csvLoginData")
    public Object[][] getLoginData() {

        return CSVUtils.readData(
            "src/test/resources/testdata/testdata.csv"
        );
    }
}
