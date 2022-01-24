package com.ibm.services;

import com.ibm.model.UpdateDirectDebitsP;
import com.ibm.model.UpdateDirectDebitsResponseWrapper;

public interface UpdateDirectDebitsI {

    public UpdateDirectDebitsResponseWrapper execute(UpdateDirectDebitsP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
