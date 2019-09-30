DROP TABLE IF exists public.users;

CREATE TABLE public.users (
  id              int not null IDENTITY,
  firstName varchar(255) not null,
  lastName varchar(255) not null,
  email varchar(255) not null,
  address varchar(255) not null,
  city varchar(255) not null,
  province varchar(255) not null,
  postalCode varchar(255) not null,
  primary key (id)
);