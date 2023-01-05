create table if not exists balanceq
(
    id          serial primary key,
    call_sign   int    not null,
    week_number int    not null,
    date        date   not null,
    summ        bigint not null,
    comments    varchar,
    foreign key (call_sign) references callsign (id)


)
