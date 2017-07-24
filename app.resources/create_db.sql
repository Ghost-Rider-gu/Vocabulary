SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema engbang
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `engbang` ;

-- -----------------------------------------------------
-- Schema engbang
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `engbang` DEFAULT CHARACTER SET utf8 ;
USE `engbang` ;

-- -----------------------------------------------------
-- Table `engbang`.`profile`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `engbang`.`profile` ;

CREATE TABLE IF NOT EXISTS `engbang`.`profile` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_mail` VARCHAR(30) NULL,
  `user_avatar` VARCHAR(45) NULL,
  `user_name` VARCHAR(80) NULL,
  `user_describe` VARCHAR(100) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `engbang`.`word_category`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `engbang`.`word_category` ;

CREATE TABLE IF NOT EXISTS `engbang`.`word_category` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `category` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `category_UNIQUE` (`category` ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `engbang`.`word`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `engbang`.`word` ;

CREATE TABLE IF NOT EXISTS `engbang`.`word` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `category_id` INT NOT NULL,
  `word` VARCHAR(50) NOT NULL,
  `translate` VARCHAR(60) NOT NULL,
  `month` VARCHAR(15) NOT NULL,
  `year` INT NOT NULL,
  `full_date` DATETIME NOT NULL,
  PRIMARY KEY (`id`, `category_id`),
  INDEX `category_id_idx` (`category_id` ASC),
  CONSTRAINT `category_id`
    FOREIGN KEY (`category_id`)
    REFERENCES `engbang`.`word_category` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `engbang`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `engbang`.`user` ;

CREATE TABLE IF NOT EXISTS `engbang`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `profile_id` INT NOT NULL,
  `word_id` INT NOT NULL,
  `login` VARCHAR(45) NOT NULL,
  `password` VARCHAR(15) NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `deleted_at` DATETIME NULL,
  PRIMARY KEY (`id`, `profile_id`, `word_id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  UNIQUE INDEX `profile_id_UNIQUE` (`profile_id` ASC),
  UNIQUE INDEX `word_id_UNIQUE` (`word_id` ASC),
  CONSTRAINT `profile_id`
    FOREIGN KEY (`profile_id`)
    REFERENCES `engbang`.`profile` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `wor_id`
    FOREIGN KEY (`word_id`)
    REFERENCES `engbang`.`word` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;