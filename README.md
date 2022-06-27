# url-shortener

Kullanılan Teknolojiler;

Hashing -> guava  // com.google.guava

Databse -> H2Database // test ortamında hızlı harekert etmek adına

core class manipulation  -> apache common langs // commons-lang3

unit testing -> vintage // junit-vintage-engine

Ekleneceker ;

-> User Login & Registiration 
-> User Delete & Create shotened url 
-> Unit Testing



Aktif Kullanım senaryosu ;

postman kullanılarak localhost:8080/generate/ adresine     

{
    "url":"https://medium.com/geekculture/o-no-not-another-blog-about-big-o-338457f9247a"
}

json objesi ile post isteğinde bulunulur. 

{
    "originalUrl": "https://medium.com/geekculture/o-no-not-another-blog-about-big-o-338457f9247a",
    "shortUrl": "f229dc3e",
    "expirationDate": "2022-06-27T13:58:09.9741659"
}

Şeklinde cevap alınır. Gönderilen url kısaltılıp sona erme süresi ile veritabanına eklenir
localhost:8080/shortUrl  şeklinde adrese gidilebilir.



kısaltılmış url silinmek istendiğinde 
localhost:8080/delete/shortUrl  şeklindeki istek yeterli olacaktır. 





