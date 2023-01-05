create table if not exists callsign
(
    id         serial primary key,
    call_sign  int  not null,
    driverq_id int,
    date_start date not null,
    date_end   date not null,
    comments   varchar,
    foreign key (driverq_id) references driverq (Id)

)
