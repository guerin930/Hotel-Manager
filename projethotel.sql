-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 11 juin 2020 à 04:07
-- Version du serveur :  5.7.26
-- Version de PHP :  7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `projethotel`
--

-- --------------------------------------------------------

--
-- Structure de la table `chambre`
--

DROP TABLE IF EXISTS `chambre`;
CREATE TABLE IF NOT EXISTS `chambre` (
  `idChambre` int(5) NOT NULL AUTO_INCREMENT,
  `numChambre` int(3) NOT NULL,
  `nbrPlaces` int(2) NOT NULL,
  `Etat` varchar(10) NOT NULL,
  `Type` varchar(10) NOT NULL,
  `idTarif` int(11) NOT NULL,
  PRIMARY KEY (`idChambre`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `chambre`
--

INSERT INTO `chambre` (`idChambre`, `numChambre`, `nbrPlaces`, `Etat`, `Type`, `idTarif`) VALUES
(1, 101, 2, 'libre', 'simple', 3),
(2, 102, 2, 'libre', 'simple', 3),
(3, 103, 2, 'libre', 'simple', 3),
(4, 104, 2, 'iibre', 'simple', 3),
(5, 105, 2, 'libre', 'simple', 3),
(6, 106, 2, 'libre', 'simple', 3),
(7, 107, 2, 'libre', 'nuit', 1),
(8, 108, 2, 'libre', 'nuit', 1),
(9, 108, 2, 'libre', 'nuit', 1),
(10, 109, 2, 'libre', 'nuit', 1),
(11, 110, 2, 'libre', 'nuit', 1),
(12, 111, 2, 'libre', 'nuit', 1),
(13, 112, 2, 'libre', 'nuit', 1),
(14, 113, 2, 'libre', 'nuit', 1),
(15, 114, 2, 'libre', 'nuit', 1),
(16, 115, 2, 'libre', 'nuit', 1),
(17, 116, 2, 'libre', 'nuit', 1),
(18, 117, 4, 'occupee', 'suite', 2),
(19, 118, 4, 'occupee', 'suite', 2),
(20, 119, 4, 'occupee', 'suite', 2),
(21, 120, 4, 'occupee', 'suite', 2);

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `idClient` int(10) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(20) NOT NULL,
  `Prenom` varchar(20) NOT NULL,
  `Nationalite` varchar(15) NOT NULL,
  `Adresse` varchar(40) DEFAULT NULL,
  `Telephone` int(10) NOT NULL,
  `profession` varchar(60) NOT NULL,
  `passport_cni` int(11) DEFAULT NULL,
  `typeDePiece` varchar(30) NOT NULL,
  PRIMARY KEY (`idClient`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`idClient`, `Nom`, `Prenom`, `Nationalite`, `Adresse`, `Telephone`, `profession`, `passport_cni`, `typeDePiece`) VALUES
(5, 'dacey', 'ronald', 'americaine', '123rue ovani', 876545, 'gangster', 20154789, ''),
(6, 'tallman', 'nickolas', 'belge', 'rue 1789', 12457964, 'gestionnaire', 20157984, 'CNI'),
(7, 'moralez', 'izzy', 'americaine', 'washington', 33478946, 'hackeuse', 201523479, 'CNI'),
(8, 'jirad', 'jizzy', 'americaine', 'queens', 12457976, 'banquier', 20014579, 'CNI'),
(9, 'calldrean', 'andre', 'aef', 'china', 14568763, 'comptable', 20017896, 'CNI'),
(10, 'foun', 'gilb', 'camerounais', 'mecque', 237457912, 'ingenieur', 200412457, 'cni'),
(11, 'guiraud', 'pauk', 'camerounaise', 'norveges', 237678941, 'capitaine', 200112477, 'CNI'),
(12, 'chazer', 'ralf', 'camerounais', 'france', 237457945, 'chef', 11204785, 'CNI'),
(15, 'baugrand', 'francis', 'francais', 'london', 147157945, 'pilote', 1232497, 'CNI'),
(16, 'grand B', 'leon', 'americaine', 'hollyville', 147898431, 'artiste', 20101245, 'CNI');

-- --------------------------------------------------------

--
-- Structure de la table `facture`
--

DROP TABLE IF EXISTS `facture`;
CREATE TABLE IF NOT EXISTS `facture` (
  `idFacture` int(11) NOT NULL AUTO_INCREMENT,
  `DateFacture` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  `Montant` float DEFAULT NULL,
  `typepaiement` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `idClient` int(11) DEFAULT NULL,
  `idChambre` int(11) DEFAULT NULL,
  `qte` int(11) NOT NULL,
  `mntTTC` varchar(30) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`idFacture`),
  KEY `idClient` (`idClient`),
  KEY `idChambre` (`idChambre`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `facture`
--

INSERT INTO `facture` (`idFacture`, `DateFacture`, `Montant`, `typepaiement`, `idClient`, `idChambre`, `qte`, `mntTTC`) VALUES
(27, '13-mai-2020', 8000, 'Mobile money', 5, 1, 1, '8000'),
(28, '13-mai-2020', 8000, 'Carte electronique', 6, 1, 1, '8000'),
(29, '13-mai-2020', 8000, 'Espece', 7, 3, 1, '8000'),
(30, '13-mai-2020', 15000, 'Espece', 8, 21, 2, '30000'),
(31, '04-juin-2020', 10000, 'Espece', 5, 7, 20, '200000 FCFA'),
(32, '04-juin-2020', 8000, 'Espece', 16, 1, 1, '8000 FCFA'),
(33, '08-juin-2020', 15000, 'Mobile money', 5, 18, 2, '30000 FCFA'),
(34, '08-juin-2020', 15000, 'Espece', 5, 18, 2, '30000 FCFA');

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE IF NOT EXISTS `reservation` (
  `idReservation` int(10) NOT NULL AUTO_INCREMENT,
  `dateReservation` varchar(60) NOT NULL,
  `dateArrive` varchar(60) NOT NULL,
  `dateDepart` varchar(60) NOT NULL,
  `nbrJour` int(2) NOT NULL,
  `idClient` int(10) DEFAULT NULL,
  `idChambre` int(5) DEFAULT NULL,
  `idSalle` int(2) DEFAULT NULL,
  `idTable` int(10) DEFAULT NULL,
  PRIMARY KEY (`idReservation`),
  KEY `client_reservation` (`idClient`),
  KEY `chambre_reservation` (`idChambre`),
  KEY `table_reservation` (`idTable`),
  KEY `idSalle` (`idSalle`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `reservation`
--

INSERT INTO `reservation` (`idReservation`, `dateReservation`, `dateArrive`, `dateDepart`, `nbrJour`, `idClient`, `idChambre`, `idSalle`, `idTable`) VALUES
(2, '2020-05-08', '2020-05-08', '2020-05-09', 2, 5, 1, NULL, NULL),
(7, '2020-05-02', '2020-05-03', '2020-05-04', 1, 6, 21, NULL, NULL),
(8, '2020-05-20', '2020-05-20', '2020-05-21', 3, 10, 18, NULL, NULL),
(9, '2020-05-20', '2020-05-20', '2020-05-22', 4, 11, 19, NULL, NULL),
(10, '2020-05-20', '2020-05-20', '2020-05-22', 1, 12, 20, NULL, NULL),
(11, '2020-05-20', '2020-05-20', '2020-05-24', 4, 15, 21, NULL, NULL),
(12, '2020-06-12', '2020-06-07', '2020-06-21', 1, 16, 1, NULL, NULL),
(13, '2020-06-06', '2020-06-07', '2020-06-10', 2, 15, 17, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

DROP TABLE IF EXISTS `salle`;
CREATE TABLE IF NOT EXISTS `salle` (
  `idSalle` int(2) NOT NULL,
  `Etat` varchar(10) NOT NULL,
  `Type` varchar(10) NOT NULL,
  PRIMARY KEY (`idSalle`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `table`
--

DROP TABLE IF EXISTS `table`;
CREATE TABLE IF NOT EXISTS `table` (
  `idTable` int(10) NOT NULL,
  `numTable` int(2) NOT NULL,
  `Etat` varchar(10) NOT NULL,
  `nbrPlaces` int(2) NOT NULL,
  PRIMARY KEY (`idTable`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `tarif`
--

DROP TABLE IF EXISTS `tarif`;
CREATE TABLE IF NOT EXISTS `tarif` (
  `idTarif` int(10) NOT NULL AUTO_INCREMENT,
  `Prix` float NOT NULL,
  `Type` varchar(15) NOT NULL,
  PRIMARY KEY (`idTarif`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `tarif`
--

INSERT INTO `tarif` (`idTarif`, `Prix`, `Type`) VALUES
(1, 10000, 'nuit'),
(2, 15000, 'suite'),
(3, 8000, 'simple'),
(4, 3000, 'sieste');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `idUtilisateur` int(5) NOT NULL AUTO_INCREMENT,
  `Login` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Role` varchar(20) NOT NULL,
  `interface` varchar(30) NOT NULL,
  PRIMARY KEY (`idUtilisateur`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`idUtilisateur`, `Login`, `Password`, `Role`, `interface`) VALUES
(1, 'dir', '1', 'Directeur', 'dir'),
(2, 'chef', '2', 'Chef de reception', 'chef'),
(3, 'rec', '3', 'Receptionniste', 'rec'),
(4, 'admin', 'admin', 'administrateur', '');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `reservation_ibfk_1` FOREIGN KEY (`idSalle`) REFERENCES `salle` (`idSalle`),
  ADD CONSTRAINT `table_reservation` FOREIGN KEY (`idTable`) REFERENCES `table` (`idTable`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
