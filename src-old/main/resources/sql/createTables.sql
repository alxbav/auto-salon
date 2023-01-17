create table CAR (
    id serial primary key,
    color varchar (20) not null,
    body_type varchar(20) not null,
    manufacturer varchar (20) not null,
    gear_type varchar (15) not null,
    fuel_type varchar (15) not null,
    release_date date not null,
    description varchar (500),
    vin int not null,
    reg_number varchar (15) not null;

);

drop table PLACE;

create table PLACE(
    id serial primary key ,
    number int not null CHECK (number>0 and number<20),
    car_id int ,
    constraint FK_CAR foreign key (CAR_id) REFERENCES CAR (id)
);


create table BALANCE (
    id serial primary key ,
    date date not null ,
    summ double precision,
    balance double precision,
    car_id int,
    constraint FK_CAR foreign key (CAR_id) REFERENCES CAR (id)
);


