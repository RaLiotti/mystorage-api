package com.mystorage.api.model;

import java.time.LocalDateTime;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Produto.class)
public abstract class Produto_ {

	public static volatile SingularAttribute<Produto, String> tipo;
	public static volatile SingularAttribute<Produto, LocalDateTime> dataValidade;
	public static volatile SingularAttribute<Produto, LocalDateTime> dataFabricacao;
	public static volatile SingularAttribute<Produto, Double> valor;
	public static volatile SingularAttribute<Produto, Calendar> dataInclusao;
	public static volatile SingularAttribute<Produto, Long> id;
	public static volatile SingularAttribute<Produto, String> nomeProduto;

	public static final String TIPO = "tipo";
	public static final String DATA_VALIDADE = "dataValidade";
	public static final String DATA_FABRICACAO = "dataFabricacao";
	public static final String VALOR = "valor";
	public static final String DATA_INCLUSAO = "dataInclusao";
	public static final String ID = "id";
	public static final String NOME_PRODUTO = "nomeProduto";

}

