package com.vytrack.pages;

public class FurkanHCucumberApril21 {
    /**
     * /**
     *      * Behavior Driven Testing:
     *      * firmalarda degisik isleyis yontemleri var biz burada iki tanesinden bhasedicez bdd tdd
     *      * tdd: once test hazirlaniyor bu teste gore testi gecen ilk fonksiyonlar yazliyor.
     *      * reply buna enguzel ornek.test ede ede once cozumu buluyorum.codu yazdigimiz codu testin olusan kalibin icine
     *      * sokuyoruz.unit testing asamasinda bunu test ediyoruz sonra integration ve system testim var..
     *      * write unit test testng ile test hazirliyoruz ve calistiriyoruz avantajlari surekli gelistirmeye calisiyoruz boylelilkle
     *      * daha kaliteli oluyor
     *      * dezavantajlari: requirementler developerlarin bakis acisiyla yazilmis. bu modelde buyuk bir teknik alt yapi lazim
     *      * kodelarin isleyisi ..vs
     *      * bdd:
     *      * takim halinde urun yada software kullanmak icin olusan bir system?
     *      * hem business tarafai hem dev tarafi uzerinde konussun tartissin diye feature olusturuyoruz ayni pencereden
     *      * bakmak icin
     *      * @login
     *      * Feature: user story olustur
     *      * simdi sirada AC var onlari yaz ve gelistir tdriven dev de hazir birsekilde geliyordu
     *      * ama bdd business tarafi hangi steplerden gectigini goruyor
     *      * Agile story ile US olustur(feature)
     *      * oncelikle user typelari belirliyoruz ve 3 ayri scenario olusturuluyor.mesela sales manager ile giris yap
     *      * ve main page ulas bunun icin login sayfasina ihtiyacimiz var bu bizim butun seneryolarda olmasi gereken step!
     *      * her stepde login sayfasina ulasmam gerekiyor dolayisiyla benim "background" olusturmam lazim yani before method
     *      * after method gibi bu olusturdugumuz stepler gherkin language key wordleri!!!!!!
     *      * oyuzden backround adi aldinda bir kere olustrup birdaha tek tek yazmama gerek yok
     *      * background before icin!!!!
     *      * hook sadece testlerden once ve sonra ne yailmasini gosteriyor
     *      * 3 tane ayniseyler var sadece user degisiyor ozaman ne yapicaz scenario outline olusturmamiz gerekiyor
     *      * boylelikle 3unu ayni yerde topluyoruz 3 user seneryosunu birlestiriyoruz. example ilede userlari degiskenleri belirliyoruz
     *      * ama buradaki ayrinti degiskenleri scenarioda parameter ile belirlemek
     *      * parameter nasil koyacagiz <> ile!
     *      * sceanarioda nasil olacak bu ensona <userName> herbir stepde!
     *      * step definition:
     *      * hook class tanimliyoruz o da classlari initialize yaparken background altina koyuyoruz mesela hookda before koyuyoruz ki
     *      * ama ozellikle after icin tanimliyacagimiz codelarda kullaniyoruz
     *      * mesela after value verdim driver ile parameter veriyorum veinitialize yapiyorum.
     *      * printf: check journaldev.com mesela ne icin -->string icin %s kullaniyoruz , koyuyoruz ve stringi yaziyoruz
     *      * boylelikle bize gelmesini istedigimiz yere geliyor
     *      * hook run etmek icin degilde dahabir specific hale getirsin diye main purpose
     *      * runner:
     *      * asil run kismi cucumber icin @runwith: diyor ki sen bunu java ile degilde cucumber olarak calistir.cucumber
     *      * feature ile step definition arasindaki bagi sagliyor.
     *      * cucumberoptions:(
     *      * glue="buraya koyacagimiz path sadece package icermesi gerekiyor",
     *      * javada nereden basliyor com->vytrack->stepdefinitions
     *      * features="scenariolari degisik user functionlara gore olusturdugumuz scenariolari biriktirdigimiz kisim"
     *      * genkins languagedan geliyor when then and given mesela websitemizde bulunan activities module icin olusturdugumuz
     *      * seneryolari execute etmek icin ayri bir yer olusturabiliriz features altinda ayrica daha specific hale getirebiliyoruz
     *      * dryrun true yaparsam bu scenariolari ve onlarin tanimlandigi stepleri test ediyor. false oldugu yazaman
     *      * run yapiyor
     *      * strict:eger true yaparsak ve tanimlanmamissa onu skip etmeye yariyor.featuresda olusan sari cizgilerin anlami
     *      * sen beni olustrudun ama henuz tanimlamadin.active yapmadin.
     *      * tags: neyi sadece execute yapmak istiyorsam onu veriyor.
     *      *dryRun feature ve step definition birbirini karsiliyormu ona bakiyoruz.
     *      run yaparken diyelim undefined stepler var onlari ne yapacagiz rundan calistirip snipped copy paste yapicaz yada
     *      featuresa git sag click automatically paste yapiyor
     *      strict false olursa warning olarak geliyor sadece true olursa sana stepleri veriyor
     *      strict hicbirsey yazamasak bile default olarak false giriyor.
     *      plugins="iki tane kucuk programcik onlar vasitasiyla rapor olusturuyoruz."raporlarda mesela stepleri gosteriyor
     *      ensonda hook ile nasil kapatmis onu gosteriyor
     *      raporu olusturmak icin once testi execute etmemiz gerekiyor normal birsekilde.projem bitti logini execute yaiyorum
     *      rapor filan hicbirsey yok suanda.cucumber kendi raporunu olustruabiliyor->cucumber html reports ve json ile olusturuyoruz onu yapmak
     *      icin mavendan verify yapmamiz gerekiyor cucumberdan ayri oldugu icin
     *      parallel run:
     *      pom icine dependecy ekliyoruz parallel run icin
     *      featuresda then de modulalara iki tane single quota yada double quote yazarsak step definitionda onlari bana
     *      string parameter olarak return yapiyor.dahasonra methodun icine onlari specific yapabiliyoruz.
     *      scenario->step_definition->methodun icerisine tasidik
     *      data table on feature:
     *      sub module ana module icin yazmak herdefasinda bundan kacinmak icin featuresda bunlari belirlememiz gerekiyor eher bir tane ise
     *      list olustururuz ..cunku herbir stepde tek bir dataya ihtiyacim var.iki tane olduguda map kullaniyoruz mesela iki tane ana module
     *      var ozaman key value eslestirmesi yapiyoruz.ikiden fazla olursa list of map yapiyoruz.
     *      */

}
