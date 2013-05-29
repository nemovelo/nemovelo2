-- phpMyAdmin SQL Dump
-- version 3.5.8.1
-- http://www.phpmyadmin.net
--
-- Client: 127.0.0.1
-- Généré le: Mer 29 Mai 2013 à 16:15
-- Version du serveur: 5.6.11-log
-- Version de PHP: 5.4.14

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `nemovelo`
--

--
-- Contenu de la table `agentmaintenance`
--

INSERT INTO `agentmaintenance` (`idAgent`, `nom`, `prenom`, `dateDeNaissance`, `lieuDeNaissance`) VALUES
(1, 'Latour', 'Jean', '1965-05-06 00:00:00', 'Brest'),
(2, 'Anas', 'Anne', '1970-05-02 00:00:00', 'Paris');

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`idClient`, `nom`, `prenom`, `dateDeNaissance`, `lieuDeNaissance`) VALUES
(1, 'Super', 'Cyril', '1950-05-08 00:00:00', 'Canada'),
(2, 'Casanova', 'Juan-Baptista', '1960-05-14 00:00:00', 'Suède');


--
-- Contenu de la table `velo`
--

INSERT INTO `velo` (`idVelo`, `estFonctionnel`, `dateAchat`) VALUES
(1, 1, '2013-05-07 00:00:00'),
(2, 1, '2013-05-07 00:00:00'),
(3, 1, '2013-04-08 00:00:00'),
(4, 0, '2013-05-02 00:00:00');

--
-- Contenu de la table `station`
--

INSERT INTO `station` (`idStation`, `intitule`, `nbMaxVelo`, `coordX`, `coordY`) VALUES
(1, 'Gare', 30, 15, 35),
(2, 'Georges Besse', 20, 234, 353),
(3, 'Centre ville', 30, 24, 35),
(4, 'Petit pont', 25, 234, 353);


--
-- Contenu de la table `location`
--

INSERT INTO `location` (`idStationDebut`, `idStationFin`, `idClient`, `idVelo`, `dateDeDebut`, `dateDeFin`) VALUES
(1, 2, 1, 1, '2013-05-01 00:00:00', '2013-05-02 10:14:35');

--
-- Contenu de la table `reparation`
--

INSERT INTO `reparation` (`idAgent`, `idVelo`, `DateDeReparation`) VALUES
(1, 4, '2013-05-21 00:00:00');


--
-- Contenu de la table `stationnement`
--

INSERT INTO `stationnement` (`idStation`, `idVelo`, `DateDeDebut`, `DateDeFin`) VALUES
(1, 1, '2013-05-01 00:00:00', NULL),
(2, 2, '2013-05-01 00:00:00', '2013-05-12 00:00:00');


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
