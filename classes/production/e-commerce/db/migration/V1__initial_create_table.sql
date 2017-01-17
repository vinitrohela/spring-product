CREATE TABLE `products` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `version` INT NOT NULL DEFAULT 0,
  `name` VARCHAR(255) NOT NULL,
  `stocknumber` VARCHAR(255) NULL,
  `rating` INT NOT NULL DEFAULT 0,
  `numberofview` INT NOT NULL DEFAULT 0,
  `listprice` FLOAT NOT NULL,
  `percentoff` INT NOT NULL DEFAULT 0,
  `actualprice` FLOAT NOT NULL,
  `quantity` INT NULL DEFAULT 0,
  `isrestricted` TINYINT NULL DEFAULT 0,
  PRIMARY KEY (`id`));