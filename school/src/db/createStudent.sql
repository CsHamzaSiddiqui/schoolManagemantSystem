CREATE TABLE students (
    id            INTEGER      PRIMARY KEY,
    name          VARCHAR (25),
    rollNo        VARCHAR (20),
    className     VARCHAR (20),
    CNIC          VARCHAR (20),
    address       VARCHAR (50),
    admissionDate DATE,
    image         BLOB,
    deleted       BOOLEAN,
    cast          VARCHAR (10),
    relision      VARCHAR (10),
    fatherName    VARCHAR (20),
    fatherCNIC    VARCHAR (50),
    fatherPh      VARCHAR (15),
    motherName    VARCHAR (50),
    motherCNIC    VARCHAR (50)
);