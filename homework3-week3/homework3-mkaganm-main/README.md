# HOMEWORK-3

## PROFİL İLE DRİVER BAŞLATMA

Başlatmak istediğiniz profil yolunu options a tanımlayarak tarayıcıyı bir profil ile başlatabilirsiniz.

```JAVA
        // * chrome options
        ChromeOptions options = new ChromeOptions();
        // * options for chrome window start maximized
        options.addArguments("--start-maximized");
        // * path of profile
        String profilePath = "C:\\Users\\mkaga\\AppData\\Local\\Google\\Chrome\\User Data";
        // * path of profile added to options
        options.addArguments("user-data-dir=" + profilePath);
        // * The settings added to the options variable were given to the driver when defining the driver.
        WebDriver driver = new ChromeDriver(options);
```

[Buraya tıklayarak örneğe gidebilirsiniz.](https://github.com/enuygun-test-automation-bootcamp/homework3-mkaganm/blob/main/src/main/java/org/example/OpenWithProfile.java)

## QUICK START PACKAGE

Aşağıdaki linklere tıklayarak oluşturduğum quick-start paketime göz atabilirsiniz.

[Tüm paket](https://github.com/enuygun-test-automation-bootcamp/homework3-mkaganm/tree/main/src/main/java/MKaganM)

[FindPath](https://github.com/enuygun-test-automation-bootcamp/homework3-mkaganm/blob/main/src/main/java/MKaganM/FindPath.java) - Driver yollarını ayarlamak için oluşturduğum sınıf

[DriverType](https://github.com/enuygun-test-automation-bootcamp/homework3-mkaganm/blob/main/src/main/java/MKaganM/DriverType.java) - Enum sınıfı

[Drivers](https://github.com/enuygun-test-automation-bootcamp/homework3-mkaganm/blob/main/src/main/java/MKaganM/Drivers.java) - Diğer sınıfların miras aldığı abstract sınıfı

[DriverChrome](https://github.com/enuygun-test-automation-bootcamp/homework3-mkaganm/blob/main/src/main/java/MKaganM/DriverChrome.java) - Chrome driver işlemlerinin olduğu sınıf

[DriverEdge](https://github.com/enuygun-test-automation-bootcamp/homework3-mkaganm/blob/main/src/main/java/MKaganM/DriverEdge.java) - Edge driver işlemlerinin olduğu sınıf

[DriverFirefox](https://github.com/enuygun-test-automation-bootcamp/homework3-mkaganm/blob/main/src/main/java/MKaganM/DriverFirefox.java) - Firefox driver işlemlerinin olduğu sınıf

## LOGIN PAGE AND REGISTER PAGE

[Enuygun](https://github.com/enuygun-test-automation-bootcamp/homework3-mkaganm/blob/main/src/main/java/org/example/Enuygun.java) - Enuygun ana sayfa işlemlerinin bulunduğu sınıf

[EnuygunLoginPage](https://github.com/enuygun-test-automation-bootcamp/homework3-mkaganm/blob/main/src/main/java/org/example/EnuygunLoginPage.java) - Enuygun giriş yap sayfasının işlemlerinin bulunduğu sınıf

[EnuygunRegisterPage](https://github.com/enuygun-test-automation-bootcamp/homework3-mkaganm/blob/main/src/main/java/org/example/EnuygunRegisterPage.java) - Enuygun kayıt ol sayfasının işlemlerinin bulunduğu sınıf
