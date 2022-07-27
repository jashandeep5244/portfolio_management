drop table if exists mutualfund;
create table mutualfund(mutual_Fund_Id int primary key , mutual_Fund_Name varchar(30),mutual_Fund_Value double);

insert into mutualfund values(11,'GLE',FLOOR(RAND()*(1000-500+1)+500));
insert into mutualfund values(12,'FBE',FLOOR(RAND()*(2000-1000+1)+1000));
insert into mutualfund values(13,'SLJ',FLOOR(RAND()*(1000-500+1)+500));
insert into mutualfund values(14,'SRD',FLOOR(RAND()*(2000-1000+1)+1000));
insert into mutualfund values(15,'QSF',FLOOR(RAND()*(1000-500+1)+500));
insert into mutualfund values(16,'CPE',FLOOR(RAND()*(3000-2000+1)+2000));
insert into mutualfund values(17,'GLA',FLOOR(RAND()*(2000-1000+1)+1000));
insert into mutualfund values(18,'ART',FLOOR(RAND()*(3000-2000+1)+2000));
insert into mutualfund values(19,'URE',FLOOR(RAND()*(1000-500+1)+500));
insert into mutualfund values(20,'TATA',FLOOR(RAND()*(1000-500+1)+500));

