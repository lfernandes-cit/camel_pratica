/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.pratica.camel.services;

import br.com.pratica.camel.model.Pessoa;
import br.com.pratica.camel.model.ResponseString;
import br.com.pratica.camel.model.ResponseStringObject;


/*
 * Servico - Pessoa
 * Esse servico possui as opera��es b�sicas de banco de dados com um objeto
 */

public interface PessoaService {
    
	ResponseStringObject inserirPessoa(Pessoa p);
	ResponseStringObject consultarPessoaId(Integer id);
	ResponseStringObject consultarPessoaNome(String nome);
    String deletarPessoaId(Integer id);
    ResponseStringObject editarPessoa(Pessoa p);
    
}

