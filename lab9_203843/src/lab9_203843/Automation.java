package lab9_203843;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Automation {

    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "73429d13");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.coloros.calculator");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator");
        dc.setCapability("udid", "73429d13");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

        MobileElement el5 = (MobileElement) ad.findElementById("com.coloros.calculator:id/digit_1");
        el5.click();
        MobileElement el6 = (MobileElement) ad.findElementByAccessibilityId("Add");
        el6.click();
        MobileElement el7 = (MobileElement) ad.findElementById("com.coloros.calculator:id/digit_1");
        el7.click();
        MobileElement el8 = (MobileElement) ad.findElementByAccessibilityId("Equals");
        el8.click();

        Assert.assertEquals(ad.findElementById("com.coloros.calculator:id/result").getText(), "2");


    }
}