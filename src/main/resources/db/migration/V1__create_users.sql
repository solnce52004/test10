create table users
(
    id BIGINT auto_increment,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) null,
    role VARCHAR(255) null,
    constraint users_pk
        primary key (id)
);

