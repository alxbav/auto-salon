create table if not exists driverq
(
    id        serial primary key,
    first_name varchar not null,
    last_name  varchar not null,
    phone     varchar not null,
    active1   varchar not null,
    comments  varchar
)