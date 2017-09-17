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
-- Table `vocabulary`.`word_category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vocabulary`.`word_category` (
  `id` INT NOT NULL,
  `category` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `category_UNIQUE` (`category` ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `vocabulary`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vocabulary`.`user` (
  `id` INT NOT NULL,
  `login` VARCHAR(40) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `deleted_at` DATETIME NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `login_UNIQUE` (`login` ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `vocabulary`.`profile`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vocabulary`.`profile` (
  `id` INT NOT NULL,
  `user_id` INT NOT NULL,
  `user_mail` VARCHAR(30) NULL,
  `user_avatar` VARCHAR(50) NULL,
  `user_name` VARCHAR(40) NULL,
  `user_describe` VARCHAR(100) NULL,
  PRIMARY KEY (`id`, `user_id`),
  INDEX `user_id_idx` (`user_id` ASC),
  CONSTRAINT `user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `vocabulary`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `vocabulary`.`word`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vocabulary`.`word` (
  `id` INT NOT NULL,
  `category_id` INT NOT NULL,
  `id_user` INT NOT NULL,
  `word` VARCHAR(60) NOT NULL,
  `translate` VARCHAR(100) NOT NULL,
  `month` VARCHAR(20) NULL,
  `year` INT NULL,
  `full_date` DATETIME NOT NULL,
  PRIMARY KEY (`id`, `id_user`, `category_id`),
  INDEX `category_id_idx` (`category_id` ASC),
  INDEX `user_id_idx` (`id_user` ASC),
  CONSTRAINT `category_id`
    FOREIGN KEY (`category_id`)
    REFERENCES `vocabulary`.`word_category` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_user`
    FOREIGN KEY (`id_user`)
    REFERENCES `vocabulary`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;