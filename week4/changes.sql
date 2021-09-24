ALTER TABLE `neobis`.`cake` 
CHANGE COLUMN `id` `id` INT(11) NOT NULL ,
ADD PRIMARY KEY (`id`);
;

ALTER TABLE `neobis`.`pie` 
CHANGE COLUMN `id` `id` INT(11) NOT NULL ,
ADD PRIMARY KEY (`id`);
;

ALTER TABLE `neobis`.`uniquedonut` 
CHANGE COLUMN `id` `id` INT(11) NOT NULL ,
ADD PRIMARY KEY (`id`);
;

ALTER TABLE `neobis`.`uniquedonut` 
ADD CONSTRAINT `id`
  FOREIGN KEY (`id`)
  REFERENCES `neobis`.`donut` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;