# Homework1

-
    1) Sınıfları kullanırken implement ve extend ile çağırabiliyoruz. İkisini aynı anda kullanınca hangisi önce
       yürütülür ?
-
    2) Internal ne olduğu araştırılacak.
-
    3) Abstraction ne olduğu araştırılacak ve abstractiona örnek bir kod yazılacak.

## 1

### :pushpin: Hem Extend Hem Implement Etmek

Bir class sadece bir class'ı extend edebilir.
Ancak aynı anda bir class’ı extend edip bir veya
daha fazla interface'i implement edebilir.
Çünkü ’extends’ keywordünün aksine, 'implements'
demek yoluyla bir class'ın aldığı hiç bir şey yoktur.
Sadece bazı method’ları
implement etmeyi taahüt etmektedir.
Bir A class’ı hem B classını extend edebilir hem
de C inetrface'ni implement edebilir.

``` Java
    public class A extends B implements C{
        // ...
    }
```

Bunu yaparken extend'i implement'ten önce tanımlamak
gerekir.
Herhangi bir sayıda interface implement edilebilir
fakat virgül ile ayrılmalıdır.

Bu durumda extend daha önce yürütülür.

## 2

### :pushpin: Internal

Javada internal in olmadığını gördüm. Ancak benzer
kullanım için aşağıya bulduğum örneği bırakıyorum.

[ÖRNEK](http://www.javacamp.org/javavscsharp/internal.html)

## 3

### :pushpin: Abstract

Inheritance ile bir üst class tanımlayabiliyorduk,
burda özelliklerimiz ve metodlarımız olabiliyordu.
Alt classları burdan türeterek bu özellikleri ve
metodları miras alabiliyorduk.
Interface ile gövdesiz metodlarımızı yazıyorduk ve
bunu implement eden tüm alt classlarda bunları
kendimize göre yazabiliyorduk.

**Abstract classlar inheritance ve interface
classların birleşimi gibi düşünülebilir. Abstract
classlarda özelliklerimizi, metodlarımızı
yazabiliyoruz. Ve aynı zamanda gövdesiz metodlarımızı
yazabiliriz.**

Abstract(soyutlama) kavramı sınıfın içindeki iç
işleyişi dışarıdan izole etmek, yani gizlemektir.
Örneğin: bilgisayarı kullanırken çoğu kullanıcı
bilgisayarın iç işleyişinden haberi olmaz.

```Java
public abstract class Aclass {

    protected double xVar;
    protected double[] yVar;

    public double[] getyVar() {
        return yVar;
    }

    public void setyVar(double[] yVar) {
        this.yVar = yVar;
    }

    public double getxVar() {
        return xVar;
    }

    public void setxVar(double xVar) {
        this.xVar = xVar;
    }

    // SOYUT METOD ÖRNEĞİ
    public abstract double method1();
}
```

```JAVA
public class SubAclassOne extends Aclass {

    public Method1Aclass(double xVar) {
        super.setxVar(xVar);
    }

    @Override
    public double method1() {

        return super.getxVar() + super.getxVar() * 0.5;
    }
}

public class SubAclassTwo extends Aclass {

    public UpdateAclass(double xVar, double[] yVar) {
        super.setxVar(xVar);
        super.setyVar(yVar);
    }


    @Override
    public double method1() {
        //
        //
    }
}

