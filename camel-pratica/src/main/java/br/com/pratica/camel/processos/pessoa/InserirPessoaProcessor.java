package br.com.pratica.camel.processos.pessoa;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import br.com.pratica.camel.dao.Dao;
import br.com.pratica.camel.impl.DaoImpl;
import br.com.pratica.camel.model.Operandos;
import br.com.pratica.camel.model.Pessoa;
import br.com.pratica.camel.model.RequestString;
import br.com.pratica.camel.model.ResponseString;
import br.com.pratica.camel.model.ResponseStringObject;

/*
 * Usa a camada de acesso ao banco para inserir uma pessoa 
 */
public class InserirPessoaProcessor implements Processor {


	public void process(Exchange exchange) throws Exception {
		Pessoa p =  exchange.getIn().getBody(Pessoa.class);
		
		Dao d = new DaoImpl();
		
		ResponseStringObject response = d.persistir(p);
		
		exchange.getIn().setBody(response);
	}

}
