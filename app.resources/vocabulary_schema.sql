SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema vocabulary
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `vocabulary` ;

-- -----------------------------------------------------
-- Schema vocabulary
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `vocabulary` DEFAULT CHARACTER SET utf8 ;
USE `vocabulary` ;

-- -----------------------------------------------------
-- Table `vocabulary`.`categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vocabulary`.`categories` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(40) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `vocabulary`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vocabulary`.`users` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `created_at` DATETIME NOT NULL,
  `deleted_at` DATETIME NULL DEFAULT NULL,
  `updated_at` DATETIME NOT NULL,
  `login` VARCHAR(35) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `UK_ow0gan20590jrb00upg3va2fn` (`login` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `vocabulary`.`vocabularies`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vocabulary`.`vocabularies` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) NOT NULL,
  `user_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKl1u60ke1v9yv34hq1p9n73fce` (`user_id` ASC),
  CONSTRAINT `FKl1u60ke1v9yv34hq1p9n73fce`
    FOREIGN KEY (`user_id`)
    REFERENCES `vocabulary`.`users` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `vocabulary`.`words`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vocabulary`.`words` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `created_at` DATETIME NOT NULL,
  `deleted_at` DATETIME NULL DEFAULT NULL,
  `updated_at` DATETIME NOT NULL,
  `month` VARCHAR(255) NOT NULL,
  `word` VARCHAR(255) NOT NULL,
  `year` INT(11) NOT NULL,
  `category_id` BIGINT(20) NOT NULL,
  `vocabulary_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKbh72c6e9lwn3j6mssgvsk405m` (`category_id` ASC),
  INDEX `FKebw5glj5j8y19e2877gndlr3w` (`vocabulary_id` ASC),
  CONSTRAINT `FKbh72c6e9lwn3j6mssgvsk405m`
    FOREIGN KEY (`category_id`)
    REFERENCES `vocabulary`.`categories` (`id`),
  CONSTRAINT `FKebw5glj5j8y19e2877gndlr3w`
    FOREIGN KEY (`vocabulary_id`)
    REFERENCES `vocabulary`.`vocabularies` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `vocabulary`.`translates`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vocabulary`.`translates` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `translate` VARCHAR(255) NOT NULL,
  `word_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKei8htxc8fgl8pmr8whmldlidg` (`word_id` ASC),
  CONSTRAINT `FKei8htxc8fgl8pmr8whmldlidg`
    FOREIGN KEY (`word_id`)
    REFERENCES `vocabulary`.`words` (`id`)
    ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;