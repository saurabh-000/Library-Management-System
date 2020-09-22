-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 22, 2020 at 03:19 PM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `newlibpro`
--

-- --------------------------------------------------------

--
-- Table structure for table `add_lib`
--

CREATE TABLE `add_lib` (
  `id` int(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(200) NOT NULL,
  `address` text NOT NULL,
  `city` varchar(200) NOT NULL,
  `contact_no` bigint(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_lib`
--

INSERT INTO `add_lib` (`id`, `name`, `password`, `email`, `address`, `city`, `contact_no`) VALUES
(1, 'saurabh', 'saurabh@123', 'srg@gmail.com', 'alinagar', 'gorakhpur', 9919837424),
(2, 'dsfkjdls', '123', 'JKDVBJSD', 'kcjdkj', 'vndvc', 7648764274);

-- --------------------------------------------------------

--
-- Table structure for table `admin_login`
--

CREATE TABLE `admin_login` (
  `Sr No` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_login`
--

INSERT INTO `admin_login` (`Sr No`, `name`, `password`) VALUES
(1, 'admin', 'admin123');

-- --------------------------------------------------------

--
-- Table structure for table `book_detail`
--

CREATE TABLE `book_detail` (
  `id` int(11) NOT NULL,
  `Book_name` varchar(200) NOT NULL,
  `Author_name` varchar(200) NOT NULL,
  `Publisher` varchar(200) NOT NULL,
  `Quantity` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book_detail`
--

INSERT INTO `book_detail` (`id`, `Book_name`, `Author_name`, `Publisher`, `Quantity`) VALUES
(1, 'let us c', 'yashvant kanetkar', 'bpb', 5),
(2, 'let us java', 'yashvant kanetkar', 'bpb', 5);

-- --------------------------------------------------------

--
-- Table structure for table `issuedetail`
--

CREATE TABLE `issuedetail` (
  `id` int(11) NOT NULL,
  `Student_name` varchar(200) NOT NULL,
  `Father_name` varchar(200) NOT NULL,
  `Dob` date NOT NULL,
  `Course` varchar(200) NOT NULL,
  `Book_id` varchar(200) NOT NULL,
  `Date_of_issue` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `issuedetail`
--

INSERT INTO `issuedetail` (`id`, `Student_name`, `Father_name`, `Dob`, `Course`, `Book_id`, `Date_of_issue`) VALUES
(1, 'nandan', 'omkar', '1998-05-05', 'b.tech', 'kanetkar@bpb', '2018-07-20');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `add_lib`
--
ALTER TABLE `add_lib`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `admin_login`
--
ALTER TABLE `admin_login`
  ADD PRIMARY KEY (`Sr No`);

--
-- Indexes for table `book_detail`
--
ALTER TABLE `book_detail`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `issuedetail`
--
ALTER TABLE `issuedetail`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `add_lib`
--
ALTER TABLE `add_lib`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `admin_login`
--
ALTER TABLE `admin_login`
  MODIFY `Sr No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `book_detail`
--
ALTER TABLE `book_detail`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `issuedetail`
--
ALTER TABLE `issuedetail`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
