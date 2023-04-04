-- Merhabalar,
--
--
--
-- Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.
--
-- 1. city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
-- 2. customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
-- 3. customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
--
--
-- Kolay Gelsin.

SELECT city, country
FROM city
INNER JOIN country c on c.country_id = city.country_id;


SELECT payment_id, first_name, last_name
FROM payment
INNER JOIN customer c on c.customer_id = payment.customer_id;


SELECT rental_id, first_name, last_name
FROM rental
INNER JOIN customer c on c.customer_id = rental.customer_id;

