create table if not exists linkq
(
    id         serial primary key,
    call_sign  int  not null,
    carq_id    int  not null,
    date_start date not null,
    date_end   date not null,
    comments   varchar,
    foreign key (call_sign) references callsign (id),
    foreign key (carq_id) references carq (id)


)
