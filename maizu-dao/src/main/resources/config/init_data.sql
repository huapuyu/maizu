-- Area --
insert into cfg_area (cfg_area.id , cfg_area.title , cfg_area.type , cfg_area.enable)
values (2,'上海',0,1);

insert into cfg_area (cfg_area.id , cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (2001,'宝山',2,1,2);
insert into cfg_area (cfg_area.id , cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (2002, '长宁',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (2003, '崇明',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (2004, '奉贤',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (2005, '虹口',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (2006, '黄浦',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (2007, '嘉定',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (2008, '金山',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (2009, '静安',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (20010, '卢湾',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (20011, '闵行',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (20012, '浦东',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (20013, '普陀',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (20014, '青浦',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (20015, '松江',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (20016, '徐汇',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (20017, '杨浦',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (20018, '闸北',2,1,2);
insert into cfg_area (cfg_area.id ,  cfg_area.title , cfg_area.type , cfg_area.enable, cfg_area.parent_id)
values (20019, '上海周边',2,1,2);


-- Data --
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1 , 1 , '东' , 0);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (2 , 1 , '南' , 0);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (3 , 1 , '西' , 0);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (4 , 1 , '北' , 0);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (5 , 1 , '南北' , 0);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (6 , 1 , '东西' , 0);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (7 , 1 , '东南' , 0);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (8 , 1 , '西南' , 0);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (9 , 1 , '东北' , 0);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (10 , 1 , '西北' , 0);

insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (201 , 1 , '90年前小区' , 2);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (202 , 1 , '90-95小区' , 2);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (203 , 1 , '96-00小区' , 2);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (204 , 1 , '01-05小区' , 2);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (205 , 1 , '06-10小区' , 2);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (206 , 1 , '全新小区' , 2);

insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (301 , 1 , '毛坯' , 3);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (302 , 1 , '精装' , 3);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (303 , 1 , '简装' , 3);

insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (701 , 1 , '平房' , 7);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (702 , 1 , '普通住宅' , 7);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (703 , 1 , '商住两用' , 7);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (704 , 1 , '公寓' , 7);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (705 , 1 , '别墅' , 7);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (706 , 1 , '其他' , 7);

insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1001 , 1 , '电话联系' , 10);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1002 , 1 , '随时' , 10);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1003 , 1 , '周1-周5' , 10);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1004 , 1 , '周末' , 10);

insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1101 , 1 , '整租' , 11);

insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1301 , 1 , '面议' , 13);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1302 , 1 , '押一付三' , 13);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1303 , 1 , '押一付一' , 13);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1304 , 1 , '押二付一' , 13);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1305 , 1 , '半年付' , 13);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1306 , 1 , '年付' , 13);

insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1401 , 1 , '任意' , 14);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1402 , 1 , '一周' , 14);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1403 , 1 , '二周' , 14);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1404 , 1 , '半个月' , 14);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1405 , 1 , '一个月' , 14);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1406 , 1 , '二个月' , 14);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1407 , 1 , '三个月' , 14);

insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1501 , 1 , '1个月以上' , 15);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1502 , 1 , '3个月以上' , 15);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1503 , 1 , '半年以上' , 15);
insert into cfg_data (cfg_data.id , cfg_data.enable , cfg_data.title , cfg_data.type)
VALUES (1504 , 1 , '一年以上' , 15);