drop table if exists stocklist;
create table stocklist(stock_id int primary key, stock_name varchar(20),stock_value double);

insert into stocklist values(51,'TATAMOTORS',FLOOR(RAND()*(2000-1000+1)+1000));
insert into stocklist values(52,'TCS',FLOOR(RAND()*(1000-500+1)+500));
insert into stocklist values(53,'COGNIZANT',FLOOR(RAND()*(1000-500+1)+500));
insert into stocklist values(54,'MICROSOFT',FLOOR(RAND()*(2000-500+1)+500));
insert into stocklist values(55,'APPLE',FLOOR(RAND()*(1000-500+1)+500));
insert into stocklist values(56,'FACEBOOK',FLOOR(RAND()*(1000-500+1)+500));
insert into stocklist values(57,'ALIBABA',FLOOR(RAND()*(2000-500+1)+500));
insert into stocklist values(58,'BEL',FLOOR(RAND()*(1000-500+1)+500));
insert into stocklist values(59,'ZOMATO',FLOOR(RAND()*(3000-2000+1)+2000));
insert into stocklist values(60,'PAYTM',FLOOR(RAND()*(4000-3000+1)+3000));
insert into stocklist values(61,'TANLA',FLOOR(RAND()*(1000-500+1)+500));
