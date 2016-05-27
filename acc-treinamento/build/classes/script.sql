CREATE TABLE USUARIO(
	id INTEGER auto_increment,
	usuario VARCHAR(30),
	enterpriseId VARCHAR(30),
	senha VARCHAR(30),
	nome VARCHAR(30),
    cpf varchar(14),
	CONSTRAINT USUARIO_pk PRIMARY KEY(id)
);

CREATE TABLE ESCOLA(
	id integer auto_increment,
	descricao varchar(100),
	endereco varchar(100),
	CONSTRAINT ESCOLA_pk PRIMARY KEY(id)
);

CREATE TABLE INSCRICAO(
	id integer auto_increment,
	nome varchar(100),
	email varchar(100),
	id_escola integer,
	id_horario integer,
	CONSTRAINT INSCRICAO_pk PRIMARY KEY(id),
	CONSTRAINT INSCRICAO_ESCOLA_fk FOREIGN KEY (id_escola) REFERENCES ESCOLA(id),
	CONSTRAINT HORARIO_INSCRICAO_fk FOREIGN KEY (id_horario) REFERENCES HORARIO(id)
	
);

CREATE TABLE HORARIO (
	id integer auto_increment,
	descricao time,
	CONSTRAINT HORARIO_PK PRIMARY KEY(ID),
	UNIQUE(DESCRICAO)
);
