CREATE DEFINER=`root`@`localhost` PROCEDURE `getstudentByWorkplace`(in get_by_Workplace varchar(10))
BEGIN
SELECT * FROM student WHERE get_by_Workplace = Workplace;
END