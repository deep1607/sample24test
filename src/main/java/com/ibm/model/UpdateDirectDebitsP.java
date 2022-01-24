package com.ibm.model;

import com.ibm.model.UpdateDirectDebitsInput;
import org.springframework.http.ResponseEntity;
import com.ibm.model.UpdateDirectDebitsOutput;

public class UpdateDirectDebitsP {

    private String branchId;
    private String financialInstitution;
    private String journeyId;
    private String lang;
    private String originUserId;
    private String providerLogin;
    private String providerPassword;
    private String timeStamp;
    private UpdateDirectDebitsInput body;
    private String correlationId;
    private String key;
    private String originChannelId;
    private String originDeptId;
    private String originEmployeeId;
    private String originSourceId;
    private String originTerminalId;
    private String value;

    public UpdateDirectDebitsP() {

    }

    public UpdateDirectDebitsP(String branchId,String financialInstitution,String journeyId,String lang,String originUserId,String providerLogin,String providerPassword,String timeStamp,UpdateDirectDebitsInput body,String correlationId,String key,String originChannelId,String originDeptId,String originEmployeeId,String originSourceId,String originTerminalId,String value) {
        this.branchId = branchId;
        this.financialInstitution = financialInstitution;
        this.journeyId = journeyId;
        this.lang = lang;
        this.originUserId = originUserId;
        this.providerLogin = providerLogin;
        this.providerPassword = providerPassword;
        this.timeStamp = timeStamp;
        this.body = body;
        this.correlationId = correlationId;
        this.key = key;
        this.originChannelId = originChannelId;
        this.originDeptId = originDeptId;
        this.originEmployeeId = originEmployeeId;
        this.originSourceId = originSourceId;
        this.originTerminalId = originTerminalId;
        this.value = value;
    }

    public String getBranchId () {
        return branchId;
    }

    public void setBranchId (String branchId) {
        this.branchId = branchId;
    }
    public String getFinancialInstitution () {
        return financialInstitution;
    }

    public void setFinancialInstitution (String financialInstitution) {
        this.financialInstitution = financialInstitution;
    }
    public String getJourneyId () {
        return journeyId;
    }

    public void setJourneyId (String journeyId) {
        this.journeyId = journeyId;
    }
    public String getLang () {
        return lang;
    }

    public void setLang (String lang) {
        this.lang = lang;
    }
    public String getOriginUserId () {
        return originUserId;
    }

    public void setOriginUserId (String originUserId) {
        this.originUserId = originUserId;
    }
    public String getProviderLogin () {
        return providerLogin;
    }

    public void setProviderLogin (String providerLogin) {
        this.providerLogin = providerLogin;
    }
    public String getProviderPassword () {
        return providerPassword;
    }

    public void setProviderPassword (String providerPassword) {
        this.providerPassword = providerPassword;
    }
    public String getTimeStamp () {
        return timeStamp;
    }

    public void setTimeStamp (String timeStamp) {
        this.timeStamp = timeStamp;
    }
    public UpdateDirectDebitsInput getBody () {
        return body;
    }

    public void setBody (UpdateDirectDebitsInput body) {
        this.body = body;
    }
    public String getCorrelationId () {
        return correlationId;
    }

    public void setCorrelationId (String correlationId) {
        this.correlationId = correlationId;
    }
    public String getKey () {
        return key;
    }

    public void setKey (String key) {
        this.key = key;
    }
    public String getOriginChannelId () {
        return originChannelId;
    }

    public void setOriginChannelId (String originChannelId) {
        this.originChannelId = originChannelId;
    }
    public String getOriginDeptId () {
        return originDeptId;
    }

    public void setOriginDeptId (String originDeptId) {
        this.originDeptId = originDeptId;
    }
    public String getOriginEmployeeId () {
        return originEmployeeId;
    }

    public void setOriginEmployeeId (String originEmployeeId) {
        this.originEmployeeId = originEmployeeId;
    }
    public String getOriginSourceId () {
        return originSourceId;
    }

    public void setOriginSourceId (String originSourceId) {
        this.originSourceId = originSourceId;
    }
    public String getOriginTerminalId () {
        return originTerminalId;
    }

    public void setOriginTerminalId (String originTerminalId) {
        this.originTerminalId = originTerminalId;
    }
    public String getValue () {
        return value;
    }

    public void setValue (String value) {
        this.value = value;
    }

}
