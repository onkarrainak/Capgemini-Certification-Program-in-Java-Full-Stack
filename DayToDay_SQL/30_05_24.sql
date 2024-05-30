use onkar;

CREATE TABLE product (
    pid INT PRIMARY KEY AUTO_INCREMENT,
    pname VARCHAR(30) NOT NULL,
    pprice FLOAT CHECK (pprice > 0) NOT NULL
);

CREATE TABLE customer (
    cid INT PRIMARY KEY AUTO_INCREMENT,
    cname VARCHAR(30) NOT NULL,
    cdob DATE,
    pid INT,
    FOREIGN KEY (pid) REFERENCES product(pid)
);

-- Insert into product table
INSERT INTO product (pname, pprice) VALUES 
('Product1', 50.0),
('Product2', 150.0),
('Product3', 200.0),
('Product4', 75.0),
('Product5', 125.0);

-- Insert into customer table
INSERT INTO customer (cname, cdob, pid) VALUES 
('Onkar', '1990-01-01', 1),
('Sujay', '1985-05-15', 2),
('Sourabh', '1992-10-30', 3),
('Raj', '1980-07-20', 4),
('Ram', '1995-03-25', 5);

SELECT * FROM product;
SELECT * FROM customer;

-- 3.select customer whose name starts with s
SELECT * FROM customer WHERE cname LIKE 'S%';

-- 4. select the products whose price is >100
SELECT * FROM product WHERE pprice > 100;

-- 5.select cusomer details  based on dob
SELECT * FROM customer ORDER BY cdob;

-- 6.update custmer name based on customer id
UPDATE customer SET cname = 'Onkar Rainak' WHERE cid = 11;
SELECT * FROM customer;

-- 7.fetch the records from customer cname, from product table product name and price
SELECT c.cname, p.pname, p.pprice 
FROM customer c 
JOIN product p ON c.pid = p.pid;

SELECT * FROM customer;

SELECT MAX(pprice) AS highest_price
FROM product;

SELECT MAX(pprice) AS second_highest_price
FROM product
WHERE pprice < (SELECT MAX(pprice) FROM product);


SELECT DISTINCT pprice AS nth_highest_price
FROM product
ORDER BY pprice DESC
LIMIT 3,1 ;

SELECT DISTINCT pprice
FROM product
ORDER BY pprice ASC
LIMIT 0, 2;

SELECT DISTINCT pprice
FROM product
ORDER BY pprice desc
LIMIT 0, 2;

INSERT INTO product (pname, pprice) VALUES 
('Product6', 125.0);

select * from Product;

DELETE FROM product
WHERE pid = 6;