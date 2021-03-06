package br.com.pratica.camel.processos.calculadora;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import br.com.pratica.camel.model.Operandos;
import br.com.pratica.camel.model.RequestString;
import br.com.pratica.camel.model.ResponseString;

/*
 * Executa uma divis�o simples nos valores do objeto Operandos 
 */

public class DivisaoProcessor implements Processor {


	public void process(Exchange exchange) throws Exception {
		Operandos o =  exchange.getIn().getBody(Operandos.class);
		
		ResponseString r = new ResponseString();
		r.setOutput(String.valueOf(o.getN1() / o.getN2()));
		
		exchange.getIn().setBody(r);
	}

}
