# BOOTCAMP ÖDEV-2

- Unit test nedir ?
- JUNIT nedir ?
- [demoqa.com/webtables](https://demoqa.com/webtables) 
sayfasındaki search için Junit testi yazılacak.

## :pushpin: SELENIUM VE JUNIT TEST ÖRNEĞİ



[Oluşturduğum selenium metodları](https://github.com/enuygun-test-automation-bootcamp/homework2-mkaganm/blob/main/src/main/java/com/demoqa/Automation.java)

[Unit testleri](https://github.com/enuygun-test-automation-bootcamp/homework2-mkaganm/blob/main/src/test/java/com/demoqa/AutomationTest.java)

## :pushpin: UNIT TEST NEDİR ?

Unit test bir yazılımın test edilebilir 
parçalarının bağımsız bir şekilde test edilmesine
denir. Yazılımın en küçük parçası olarak 
fonksiyonlar (java için metodlar) unit testte test 
edilir. Unit testin amacı her fonksiyonun, metodun
tasarlandığı şekilde gerçekleştiğini doğrulamaktır.
Kodda refactor yapmayı kolaylaştırır. Fonksiyonlar
ayrı ayrı izole şekilde test edildiğinden tüm
hataları ortaya çıkarmaz. 


## :pushpin: JUNIT NEDİR ?

Junit java tabanlı kodlar için kullanılan bir Unit
Test kütüphanesidir.

Oluşturduğum örneklere aşağıdaki linklere tıklayarak gidebilirsiniz.


[Calculator metodları](https://github.com/enuygun-test-automation-bootcamp/homework2-mkaganm/blob/main/src/main/java/com/demoqa/Calculator.java)

[Calculator metodları için unit testleri](https://github.com/enuygun-test-automation-bootcamp/homework2-mkaganm/blob/main/src/test/java/com/demoqa/CalculatorTest.java)

## :pushpin: JUNIT NOTASYONLARI

- @BeforeClass
- @AfterClass 
- @Before
- @After
- @Test
- @Ignore

### @BeforeClass

Bütün testler çalışmadan önce çalışacak metodtur.

### @AfterClass

Bütün testler bittikten sonra çalışacak metodtur.

### @Before

Test adımlarından önce çalışmaktadır.

### @After

Test metodlarından sonra çalışmaktadır.

### @Test

Test notasyonu içerisinde testimizde yer alacak
adımları tanımlarız.

### @Ignore

Yazdığımız test metotlarının çalıştırılmasını 
istemiyorsak bu amaç ile kullanabileceğimiz bir 
notasyondur.
