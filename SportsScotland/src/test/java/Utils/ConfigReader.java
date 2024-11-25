package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

public static Properties initializeProperties() throws FileNotFoundException {

Properties prop = new Properties();

File proFile = new File(System.getProperty("user.dir")+ "\\src\\test\\resources\\Config\\config.properties");

FileInputStream fis = new FileInputStream(proFile);

try {
prop.load(fis);
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

return prop;


}
}