
DELIMITER $$

DROP SCHEMA IF EXISTS TeamForma $$
-- -----------------------------------------------------
-- Schema TeamForma
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema TeamForma
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `TeamForma` DEFAULT CHARACTER SET utf8 $$
USE `TeamForma` $$

-- -----------------------------------------------------
-- Table `TeamForma`.`Formation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TeamForma`.`Formation` (
  `idFormation` INT NOT NULL AUTO_INCREMENT,
  `intitule` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`idFormation`))
ENGINE = InnoDB$$


-- -----------------------------------------------------
-- Table `TeamForma`.`Personne`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TeamForma`.`Personne` (
  `idPersonne` INT NOT NULL AUTO_INCREMENT,
  `prenom` VARCHAR(45) NOT NULL,
  `nom` VARCHAR(45) NOT NULL,
  `mail` VARCHAR(45) NOT NULL,
  `adresse` VARCHAR(45) NOT NULL,
  `codePostal` VARCHAR(45) NOT NULL,
  `ville` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `telephone` VARCHAR(45) NOT NULL,
  `photo` VARCHAR(45) NULL,
  `estAdmin` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`idPersonne`),
  UNIQUE INDEX `mail_UNIQUE` (`mail` ASC))
ENGINE = InnoDB$$


-- -----------------------------------------------------
-- Table `TeamForma`.`Module`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TeamForma`.`Module` (
  `idModule` INT NOT NULL AUTO_INCREMENT,
  `intitule` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NULL,
  `nbJour` INT NOT NULL,
  PRIMARY KEY (`idModule`))
ENGINE = InnoDB$$


-- -----------------------------------------------------
-- Table `TeamForma`.`Session`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TeamForma`.`Session` (
  `idSession` INT NOT NULL AUTO_INCREMENT,
  `idFormation` INT NOT NULL,
  `dateDebut` DATE NOT NULL,
  `dateFin` DATE NOT NULL,
  `nbPlace` INT NULL,
  PRIMARY KEY (`idSession`),
  INDEX `fk_Formation2_idx` (`idFormation` ASC),
  CONSTRAINT `fk_Formation2`
    FOREIGN KEY (`idFormation`)
    REFERENCES `TeamForma`.`Formation` (`idFormation`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB$$


-- -----------------------------------------------------
-- Table `TeamForma`.`Evaluation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TeamForma`.`Evaluation` (
  `idEvaluation` INT NOT NULL AUTO_INCREMENT,
  `idModule` INT NOT NULL,
  `idSession` INT NOT NULL,
  `dateEffet` DATE NOT NULL,
  `commentaire` VARCHAR(45) NULL,
  PRIMARY KEY (`idEvaluation`),
  INDEX `fk_Module2_idx` (`idModule` ASC),
  INDEX `fk_Session1_idx` (`idSession` ASC),
  CONSTRAINT `fk_Module2`
    FOREIGN KEY (`idModule`)
    REFERENCES `TeamForma`.`Module` (`idModule`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Session1`
    FOREIGN KEY (`idSession`)
    REFERENCES `TeamForma`.`Session` (`idSession`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB$$


-- -----------------------------------------------------
-- Table `TeamForma`.`EtatCandidature`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TeamForma`.`EtatCandidature` (
  `idEtatCandidature` INT NOT NULL AUTO_INCREMENT,
  `intitule` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idEtatCandidature`))
ENGINE = InnoDB$$


