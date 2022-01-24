package com.ibm.model;

import java.util.List;
import org.springframework.util.MultiValueMap;
import org.springframework.util.LinkedMultiValueMap;

import com.ibm.model.UpdateDirectDebitsInput;
import org.springframework.http.ResponseEntity;
import com.ibm.model.UpdateDirectDebitsOutput;


public class UpdateDirectDebitsResponseWrapper {

	private UpdateDirectDebitsOutput response;
        
        private MultiValueMap<String,String> headers = new LinkedMultiValueMap<>();

        public MultiValueMap<String, String> getHeaders(){
            return this.headers;
	}

	public void setHeaders(MultiValueMap<String,String> headers){
            this.headers = headers;
	}
        
        public void addHeaders(String header, List<String> value) {
            headers.put(header, value);
        }
 
	public UpdateDirectDebitsOutput getResponse(){
            return response;
	}
 
	public void setResponse(UpdateDirectDebitsOutput response){
            this.response=response;
	}  
}
