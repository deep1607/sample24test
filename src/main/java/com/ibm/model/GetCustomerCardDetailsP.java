package com.ibm.model;

import org.springframework.http.ResponseEntity;
import com.ibm.model.GetCustomerCardDetailsOutput;

public class GetCustomerCardDetailsP {

    private String branchId;
    private String financialInstitution;
    private String journeyId;
    private String lang;
    private String originUserId;
    private String providerLogin;
    private String providerPassword;
    private String timeStamp;
    private String cif;
    private String legalId;
    private String correlationId;
    private String key;
    private String originChannelId;
    private String originDeptId;
    private String originEmployeeId;
    private String originSourceId;
    private String originTerminalId;
    private String value;
    private String accountNumber;
    private String cardNumber;
    private String cardStatus;

    public GetCustomerCardDetailsP() {

    }

    public GetCustomerCardDetailsP(String branchId,String financialInstitution,String journeyId,String lang,String originUserId,String providerLogin,String providerPassword,String timeStamp,String cif,String legalId,String correlationId,String key,String originChannelId,String originDeptId,String originEmployeeId,String originSourceId,String originTerminalId,String value,String accountNumber,String cardNumber,String cardStatus) {
        this.branchId = branchId;
        this.financialInstitution = financialInstitution;
        this.journeyId = journeyId;
        this.lang = lang;
        this.originUserId = originUserId;
        this.providerLogin = providerLogin;
        this.providerPassword = providerPassword;
        this.timeStamp = timeStamp;
        this.cif = cif;
        this.legalId = legalId;
        this.correlationId = correlationId;
        this.key = key;
        this.originChannelId = originChannelId;
        this.originDeptId = originDeptId;
        this.originEmployeeId = originEmployeeId;
        this.originSourceId = originSourceId;
        this.originTerminalId = originTerminalId;
        this.value = value;
        this.accountNumber = accountNumber;
        this.cardNumber = cardNumber;
        this.cardStatus = cardStatus;
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
    public String getCif () {
        return cif;
    }

    public void setCif (String cif) {
        this.cif = cif;
    }
    public String getLegalId () {
        return legalId;
    }

    public void setLegalId (String legalId) {
        this.legalId = legalId;
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
    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getCardNumber () {
        return cardNumber;
    }

    public void setCardNumber (String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getCardStatus () {
        return cardStatus;
    }

    public void setCardStatus (String cardStatus) {
        this.cardStatus = cardStatus;
    }

}
