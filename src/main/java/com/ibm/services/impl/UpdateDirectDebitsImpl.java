package com.ibm.services.impl;
 
import java.util.*;
 
import com.ibm.model.UpdateDirectDebitsP;
import com.ibm.model.UpdateDirectDebitsResponseWrapper;
import com.ibm.services.UpdateDirectDebitsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class UpdateDirectDebitsImpl implements UpdateDirectDebitsI {
 
    private static final Log logger = LogFactory.getLog(UpdateDirectDebitsImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public UpdateDirectDebitsResponseWrapper execute(UpdateDirectDebitsP requestParams){
        //TODO
        return new UpdateDirectDebitsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
