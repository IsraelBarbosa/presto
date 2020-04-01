-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 02-Jun-2019 às 11:06
-- Versão do servidor: 10.1.40-MariaDB
-- versão do PHP: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `presto`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `userprest`
--

CREATE TABLE `userprest` (
  `nome` varchar(500) NOT NULL,
  `cpf` int(11) NOT NULL,
  `email` varchar(500) NOT NULL,
  `telefone` int(11) NOT NULL,
  `celular` int(11) NOT NULL,
  `senha` varchar(500) NOT NULL,
  `arquivo` blob NOT NULL,
  `profissao` varchar(500) NOT NULL,
  `descricao` varchar(500) NOT NULL,
  `nvaccess` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `nome` varchar(255) NOT NULL,
  `cpf` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `telefone` int(11) NOT NULL,
  `celular` int(11) NOT NULL,
  `senha` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`nome`, `cpf`, `email`, `telefone`, `celular`, `senha`) VALUES
('totestestando', 111111, 'ricksonmarinho1@gmail.com', 0, 0, '698d51a19d8a121ce581499d7b701668'),
('teste', 111111, 'ricksonmarinho1@gmail.com', 0, 0, '698d51a19d8a121ce581499d7b701668'),
('eu', 111111, 'rickson.silva715@gmail.com', 0, 0, '698d51a19d8a121ce581499d7b701668');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
