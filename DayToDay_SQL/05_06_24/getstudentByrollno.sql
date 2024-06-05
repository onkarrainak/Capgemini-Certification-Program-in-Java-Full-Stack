CREATE DEFINER=`root`@`localhost` PROCEDURE `getstudentByrollno`(in get_by_rollno int)
BEGIN
SELECT * FROM student WHERE get_by_rollno = rollno;
END
