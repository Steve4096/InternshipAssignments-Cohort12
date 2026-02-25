create table if not exists student
(
    id Long serial not null primary key,
    registration_number varchar(15) unique,
    first_name varchar(15) not null,
    second_name varchar(15) not null,
    email varchar(50) not null,
    password varchar(50)
);