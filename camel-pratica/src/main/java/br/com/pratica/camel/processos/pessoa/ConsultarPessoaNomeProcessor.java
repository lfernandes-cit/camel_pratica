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
 * Usa a camada de acesso ao banco para consultar uma pessoa por nome
 */
public class ConsultarPessoaNomeProcessor implements Processor {


	public void process(Exchange exchange) throws Exception {
		String nome =  exchange.getIn().getBody(String.class);
		
		Dao d = new DaoImpl();
		
		ResponseStringObject response = d.consultaNome(nome);
								
		exchange.getIn().setBody(response);
	}

}
