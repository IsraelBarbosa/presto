-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 25, 2019 at 12:14 PM
-- Server version: 10.2.23-MariaDB
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `prestor_presto`
--
CREATE DATABASE IF NOT EXISTS `prestor_presto` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `prestor_presto`;

-- --------------------------------------------------------

--
-- Table structure for table `endereco`
--

CREATE TABLE `endereco` (
  `LOGRADOURO` varchar(100) NOT NULL,
  `ID_ENDERECO` int(10) NOT NULL,
  `COMPLEMENTO` varchar(50) DEFAULT NULL,
  `BAIRRO` varchar(40) NOT NULL,
  `CIDADE` varchar(40) NOT NULL,
  `UF` varchar(2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `endereco`
--

INSERT INTO `endereco` (`LOGRADOURO`, `ID_ENDERECO`, `COMPLEMENTO`, `BAIRRO`, `CIDADE`, `UF`) VALUES
('Rua das amelias', 1, 'casa b', 'varzea', 'recife', 'PE'),
('rua amendoas, 1000', 2, 'apt 202', 'boa viagem', 'recife', 'PE');

-- --------------------------------------------------------

--
-- Table structure for table `LOGIN`
--

CREATE TABLE `LOGIN` (
  `USUARIO` varchar(30) NOT NULL,
  `SENHA` varchar(50) NOT NULL,
  `ID_LOGIN` int(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `USUARIO`
--

CREATE TABLE `USUARIO` (
  `NOME` varchar(100) NOT NULL,
  `ID_USUARIO` int(11) NOT NULL,
  `CPF` int(11) NOT NULL,
  `EMAIL` varchar(70) NOT NULL,
  `TELEFONE` int(11) DEFAULT NULL,
  `CELULAR` int(12) NOT NULL,
  `WHATSAPP` tinyint(1) NOT NULL,
  `TIPO` enum('SOLICITANTE','PRESTADOR') NOT NULL,
  `CTPS` blob DEFAULT NULL,
  `PROFISSAO` varchar(30) DEFAULT NULL,
  `ATIVIDADES_DESCRICAO` varchar(300) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `endereco`
--
ALTER TABLE `endereco`
  ADD PRIMARY KEY (`ID_ENDERECO`);

--
-- Indexes for table `LOGIN`
--
ALTER TABLE `LOGIN`
  ADD PRIMARY KEY (`ID_LOGIN`);

--
-- Indexes for table `USUARIO`
--
ALTER TABLE `USUARIO`
  ADD PRIMARY KEY (`ID_USUARIO`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `endereco`
--
ALTER TABLE `endereco`
  MODIFY `ID_ENDERECO` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `LOGIN`
--
ALTER TABLE `LOGIN`
  MODIFY `ID_LOGIN` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `USUARIO`
--
ALTER TABLE `USUARIO`
  MODIFY `ID_USUARIO` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
