package com.nttdata.bootcamp.operationservice.application;


/*
 * Un cliente puede hacer depósitos y retiros de sus cuentas bancarias.
 *
 * El sistema debe permitir consultar los saldos disponibles en sus cuentas bancarias
 *
 * El sistema debe permitir consultar todos los movimientos de un producto bancario
 * que tiene un cliente.
 *
 */

import com.nttdata.bootcamp.operationservice.domain.Statement;
import com.nttdata.bootcamp.operationservice.domain.dto.Balance;
import com.nttdata.bootcamp.operationservice.domain.dto.OperationData;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountOperations {

    Mono<Statement> deposit(OperationData operationData);
    Mono<Statement> withdraw(OperationData operationData);

    Mono<Balance> getBalance(String accountNumber);

    Flux<Statement> getStatements(String accountNumber);

}
