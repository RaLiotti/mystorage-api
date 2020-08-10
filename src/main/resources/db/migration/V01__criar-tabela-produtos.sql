create table produtos(
	id BigInt auto_increment not null key,
	nomeProduto Varchar(100) not null,
	valor int(10) not null,
	tipo Varchar(50) not null,
	dataInclusao timestamp,
	dataFabricacao timestamp,
	dataValidade timestamp
);