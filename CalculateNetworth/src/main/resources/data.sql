drop table if exists stockdetail;
drop table if exists mutualfund;
drop table if exists portfolio;
create table portfolio(portfolio_id int primary key);
create table stockdetail(st_id int primary key,stock_name varchar(20),stock_count int,portfolio_id int,foreign key(portfolio_id) references portfolio(portfolio_id));
create table mutualfund(mf_id int primary key,mutual_fund_name varchar(20),mutual_fund_units int,portfolio_id int,foreign key(portfolio_id) references portfolio(portfolio_id));

insert into portfolio values(101);
insert into portfolio values(102);
insert into portfolio values(103);
  
insert into stockdetail values(10,'APPLE',100,101);
insert into stockdetail values(11,'TCS',100,102);
insert into stockdetail values(12,'MICROSOFT',100,101);

insert into mutualfund values(21,'QUANT',100,102);
insert into mutualfund values(22,'AXXA',100,101);
insert into mutualfund values(23,'ICCI',100,101);