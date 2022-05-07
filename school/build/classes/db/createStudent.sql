CREATE TABLE students (
    id            INTEGER      PRIMARY KEY,
    name          VARCHAR (25),
    className     VARCHAR (20),
    CNIC          VARCHAR (20),
    address       VARCHAR (50),
    admissionDate DATE,
    image         BLOB,
    deleted       BOOLEAN
);