-- -----------------------------------------------------
-- Table `TeamForma`.`Note`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TeamForma`.`Note` (
  `idEvaluation` INT NOT NULL,
  `idPersonne` INT NOT NULL,
  `note` INT NOT NULL,
  PRIMARY KEY (`idEvaluation`, `idPersonne`),
  INDEX `fk_Personne1_idx` (`idPersonne` ASC),
  INDEX `fk_Evaluation_idx` (`idEvaluation` ASC),
  CONSTRAINT `fk_Evaluation`
    FOREIGN KEY (`idEvaluation`)
    REFERENCES `TeamForma`.`Evaluation` (`idEvaluation`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Personne1`
    FOREIGN KEY (`idPersonne`)
    REFERENCES `TeamForma`.`Personne` (`idPersonne`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB$$


-- -----------------------------------------------------
-- Table `TeamForma`.`ModuleFormation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TeamForma`.`ModuleFormation` (
  `idModule` INT NOT NULL,
  `idFormation` INT NOT NULL,
  PRIMARY KEY (`idModule`, `idFormation`),
  INDEX `fk_Formation1_idx` (`idFormation` ASC),
  INDEX `fk_Module1_idx` (`idModule` ASC),
  CONSTRAINT `fk_Module1`
    FOREIGN KEY (`idModule`)
    REFERENCES `TeamForma`.`Module` (`idModule`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Formation1`
    FOREIGN KEY (`idFormation`)
    REFERENCES `TeamForma`.`Formation` (`idFormation`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB$$


-- -----------------------------------------------------
-- Table `TeamForma`.`Candidature`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TeamForma`.`Candidature` (
  `idPersonne` INT NOT NULL,
  `idSession` INT NOT NULL,
  `idEtatCandidature` INT NOT NULL,
  `dateCandidature` DATE NOT NULL,
  PRIMARY KEY (`idPersonne`, `idSession`),
  INDEX `fk_Session2_idx` (`idSession` ASC),
  INDEX `fk_Personne2_idx` (`idPersonne` ASC),
  INDEX `fk_EtatCandidature1_idx` (`idEtatCandidature` ASC),
  CONSTRAINT `fk_Personne2`
    FOREIGN KEY (`idPersonne`)
    REFERENCES `TeamForma`.`Personne` (`idPersonne`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Session2`
    FOREIGN KEY (`idSession`)
    REFERENCES `TeamForma`.`Session` (`idSession`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_EtatCandidature1`
    FOREIGN KEY (`idEtatCandidature`)
    REFERENCES `TeamForma`.`EtatCandidature` (`idEtatCandidature`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB$$


-- -----------------------------------------------------
-- Table `TeamForma`.`Formateur`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TeamForma`.`Formateur` (
  `idPersonne` INT NOT NULL,
  `siteWeb` VARCHAR(45) NULL,
  INDEX `fk_Personne3_idx` (`idPersonne` ASC),
  PRIMARY KEY (`idPersonne`),
  CONSTRAINT `fk_Personne3`
    FOREIGN KEY (`idPersonne`)
    REFERENCES `TeamForma`.`Personne` (`idPersonne`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB$$


-- -----------------------------------------------------
-- Table `TeamForma`.`Intervenant`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TeamForma`.`Intervenant` (
  `idModule` INT NOT NULL,
  `idPersonne` INT NOT NULL,
  PRIMARY KEY (`idModule`, `idPersonne`),
  INDEX `fk_Formateur1_idx` (`idPersonne` ASC),
  INDEX `fk_Module3_idx` (`idModule` ASC),
  CONSTRAINT `fk_Module3`
    FOREIGN KEY (`idModule`)
    REFERENCES `TeamForma`.`Module` (`idModule`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Formateur1`
    FOREIGN KEY (`idPersonne`)
    REFERENCES `TeamForma`.`Formateur` (`idPersonne`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB$$

-- vue stagiaire--
DROP VIEW IF EXISTS stagiaire $$

CREATE VIEW stagiaire AS

SELECT p.*

FROM personne p
    INNER JOIN candidature c
  ON p.idPersonne = c.idPersonne

WHERE c.idEtatCandidature = 1 $$

-- Fin vue stagiaire--

DROP PROCEDURE IF EXISTS resetTeamForma $$
CREATE PROCEDURE resetTeamForma()
BEGIN
      
      -- Lever les contrainte d'intégrité--
      SET FOREIGN_KEY_CHECKS=0;

      -- Vider les tables--
  TRUNCATE TABLE Candidature;
  TRUNCATE TABLE EtatCandidature;
  TRUNCATE TABLE Evaluation;
  TRUNCATE TABLE Formateur;
  TRUNCATE TABLE Formation;
  TRUNCATE TABLE Intervenant;
  TRUNCATE TABLE Module;
  TRUNCATE TABLE ModuleFormation;
  TRUNCATE TABLE Note;
  TRUNCATE TABLE Personne;
  TRUNCATE TABLE Session;

      -- Remettre les contraintes
      SET FOREIGN_KEY_CHECKS=1;

      BEGIN

        DECLARE EXIT HANDLER FOR SQLSTATE '23000'
        BEGIN

        ROLLBACK;

        SHOW ERRORS;

            END;

                    START TRANSACTION;

            INSERT INTO personne 
            (idPersonne, prenom, nom, mail, adresse, codePostal, ville, password, telephone, photo, estAdmin) VALUES
            (1, 'Joel', 'JUNIOR', 'junior@joel.com', '6 rue de la mare blance', '77186', 'Noisiel', 'anana', '0658974512', null, 0),
            (2, 'Chi Wai', 'SENIOR', 'cwcheung@free.fr', '7 rue de la mare blanche', '77186', 'Noisiel', 'pipi', '0613580562', null, 0),
            (3, 'Sophie', 'SENIORETTE', 'sophie.amory@gmail.com', '1 rue de sarco', '92400', 'Neuilly', 'aribo', '0658155158', null, 0);

            INSERT INTO formation
            (idFormation, intitule, description) VALUES
            (1, 'Java', 'Developpeur Java'),
            (2, 'C#', 'Developpeur .Net'),
            (3, 'PHP', 'Developpeur Web');

            INSERT INTO module
            (idModule, intitule, description, nbJour) VALUES
            (1, 'Java SE', 'Java standart edition', 5),
            (2, 'Java EE', 'Java Entreprise edition', 5),
            (3, 'ADO.Net', 'Acces aux données', 5),
            (4, 'ENtity Framwork', 'framwork bd', 5),
            (5, 'ASP.Net', 'Web avec C#', 5),
            (6, 'Synphonie', 'framwork php', 5);

            INSERT INTO moduleformation
            (idModule, idFormation) VALUES
            (1,1),
            (2,1),
            (3,2),
            (4,2),
            (5,2),
            (6,3);

            INSERT INTO session
            (idSession, idFormation, dateDebut, dateFin, nbPlace) VALUES
            (1, 1, '2017-02-15', '2017-06-15', 15),
            (2, 2, '2017-03-15', '2017-07-15', 15),
            (3, 3, '2017-04-15', '2017-08-15', 15),
            (4, 1, '2018-03-15', '2018-06-06', 15);

            INSERT INTO etatcandidature
            (idEtatCandidature, intitule) VALUES
            (1, 'Accepter'),
            (2, 'Refuser'),
            (3, 'Attente');

            INSERT INTO candidature
            (idPersonne, idSession, idEtatCandidature, dateCandidature) VALUES
            (2, 1, 1, '2017-04-12'),
            (3, 1, 1, '2017-04-15');

            INSERT INTO evaluation
            (idEvaluation, idModule, idSession, dateEffet) VALUES
            (1, 1, 1, '2017-04-11'),
            (2, 2, 1, '2017-05-11'),
            (3, 3, 2, '2017-06-11');

            INSERT INTO note
            (idEvaluation, idPersonne, note) VALUES
            (1,2,15),
            (1,3,14),
            (2,2,12),
            (2,3,13);

            INSERT INTO formateur 
            (idPersonne, siteWeb) VALUES
            (1, 'www.joelbpro.com');

            INSERT INTO intervenant
            (idModule, idPersonne) VALUES
            (1, 1),
            (2, 1),
            (3, 1),
            (4, 1);

                  COMMIT;
                END;
    END$$

    CALL resetTeamForma()$$

    GRANT USAGE ON teamforma.* TO 'user_teamforma2017'@'localhost' IDENTIFIED BY 'pwd_teamforma2017'$$
    DROP USER 'user_teamforma2017'@'localhost'$$

    CREATE USER 'user_teamforma2017'@'localhost' IDENTIFIED BY 'pwd_teamforma2017'$$
    GRANT ALL ON teamforma.* TO 'user_teamforma2017'@'localhost'$$
    GRANT SELECT ON mysql.proc TO 'user_teamforma2017'@'localhost'$$
