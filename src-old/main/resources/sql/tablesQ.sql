
CREATE TABLE IF NOT EXISTS DRIVERQ_POTENC (
    id    INTEGER PRIMARY KEY ,
    first_name  VARCHAR(100) NOT NULL ,
    last_name VARCHAR(100) ,
    phone VARCHAR(50),
    active1 VARCHAR(20).
    comments VARCHAR(300)
);

CREATE SEQUENCE clients_id_seq START WITH 10 INCREMENT BY 1;