# Eteration-Test-Automation-Project

Bu repository sınav sürecimize ilişkin verilen görevlerden oluşmaktadır. Task-1, Task-2 ve Task-3'e ilişkin görevler Documents klasörü altında listelenmiştir. Task-4'te verilen test otomasyonu senaryosuna ilişkin geliştirmeler src dizini altındadır. Hazırlanan döküman ve projelere ilişkin detayları aşağıda, ilgili göreve ilişkin alt başlıkta bulabilirsiniz. 

## Task 1: Testcase preperation
Google hesap kayıt sürecini içeren fonksiyonel test senaryosu hazırlandı. İstenildiği üzere hesap kayıt sürecinin fonksiyonel olmayan üç test vakası da (performans testi, güvenlik testi, kullanılabilirlik testi) .pdf formatında hazırlanmıştır.

Test vaka çalışmasına [buradan](Documents/TASK-1/Test-Case-Preparation.pdf) ulaşabilirsiniz.



## Task 2: HTTP Rest Service Test
https://jsonplaceholder.typicode.com adresinde "/post" servisine ait http yöntemlerini içeren postman koleksiyonu oluşturulmuştur. Posts, comments ve users için olası veritabanı tablo yapılarına ait SQL scriptleri aynı klasör altına eklenmiştir.

#### postman koleksiyonu
{{env}} : https://jsonplaceholder.typicode.com  
Postman koleksiyonuna [buradan](Documents/TASK-2/http-rest-service-test-postman-collection.json) ulaşabilirsiniz.

#### olası veritabanı tabloları
Dosyaya [buradan](Documents/TASK-2/posts-comments-users-database-tables.pdf) ulaşabilirsiniz.

#### Bonus: create post collection runner with dataset
Postman collection runner dosyasına  [buradan](Documents/TASK-2/BONUS/http-rest-service-test-postman-test-run.json) ulaşabilirsiniz.



## Task 3: HTTP Soap Service Test

#### SoapUI Projesi
https://www.crcind.com/csp/samples/SOAP.Demo.cls adresindeki servislere ilişkin SoapUI projesi oluşturulmuş ve işlemler test edilmiştir.
Proje dosyasına [buradan](Documents/TASK-3/Eteration-SoapUI-Project.xml) ulaşabilirsiniz.



#### Bonus: Add Test suit with Load test in SOAPUI for a single operation without default values.
AddInteger işlemine ait yük testi SoapUI projesi olarak oluşturulmuştur.  
Proje dosyasına [buradan](Documents/TASK-3/BONUS/SOAP-Test-AddInteger-Load-Test.xml) ulaşabilirsiniz.


## Task 4: UI Testing with Selenium

https://academy.eteration.com/instructors web sitesine ait task 4'te belirtilen test senaryosu için otomasyon testi oluşturuldu. Proje hazırlanırken Behavior Driven Development, Object Orianted Programming ve SOLID yaklaşımlarına bağlı kalındı. Bağımlılıkların yönetimi Maven ile sağlandı. Proje yapısı yeni test senaryolarının eklenmesi için uygundur. 

**NOT:** Web sitesi üzerinde 6 tane eğitmen bulunmaktadır. Task'da belirtilen test senaryosunda eğitmen sayısının 8 olup olmadığının kontrol edilmesi istendiği için test verisi olarak 8 kullanılmıştır.

**Gherkin ile hazırlanmış test senaryosuna**  [buradan](src/test/java/features/Instructors.feature) ulaşabilirsiniz

**Otomasyonun ayağa kaldırılması;**
src/test/resources/TestNG.xml dizinindeki test suite üzerinden proje ayağa kaldırılır.

Teknoloji  | Kullanıldığı Yer
------------- | -------------
Java | Test senaryolarına ilişkin aksiyonlar
Selenium Web Driver | Tarayıcı otomasyonu
Cucumber | BDD yaklaşımıyla test senaryolarının yazılması
TestNG | Testlerin Düzenlenmesi, Ek Test yapıları, Assertions
