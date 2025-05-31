must have sql
CREATE DATABASE pokemon_inventory;

USE pokemon_inventory;

CREATE TABLE pokemon (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    level INT,
    gender VARCHAR(20),
    type1 VARCHAR(50),
    type2 VARCHAR(50),
    skill1 VARCHAR(100),
    skill2 VARCHAR(100),
    skill3 VARCHAR(100),
    skill4 VARCHAR(100),
    copies INT
);
Run app, read buttons
