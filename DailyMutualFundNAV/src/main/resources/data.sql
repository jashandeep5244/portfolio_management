drop table if exists mutualfund;
create table mutualfund(mutual_Fund_Id int primary key , mutual_Fund_Name varchar(30),mutual_Fund_Value double);

insert into mutualfund values(11,'HDFCAMC',FLOOR(RAND()*(1000-500+1)+500));
insert into mutualfund values(12,'MIRAGEASSET',FLOOR(RAND()*(2000-1000+1)+1000));
insert into mutualfund values(13,'TPCC',FLOOR(RAND()*(1000-500+1)+500));
insert into mutualfund values(14,'AXXA',FLOOR(RAND()*(2000-1000+1)+1000));
insert into mutualfund values(15,'QUANT',FLOOR(RAND()*(1000-500+1)+500));
insert into mutualfund values(16,'ICCI',FLOOR(RAND()*(3000-2000+1)+2000));
insert into mutualfund values(17,'GLA',FLOOR(RAND()*(2000-1000+1)+1000));
insert into mutualfund values(18,'AMC',FLOOR(RAND()*(3000-2000+1)+2000));
insert into mutualfund values(19,'LNCT',FLOOR(RAND()*(1000-500+1)+500));
insert into mutualfund values(20,'TATA',FLOOR(RAND()*(1000-500+1)+500));

