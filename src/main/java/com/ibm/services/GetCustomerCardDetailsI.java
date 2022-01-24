package com.ibm.services;

import com.ibm.model.GetCustomerCardDetailsP;
import com.ibm.model.GetCustomerCardDetailsResponseWrapper;

public interface GetCustomerCardDetailsI {

    public GetCustomerCardDetailsResponseWrapper execute(GetCustomerCardDetailsP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
