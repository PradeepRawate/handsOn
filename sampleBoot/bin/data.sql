DELETE FROM `test`.`user`;
DELETE FROM `test`.`department`;
INSERT INTO `test`.`department` (`id`, `name`) VALUES ('1', 'DEV');
INSERT INTO `test`.`department` (`id`, `name`) VALUES ('2', 'HR');
INSERT INTO `test`.`department` (`id`, `name`) VALUES ('3', 'QA');
INSERT INTO `test`.`department` (`id`, `name`) VALUES ('4', 'ADMIN');

INSERT INTO `user` VALUES (1,'1996-03-01 05:30:00','prawate@gmail.com','Pramod','','Rawate',411037,1),(2,'1996-06-04 05:30:00','pradeeprawate@gmail.com','Pradeep','','Rawate',411037,1),(3,'1996-06-04 05:30:00','ra@gmail.com','Raj','','Aryan',411037,1),(4,'1991-06-04 05:30:00','rs@gmail.com','Rahul','','Sharma',411037,2),(5,'1990-06-04 05:30:00','sk@gmail.com','Sham','','Kumar',411037,3),(6,'1990-06-04 05:30:00','sk@gmail.com','Ravi','','Reddy',411037,4);