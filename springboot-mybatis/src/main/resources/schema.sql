-- SpringBoot启动时会自动执行这个sql文件
--    https://stackoverflow.com/questions/38040572
CREATE TABLE `t_user` (
  user_id int ,
  username varchar(50) ,
  password varchar(50)
) ;

INSERT INTO `t_user` VALUES ('1', 'admin', 'admin');
INSERT INTO `t_user` VALUES ('2', 'yizhiwazi', '123456');