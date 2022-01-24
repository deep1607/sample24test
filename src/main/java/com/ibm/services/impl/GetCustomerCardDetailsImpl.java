package com.ibm.services.impl;
 
import java.util.*;
 
import com.ibm.model.GetCustomerCardDetailsP;
import com.ibm.model.GetCustomerCardDetailsResponseWrapper;
import com.ibm.services.GetCustomerCardDetailsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class GetCustomerCardDetailsImpl implements GetCustomerCardDetailsI {
 
    private static final Log logger = LogFactory.getLog(GetCustomerCardDetailsImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public GetCustomerCardDetailsResponseWrapper execute(GetCustomerCardDetailsP requestParams){
        //TODO
        return new GetCustomerCardDetailsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
