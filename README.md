Veri ekleme, listeleme, güncelleme ve silme işlemlerini gerçekleştiren bir backend projesidir. 
Bu proje ile veritabanı üzerinde Category ve Product ile ilgili işlemler gerçekleştirilebilir. 
Projede; Spring Boot, Data JPA, Spring Web ve veritabanı için PostgreSQL kullanılmıştır. 
Projenin ayağa kaldırılması için DemoDB adında bir veritabanı oluşturulması gerekmektedir.

•	Category tablosunda gerçekleştirilebilen işlemler:
GET	     ->	/api/category/all		-> Category tablosundaki tüm verileri getirir
POST        ->	/api/category/add		-> Category tablosuna yeni veri ekler
PUT	     ->	/api/category/update/{id}	-> Category tablosunda girilen id’ye sahip veriyi günceller
DELETE   ->	/api/category/delete/{id}	-> Category tablosundan girilen id’ye sahip veriyi siler

•	Category tablosuna yeni bir veri girmek için POST metodu seçildikten ve URL girildikten sonra Body seçilmeli ve tip olarak JSON seçilmelidir. Veri eklemek için yazılması gereken body modeli:
{
    "name": "isim"
}


•	Product tablosunda gerçekleştirilebilen işlemler:
GET	     ->	/api/product/all			-> Product tablosundaki tüm verileri getirir
POST	     ->	/api/ product /add		-> Product tablosuna yeni veri ekler
PUT	     ->	/api/ product /update/{id}	-> Product tablosunda girilen id’ye sahip veriyi günceller
DELETE   ->	/api/ product /delete/{id}	-> Product tablosundan girilen id’ye sahip veriyi siler

•	Product tablosuna yeni bir veri girmek için POST metodu seçildikten ve URL girildikten sonra Body seçilmeli ve tip olarak JSON seçilmelidir. Veri eklemek için yazılması gereken body modeli:
{
    "name": "isim",
    "price": fiyat(tam sayı),
    "description": "açıklama"
}
