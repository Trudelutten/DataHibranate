-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Mar 07, 2019 at 02:27 PM
-- Server version: 5.7.24-log
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gamers`
--

-- --------------------------------------------------------

--
-- Table structure for table `characterclasses`
--

CREATE TABLE `characterclasses` (
  `ccid` int(11) NOT NULL,
  `characterClassName` varchar(20) DEFAULT NULL,
  `characterClassAbility` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `characterclasses`
--

INSERT INTO `characterclasses` (`ccid`, `characterClassName`, `characterClassAbility`) VALUES
(1, 'Wizard', 'Magic and sorcary'),
(2, 'Fighter', 'Fist fighting and brutal attacks'),
(3, 'Theif', 'Sneaking and thieving');

-- --------------------------------------------------------

--
-- Table structure for table `characters`
--

CREATE TABLE `characters` (
  `cid` int(11) NOT NULL,
  `pcid` int(11) DEFAULT NULL,
  `characterName` varchar(20) DEFAULT NULL,
  `characterLevel` int(11) DEFAULT NULL,
  `characterClass` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `characters`
--

INSERT INTO `characters` (`cid`, `pcid`, `characterName`, `characterLevel`, `characterClass`) VALUES
(1, 1, 'WickedWonder', 115, 'Wizard'),
(2, 2, 'Bender', 115, 'Theif'),
(15, 1, 'Forcefull', 5, 'Fighter'),
(16, 1, 'MsInvisible', 28, 'Theif'),
(17, 3, 'TheiHighPrestes', 1128, 'Wizard'),
(18, 3, 'MrForcefull', 501, 'Fighter'),
(19, 4, 'ForceFromTheEast', 1567, 'Fighter'),
(20, 4, 'SneakingTiger', 463, 'Theif'),
(21, 5, 'MrWizard', 1342, 'Wizard'),
(22, 5, 'MrYo', 589, 'Fighter');

-- --------------------------------------------------------

--
-- Table structure for table `players`
--

CREATE TABLE `players` (
  `pid` int(11) NOT NULL,
  `firstName` varchar(20) DEFAULT NULL,
  `lastName` varchar(20) DEFAULT NULL,
  `userName` varchar(20) DEFAULT NULL,
  `emailAddress` varchar(40) DEFAULT NULL,
  `passWord` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `players`
--

INSERT INTO `players` (`pid`, `firstName`, `lastName`, `userName`, `emailAddress`, `passWord`) VALUES
(1, 'Trude', 'Hjelmeland', 'Trudelutt', 'Trude.Hjelmeland@gamer.com', 'SecretWord'),
(2, 'Ben', 'Dover', 'BendO', 'Ben.Dover@gamer.com', 'MyKitty4ever'),
(3, 'Willie', 'Strocker', 'ThePrest', 'Willie.Strocker@gamer.com', 'DenyToYouDie'),
(9, 'Wang', 'Liqin', 'MrW', 'Wang.Liqin@gamer.com', 'NotForShearing'),
(10, 'Jonathan', 'Stang', 'JoSt', 'Jonathan.Stang@gamer.com', 'GotItHotFor');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `characterclasses`
--
ALTER TABLE `characterclasses`
  ADD UNIQUE KEY `ccid` (`ccid`);

--
-- Indexes for table `characters`
--
ALTER TABLE `characters`
  ADD UNIQUE KEY `cid` (`cid`);

--
-- Indexes for table `players`
--
ALTER TABLE `players`
  ADD UNIQUE KEY `pid` (`pid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `characterclasses`
--
ALTER TABLE `characterclasses`
  MODIFY `ccid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `characters`
--
ALTER TABLE `characters`
  MODIFY `cid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT for table `players`
--
ALTER TABLE `players`
  MODIFY `pid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
