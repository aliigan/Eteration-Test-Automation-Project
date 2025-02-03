# Eteration-Test-Automation-Project

Bu repository sınav sürecimize ilişkin verilen görevlerden oluşmaktadır. Hazırlanan döküman ve projelere ilişkin detayları aşağıda, ilgili göreve ilişkin alt başlıkta bulabilirsiniz.

## Task 1: Testcase preperation
Google hesap kayıt sürecini içeren fonksiyonel test senaryosu hazırlandı. İstenildiği üzere hesap kayıt sürecinin fonksiyonel olmayan üç test vakası da (performans testi, güvenlik testi, kullanılabilirlik testi) .pdf formatında hazırlanmıştır.

Dosya dizini: Documents/TASK-1/Test-Case-Preparation.pdf


## Task 2: HTTP Rest Service Test
https://jsonplaceholder.typicode.com adresinde "/post" servisine ait http yöntemlerini içeren postman koleksiyonu oluşturulmuştur. Posts, comments ve users için olası veritabanı tablo yapılarına ait SQL scriptleri aynı klasör altına eklenmiştir.

#### postman koleksiyonu
{{env}} : https://jsonplaceholder.typicode.com  
Dosya dizini: Documents/TASK-2/http-rest-service-test-postman-collection.json

#### olası veritabanı tabloları
Dosya dizini: Documents/TASK-2/posts-comments-users-database-tables.pdf

#### Bonus: create post collection runner with dataset
Dosya dizini: Documents/TASK-2/BONUS/http-rest-service-test-postman-test-run.json


## Task 3: HTTP Soap Service Test

#### SoapUI Projesi
Proje dosyasına [buradan](Documents/TASK-3/SOAP-Test-soapui-project.xml) ulaşabilirsiniz.



#### Bonus: Add Test suit with Load test in SOAPUI for a single operation without default values.
AddInteger işlemine ait yük testi SoapUI projesi olarak oluşturulmuştur.  
Dosya dizini: Documents/TASK-3/BONUS/SOAP-Test-AddInteger-Load-Test.xml


## Task 4: UI Testing with Selenium

https://academy.eteration.com/instructors web sitesine ait task 4'te belirtilen test senaryosu için otomasyon testi oluşturuldu. Proje hazırlanırken Behavior Driven Development, Object Orianted Programming ve SOLID yaklaşımlarına bağlı kalındı. Bağımlılıkların yönetimi Maven ile sağlandı. Proje yapısı yeni test senaryolarının eklenmesi için uygundur. 

**NOT:** Web sitesi üzerinde 6 tane eğitmen bulunmaktadır. Task'da belirtilen test senaryosunda eğitmen sayısının 8 olup olmadığının kontrol edilmesi istendiği için test verisi olarak 8 kullanılmıştır.

**Gherkin ile hazırlanmış test senaryosu** src/test/java/features/Instructors.feature dizinindedir.

**Otomasyonun ayağa kaldırılması;**
src/test/resources/TestNG.xml dizinindeki test suite üzerinden proje ayağa kaldırılır.

Teknoloji  | Kullanıldığı Yer
------------- | -------------
Java | Test senaryolarına ilişkin aksiyonlar
Selenium Web Driver | Tarayıcı otomasyonu
Cucumber | BDD yaklaşımıyla test senaryolarının yazılması
TestNG | Testlerin Düzenlenmesi, Ek Test yapıları, Assertions
