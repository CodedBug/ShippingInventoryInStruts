create table manufacturer(id number primary key,name varchar2(15) not null);

create table category(id number primary key,categoryname varchar2(15) not null);

create table item(id number primary key,itemname varchar2(15) not null,categoryid number references category(id), batchno varchar2(10), manufacturerid number references manufacturer(id));

create table inventory(itemid number primary key references item(id), quantityinhand number not null);

create table purchase(id number primary key,approved varchar2(5) check(approved in('TRUE','FALSE')));

create table purchaseunit(id number primary key,itemid number not null references item(id),quantity number not null, purchasedate date not null, expirydate date not null,importtype varchar2(15) not null check(importtype in('LOCAL','INTERNATIONAL')), invoicelocation varchar2(50),purchaseid number not null references purchase(id));


//purchaseid would be same for all the items wich are part of the same purchase

insert into category values(1,'pyrotechnics');

insert into manuacturer values(1,'abc');

insert into item values(1,'hand flares',1,'b1',1);
insert into item values(2,'rocket parachute',1,'b2',1);
insert into item values(3,'smoke signal',1,'b3',1);
insert into item values(4,'food ration',null,'b4',1);
insert into item values(5,'water',null,'b5',1);
insert into item values(6,'first aid',null,'b6',1);

