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
	id_escola integer;
	CONSTRAINT INSCRICAO_pk PRIMARY KEY(id)
	CONSTRAINT INSCRICAO_ESCOLA_fk FOREIGN KEY (id_problema) REFERENCES ESCOLA(id)
	
);

CREATE TABLE HORARIO (
	id integer auto_increment,
	descricao time,
	CONSTRAINT HORARIO_PK PRIMARY KEY(ID),
	UNIQUE(DESCRICAO)
)

CREATE TABLE HORARIO_INSCRICAO(
	id integer auto_increment,
	id_inscricao integer not null,
	id_horario integer not null,
	CONSTRAINT HORARIO_INSCRICAO_PK PRIMARY KEY(ID),
	CONSTRAINT HORARIO_INSCRICAO_fk FOREIGN KEY (id_inscricao) REFERENCES INSCRICAO(id),
	CONSTRAINT HORARIO_INSCRICAO_2_fk FOREIGN KEY (id_horario) REFERENCES HORARIO(id)
)
