package com.ibm.services.impl;
 
import java.util.*;
 
import com.ibm.model.CreateCardTransactionP;
import com.ibm.model.CreateCardTransactionResponseWrapper;
import com.ibm.services.CreateCardTransactionI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class CreateCardTransactionImpl implements CreateCardTransactionI {
 
    private static final Log logger = LogFactory.getLog(CreateCardTransactionImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public CreateCardTransactionResponseWrapper execute(CreateCardTransactionP requestParams){
        //TODO
        return new CreateCardTransactionResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
