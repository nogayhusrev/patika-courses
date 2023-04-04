SELECT city, country
FROM city
INNER JOIN country c on c.country_id = city.country_id;


SELECT payment_id, first_name, last_name
FROM payment
INNER JOIN customer c on c.customer_id = payment.customer_id;


SELECT rental_id, first_name, last_name
FROM rental
INNER JOIN customer c on c.customer_id = rental.customer_id;

