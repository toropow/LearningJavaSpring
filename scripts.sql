GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO bestuser;
GRANT USAGE ON SEQUENCE employees_id_seq TO bestuser;

CREATE TABLE details (
                         id SERIAL PRIMARY KEY,
                         city varchar(15),
                         phone_number varchar(25),
                         email varchar(30)
);

CREATE TABLE employees (
                           id SERIAL PRIMARY KEY,
                           name varchar(15),
                           surname varchar(25),
                           department varchar(20),
                           salary int,
                           details_id int,
                           FOREIGN KEY (details_id) REFERENCES details(id)
);