package com.ibm.services;

import com.ibm.model.CreateCardTransactionP;
import com.ibm.model.CreateCardTransactionResponseWrapper;

public interface CreateCardTransactionI {

    public CreateCardTransactionResponseWrapper execute(CreateCardTransactionP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
