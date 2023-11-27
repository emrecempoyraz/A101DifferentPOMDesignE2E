package TestManager;

import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class DriverOptions {

    private final static ChromeOptions options = new ChromeOptions();

    private static List <String> setOptions (boolean headless) {
        List < String > arguments = new ArrayList<>();
        arguments.add("--disable-notifications");
        arguments.add("--disable-extensions");
        arguments.add("--disable-popup-blocking");
        arguments.add("--remote-allow-origins=*");
        if (headless) {
            arguments.add("--headless");
        }

        return arguments ;

    }

    static ChromeOptions getOptions () {
        return options.addArguments(setOptions(IOptions.HEADLESS));
    }


}
