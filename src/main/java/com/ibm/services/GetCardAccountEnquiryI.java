package com.ibm.services;

import com.ibm.model.GetCardAccountEnquiryP;
import com.ibm.model.GetCardAccountEnquiryResponseWrapper;

public interface GetCardAccountEnquiryI {

    public GetCardAccountEnquiryResponseWrapper execute(GetCardAccountEnquiryP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
