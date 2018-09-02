-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Sep 02, 2018 at 07:16 PM
-- Server version: 10.1.22-MariaDB
-- PHP Version: 7.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--
CREATE DATABASE IF NOT EXISTS `hospital` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `hospital`;

-- --------------------------------------------------------

--
-- Table structure for table `Doctor`
--

DROP TABLE IF EXISTS `Doctor`;
CREATE TABLE IF NOT EXISTS `Doctor` (
  `id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_persian_ci DEFAULT NULL,
  `expertise` varchar(255) CHARACTER SET utf8 COLLATE utf8_persian_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='دکتر';

--
-- Dumping data for table `Doctor`
--

INSERT INTO `Doctor` (`id`, `name`, `expertise`) VALUES
(1, 'gazvini', 'Orthopedic'),
(2, 'rahmani', 'internal'),
(3, 'kavandi', 'jarrah');

-- --------------------------------------------------------

--
-- Table structure for table `History`
--

DROP TABLE IF EXISTS `History`;
CREATE TABLE IF NOT EXISTS `History` (
  `id` int(11) NOT NULL,
  `patient_fk` int(11) DEFAULT NULL,
  `doctor_fk` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `doctor_id` (`doctor_fk`),
  KEY `patient_id` (`patient_fk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='سنوات سابقه دکتر';

--
-- Dumping data for table `History`
--

INSERT INTO `History` (`id`, `patient_fk`, `doctor_fk`) VALUES
(1, 1, 1),
(2, 2, 3),
(3, 3, 3);

-- --------------------------------------------------------

--
-- Table structure for table `Patient`
--

DROP TABLE IF EXISTS `Patient`;
CREATE TABLE IF NOT EXISTS `Patient` (
  `id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_persian_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` bit(1) DEFAULT NULL,
  `birthdate` datetime DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_persian_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='بیمار';

--
-- Dumping data for table `Patient`
--

INSERT INTO `Patient` (`id`, `name`, `age`, `gender`, `birthdate`, `address`) VALUES
(1, 'ali gasemi', 29, b'1', '2018-09-12 00:00:00', 'qom st 55'),
(2, 'reza mohammadi', 28, b'1', '2018-09-27 00:00:00', 'tehran st 6'),
(3, 'ahmad azizi', 29, b'1', '2018-09-19 00:00:00', 'qom st 8');

-- --------------------------------------------------------

--
-- Table structure for table `Reception`
--

DROP TABLE IF EXISTS `Reception`;
CREATE TABLE IF NOT EXISTS `Reception` (
  `id` int(11) NOT NULL,
  `patient_fk` int(11) DEFAULT NULL,
  `date_reception` datetime DEFAULT NULL,
  `date_clearance` datetime DEFAULT NULL,
  `section_fk` int(11) DEFAULT NULL,
  `flatbed_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `patient_idid` (`patient_fk`),
  KEY `section_idid` (`section_fk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='پذیرش';

--
-- Dumping data for table `Reception`
--

INSERT INTO `Reception` (`id`, `patient_fk`, `date_reception`, `date_clearance`, `section_fk`, `flatbed_id`) VALUES
(1, 1, '2018-09-05 00:00:00', '2018-09-08 00:00:00', 1, 1),
(2, 2, '2018-09-11 00:00:00', '2018-09-20 00:00:00', 2, 2),
(3, 3, '2018-09-19 00:00:00', '2018-09-29 00:00:00', 1, 3);

-- --------------------------------------------------------

--
-- Table structure for table `Section`
--

DROP TABLE IF EXISTS `Section`;
CREATE TABLE IF NOT EXISTS `Section` (
  `id` int(11) NOT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_persian_ci DEFAULT NULL,
  `type_section` varchar(30) CHARACTER SET utf8 COLLATE utf8_persian_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='بخش های بیمارستان';

--
-- Dumping data for table `Section`
--

INSERT INTO `Section` (`id`, `name`, `type_section`) VALUES
(1, 'جراحی مردان', 'جراحی'),
(2, 'جراحی زنان', 'جراحی'),
(3, 'جراحی کودک', 'جراحی');

-- --------------------------------------------------------

--
-- Table structure for table `Surgery`
--

DROP TABLE IF EXISTS `Surgery`;
CREATE TABLE IF NOT EXISTS `Surgery` (
  `id` int(11) NOT NULL,
  `date` datetime DEFAULT NULL,
  `patient_fk` int(11) DEFAULT NULL,
  `doctor_fk` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `patient_ididid` (`patient_fk`),
  KEY `doctor_idid` (`doctor_fk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='لیست جراحی ها';

--
-- Dumping data for table `Surgery`
--

INSERT INTO `Surgery` (`id`, `date`, `patient_fk`, `doctor_fk`) VALUES
(1, '2018-09-05 00:00:00', 1, 1),
(2, '2018-09-21 00:00:00', 2, 2),
(3, '2018-09-07 00:00:00', 3, 3);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `History`
--
ALTER TABLE `History`
  ADD CONSTRAINT `doctor_id` FOREIGN KEY (`doctor_fk`) REFERENCES `Doctor` (`id`),
  ADD CONSTRAINT `patient_id` FOREIGN KEY (`patient_fk`) REFERENCES `Patient` (`id`);

--
-- Constraints for table `Reception`
--
ALTER TABLE `Reception`
  ADD CONSTRAINT `patient_idid` FOREIGN KEY (`patient_fk`) REFERENCES `Patient` (`id`),
  ADD CONSTRAINT `section_idid` FOREIGN KEY (`section_fk`) REFERENCES `Section` (`id`);

--
-- Constraints for table `Surgery`
--
ALTER TABLE `Surgery`
  ADD CONSTRAINT `doctor_idid` FOREIGN KEY (`doctor_fk`) REFERENCES `Doctor` (`id`),
  ADD CONSTRAINT `patient_ididid` FOREIGN KEY (`patient_fk`) REFERENCES `Patient` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
