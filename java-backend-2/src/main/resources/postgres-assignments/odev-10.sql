SELECT city, country
FROM city
         LEFT JOIN country c on c.country_id = city.country_id;


SELECT payment_id, first_name, last_name
FROM customer
         RIGHT JOIN payment p on customer.customer_id = p.customer_id;


SELECT rental_id, first_name, last_name
FROM customer
         FULL JOIN rental r on customer.customer_id = r.customer_id;