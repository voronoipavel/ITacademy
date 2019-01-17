create table public.sports
(
  id integer primary key,
  name varchar(100) unique not null,
  salary numeric(15, 2) not null
);

--drop table public.sports

create table public.trainers
(
  id_trainer integer primary key,
  name varchar(100) not null,
  sport_id integer references public.sports(id) not null,
  phone varchar(15) ,
  inn varchar(16) unique not null
);

Insert into sports (id, name, salary) Values(1, 'Football', 200);
Insert into sports (id, name, salary) Values(2, 'Dance', 100);
Insert into sports (id, name, salary) Values(3, 'Basketball', 250);
Insert into sports (id, name, salary) Values(4, 'Judo', 210);
Insert into sports (id, name, salary) Values(5, 'Swim', 290);

insert into trainers(id_trainer,name, sport_id, inn, phone ) values (1, 'Bruce Lee', 1, '76567567', '9012321');
insert into trainers(id_trainer,name, sport_id, inn, phone ) values (2, 'Jackie Chan', 2, '34543', '9012321');
insert into trainers(id_trainer,name, sport_id, inn, phone ) values (3, 'Steve Seagul', 2, '3454', '9012321');
insert into trainers(id_trainer,name, sport_id, inn, phone ) values (4, 'Van Damme', 3, '12209023123', '9012321');
insert into trainers(id_trainer,name, sport_id, inn, phone ) values (5, 'Arni', 1, '12312323423', '9012321');


select tr.name, sp.salary
from trainers tr
inner join sports sp on tr.sport_id = sp.id
where sp.salary >= 200;

select t.name, lower(name)lowercasenames
from trainers t
where lower(t.name) like '%a%'

select sp.name, sp.salary
from  sports sp 
where lower(sp.name) like '%ball';

select t.*
from trainers t
order by t.name asc;

update sports
set salary = salary *2;

update trainers
set name = 'Carlo Ancelotti'
where id_trainer = 1

create table public.visitors
(
  id integer primary key,
  fullname varchar(100) unique not null,
  dateofbirth varchar(10) not null,
  gender varchar(1) not null
);

create table public.visits
(
  id_visits integer primary key,
  visitors_id integer references public.visitors(id) not null,
  visiting_time numeric(5, 2) not null,
  trainer integer references public.trainers(id_trainer) not null 
 );

insert into visitors(id,fullname, dateofbirth, gender) values (1, 'Adam Gordon', '5.01.2019', 'M');
insert into visitors(id,fullname, dateofbirth, gender) values (2, 'Amanda Brian', '8.01.2019', 'W');
insert into visitors(id,fullname, dateofbirth, gender) values (3, 'Wilma Leapman', '15.01.2019', 'W');
insert into visitors(id,fullname, dateofbirth, gender) values (4, 'Scott Bush', '8.01.2019', 'M');
insert into visitors(id,fullname, dateofbirth, gender) values (5, 'Nicole WilKinson', '5.01.2019', 'W');


insert into visits(id_visits,visitors_id, visiting_time, trainer) values (1, 1, '18.00', 5);
insert into visits(id_visits,visitors_id, visiting_time, trainer) values (2, 4, '20.00', 5);
insert into visits(id_visits,visitors_id, visiting_time, trainer) values (3, 5, '15.00', 5);
insert into visits(id_visits,visitors_id, visiting_time, trainer) values (4, 1, '17.00', 1);
insert into visits(id_visits,visitors_id, visiting_time, trainer) values (5, 5, '18.00', 5);
insert into visits(id_visits,visitors_id, visiting_time, trainer) values (6, 2, '20.00', 4);
insert into visits(id_visits,visitors_id, visiting_time, trainer) values (7, 5, '18.00', 1);
insert into visits(id_visits,visitors_id, visiting_time, trainer) values (8, 4, '18.00', 1);

select v.fullname, tr.name, sp.name, vis.visiting_time
from visitors v
inner join visits vis on vis.id_visits = v.id
inner join trainers tr on vis.trainer = tr.id_trainer
inner join sports sp on tr.id_trainer = sp.id
where lower(sp.name) like 'swim'
order by vis.visiting_time desc;

select v.fullname, tr.name, sp.name
from visitors v, visits vis
inner join trainers tr on vis.trainer = tr.id_trainer
inner join sports sp on tr.id_trainer = sp.id
where lower(sp.name) like 'swim';

select v.fullname, vis.visiting_time
from visitors v
inner join visits vis on vis.id_visits = v.id
order by vis.visiting_time asc;

