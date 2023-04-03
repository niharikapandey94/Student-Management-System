-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: project
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `batch`
--

DROP TABLE IF EXISTS `batch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `batch` (
  `bid` int NOT NULL AUTO_INCREMENT,
  `batchname` varchar(255) DEFAULT NULL,
  `cId` int DEFAULT NULL,
  `Coursename` varchar(255) DEFAULT NULL,
  `totalSeats` int DEFAULT NULL,
  `seatsFilled` int DEFAULT NULL,
  `startdate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`bid`),
  UNIQUE KEY `batchname` (`batchname`),
  KEY `cId` (`cId`),
  CONSTRAINT `batch_ibfk_1` FOREIGN KEY (`cId`) REFERENCES `course` (`cId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1003 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `batch`
--

LOCK TABLES `batch` WRITE;
/*!40000 ALTER TABLE `batch` DISABLE KEYS */;
INSERT INTO `batch` VALUES (1000,'EEE-01',100,'Electrical_Engg',100,80,'2023-03-30','2027-04-28',0),(1001,'CSE-01',101,'Computer_Science_Engg',90,80,'2023-07-08','2027-07-30',0),(1002,'CE-01',102,'Chemical_Engg',70,60,'2023-05-08','2027-05-08',0);
/*!40000 ALTER TABLE `batch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course` (
  `cId` int NOT NULL AUTO_INCREMENT,
  `Cname` varchar(255) NOT NULL,
  `fees` int DEFAULT NULL,
  `cInfo` varchar(255) DEFAULT NULL,
  `duration_in_years` int DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`cId`),
  UNIQUE KEY `Cname` (`Cname`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (100,'Electrical_Engg',500000,'btech',4,0),(101,'Computer_Science_Engg',400000,'btech',4,0),(102,'Chemical_Engg',30000,'btech',3,0),(103,'Mechanical_Engg',100000,'BE',4,0),(104,'Civil_Engg',100000,'B.E.',4,0),(105,'Agriculture_Engg',500000,'Btech',4,0),(106,'Manufacturing_Engg',500000,'BE',4,0);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `mobile_no` varchar(50) DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(50) NOT NULL,
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (12,'niharika','pandey','praygraj','8948253728','niharikapandeyabc@gmail.com','niks@123',1),(13,'sushant','mishra','varansi','9450590620','sushantpandey@gmail.com','sush@123',1),(14,'subham','barnwal','Calcutta','4567898990','subham123@gmail.com','subh@123',1),(15,'Aman','Gautam','Kanpur','7906299389','amangautam@gmail.com','aman@123',0),(16,'Archana','Tiwari','Mau','9450590620','archanpandey@gmail.com','archan@123',0),(17,'brij','Shukla','agra','9459087690','brijpandey@gmail.com','brij@123',0),(18,'ni','pa','ald','89310924049','mmmm','nnnnnnn',0),(20,'niks','panda','ald','83939339','nnnn','mmmmmmm',0),(21,'niks','panda','ld','821895','kkkkkk','hhhh',0),(22,'kkkk','pppp','matu','833538558','uuuuu','qqqq',0),(23,'su','pa','fate','su@gmail','su123','3993999339',0),(24,'archu','pan','mau','88393939','archu@','arch123',0);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentrecord`
--

DROP TABLE IF EXISTS `studentrecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentrecord` (
  `batchno` int NOT NULL AUTO_INCREMENT,
  `batchname` varchar(255) DEFAULT NULL,
  `cid` int DEFAULT NULL,
  `bid` int DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fathername` varchar(255) DEFAULT NULL,
  `mothername` varchar(255) DEFAULT NULL,
  `tenth_percentage` double DEFAULT NULL,
  `twelth_percentage` double DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`batchno`),
  KEY `bid` (`bid`),
  KEY `cid` (`cid`),
  KEY `email` (`email`),
  CONSTRAINT `studentrecord_ibfk_1` FOREIGN KEY (`bid`) REFERENCES `batch` (`bid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `studentrecord_ibfk_2` FOREIGN KEY (`cid`) REFERENCES `course` (`cId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `studentrecord_ibfk_3` FOREIGN KEY (`email`) REFERENCES `student` (`email`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentrecord`
--

LOCK TABLES `studentrecord` WRITE;
/*!40000 ALTER TABLE `studentrecord` DISABLE KEYS */;
INSERT INTO `studentrecord` VALUES (1,'EEE-01',100,1000,'niharikapandeyabc@gmail.com','brij_Pandey','Priti_pandey',66.33,73.22,'Female',0),(2,'EEE-01',100,1000,'niharikapandeyabc@gmail.com','brij','priti',66.33,73.2,'FEMAle',0);
/*!40000 ALTER TABLE `studentrecord` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-03 23:36:25
