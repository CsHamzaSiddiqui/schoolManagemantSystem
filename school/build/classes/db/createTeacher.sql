CREATE TABLE teacher (
    id            INTEGER      PRIMARY KEY,
    name          VARCHAR (25),
    ph            VARCHAR (15),
    CNIC          VARCHAR (20),
    address       VARCHAR (50),
    education     VARCHER (20),
    created          DATE,
    image         BLOB,
    deleted       BOOLEAN
);