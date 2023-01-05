create table if not exists constants
(
    id          serial primary key,
    constant    varchar,
    value       double precision,
    description varchar
)