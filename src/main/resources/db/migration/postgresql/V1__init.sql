CREATE TABLE empresa(
	id SERIAL NOT NULL,
	razaoSocial VARCHAR(255) NOT NULL,
	cnpj VARCHAR(255) NOT NULL,
	dataCriacao TIMESTAMP NOT NULL,
	dataAtualizacao TIMESTAMP NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE funcionario(
	id SERIAL NOT NULL,
	nome VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL,
	senha VARCHAR(255) NOT NULL,
	cpf VARCHAR(255) NOT NULL,
	valorHora DECIMAL NOT NULL,
	qtdHorasTrabalhoDia INTEGER NOT NULL,
	qtdHorasAlmoco INTEGER NOT NULL,
	perfil VARCHAR(255) NOT NULL,
	dataCriacao TIMESTAMP NOT NULL,
	dataAtualizacao TIMESTAMP NOT NULL,
	empresa_id INTEGER NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (empresa_id) REFERENCES empresa (id)
);

CREATE TABLE lancamento(
	id SERIAL NOT NULL,
	data TIMESTAMP NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	localizacao VARCHAR(255) NOT NULL,
	dataCriacao TIMESTAMP NOT NULL,
	dataAtualizacao TIMESTAMP NOT NULL,
	tipo VARCHAR(255) NOT NULL,
	funcionario INTEGER NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (funcionario) REFERENCES funcionario (id)
);