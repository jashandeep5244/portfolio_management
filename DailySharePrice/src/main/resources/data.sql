drop table if exists stocklist;
create table stocklist(stock_id int primary key, stock_name varchar(20),stock_value double);

insert into stocklist values(51,'DLF',FLOOR(RAND()*(2000-1000+1)+1000));
insert into stocklist values(52,'TECHM',FLOOR(RAND()*(1000-500+1)+500));
insert into stocklist values(53,'BEL',FLOOR(RAND()*(1000-500+1)+500));
insert into stocklist values(54,'SBI',FLOOR(RAND()*(2000-500+1)+500));
insert into stocklist values(55,'CTS',FLOOR(RAND()*(1000-500+1)+500));
insert into stocklist values(56,'SRT',FLOOR(RAND()*(1000-500+1)+500));
insert into stocklist values(57,'DHF',FLOOR(RAND()*(2000-500+1)+500));
insert into stocklist values(58,'CSR',FLOOR(RAND()*(1000-500+1)+500));
insert into stocklist values(59,'CDE',FLOOR(RAND()*(3000-2000+1)+2000));
insert into stocklist values(60,'ADM',FLOOR(RAND()*(4000-3000+1)+3000));
insert into stocklist values(61,'JSR',FLOOR(RAND()*(1000-500+1)+500));
