-- Merhabalar,
--
-- Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.
--
-- 1. film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
-- 2. film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
-- 3. film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.
-- 4. payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.
--
-- Kolay Gelsin.

-- 1
SELECT count(*)
FROM film
WHERE length > (SELECT avg(length)
                FROM film);


-- 2
SELECT count(*)
FROM film
WHERE rental_rate = (SELECT max(rental_rate)
                     FROM film);


-- 3
SELECT count(*)
FROM film
WHERE rental_rate = (SELECT min(rental_rate)
                     FROM film)
  AND replacement_cost = (SELECT min(replacement_cost)
                          FROM film);


-- 4
SELECT customer_id, COUNT(*) AS most_purchases
FROM payment
GROUP BY customer_id
ORDER BY most_purchases DESC;