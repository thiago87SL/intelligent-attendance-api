
-- *************************************************************************** --
-- VERSION 1.0.0 (September-23-2018) - Initial Project Development             --
-- *************************************************************************** --

--
-- TABLES' STRUCTURES
--

CREATE TABLE `empresa` (
	`id` bigint(20) NOT NULL,
	`cnpj` varchar(255) NOT NULL,
	`data_atualizacao` datetime NOT NULL,
	`data_criacao` datetime NOT NULL,
	`razao_social` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `funcionario` (
	`id` bigint(20) NOT NULL,
	`cpf` varchar(255) NOT NULL,
	`data_atualizacao` datetime NOT NULL,
	`data_criacao` datetime NOT NULL,
	`email` varchar(255) NOT NULL,
	`nome` varchar(255) NOT NULL,
	`perfil` varchar(255) NOT NULL,
	`qtd_horas_almoco` float DEFAULT NULL,
	`qtd_horas_trabalho_dia` float DEFAULT NULL,
	`senha` varchar(255) NOT NULL,
	`valor_hora` decimal(19,2) DEFAULT NULL,
	`empresa_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lancamento` (
	`id` bigint(20) NOT NULL,
	`data` datetime NOT NULL,
	`data_atualizacao` datetime NOT NULL,
	`data_criacao` datetime NOT NULL,
	`descricao` varchar(255) DEFAULT NULL,
	`localizacao` varchar(255) DEFAULT NULL,
	`tipo` varchar(255) NOT NULL,
	`funcionario_id` bigint(20) DEFAULT NULL	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- PRIMARY KEYS AND INDEXES FOR TABLES
--

ALTER TABLE `empresa` ADD PRIMARY KEY (`id`);
ALTER TABLE `funcionario` ADD PRIMARY KEY (`id`), ADD KEY `FK_empresa` (`empresa_id`);
ALTER TABLE `lancamento` ADD PRIMARY KEY (`id`), ADD KEY `FK_funcionario` (`funcionario_id`);

-- 
-- AUTO_INCREMENT FOR TABLES
-- 

ALTER TABLE `empresa` MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
ALTER TABLE `funcionario` MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
ALTER TABLE `lancamento` MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

-- 
-- CONSTRAINTS FOR TABLES
--
 
ALTER TABLE `funcionario` ADD CONSTRAINT `FK3ohhd4i7v1` FOREIGN KEY (`empresa_id`) REFERENCES `empresa` (`id`);
ALTER TABLE `lancamento` ADD CONSTRAINT `FKc3wgez3670` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionario` (`id`);
 
-- *************************************************************************** --
-- END of VERSION 1.0.0 (September-23-2018)                                    --
-- *************************************************************************** --