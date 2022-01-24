package com.ibm.api;

import com.ibm.model.CreateCardTransactionFault;
import com.ibm.model.CreateCardTransactionInput;
import com.ibm.model.CreateCardTransactionOutput;
import com.ibm.model.GetCardAccountEnquiryFault;
import com.ibm.model.GetCardAccountEnquiryOutput;
import com.ibm.model.GetCustomerCardDetailsFault;
import com.ibm.model.GetCustomerCardDetailsOutput;
import com.ibm.model.UpdateDirectDebitsFault;
import com.ibm.model.UpdateDirectDebitsInput;
import com.ibm.model.UpdateDirectDebitsOutput;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.ibm.services.GetCustomerCardDetailsI;
import com.ibm.model.GetCustomerCardDetailsP;
import com.ibm.model.GetCustomerCardDetailsResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.ibm.services.CreateCardTransactionI;
import com.ibm.model.CreateCardTransactionP;
import com.ibm.model.CreateCardTransactionResponseWrapper;
import com.ibm.services.GetCardAccountEnquiryI;
import com.ibm.model.GetCardAccountEnquiryP;
import com.ibm.model.GetCardAccountEnquiryResponseWrapper;
import com.ibm.services.UpdateDirectDebitsI;
import com.ibm.model.UpdateDirectDebitsP;
import com.ibm.model.UpdateDirectDebitsResponseWrapper;

@RestController
public class CardsApiController implements CardsApi {

	@Autowired
	UpdateDirectDebitsI updateDirectDebitsI;


	@Autowired
	GetCardAccountEnquiryI getCardAccountEnquiryI;


	@Autowired
	CreateCardTransactionI createCardTransactionI;


	@Autowired
	GetCustomerCardDetailsI getCustomerCardDetailsI;


    public ResponseEntity<CreateCardTransactionOutput> createCardTransaction(@ApiParam(value = "" ,required=true) @RequestHeader(value="branchId", required=true) String branchId,@ApiParam(value = "" ,required=true) @RequestHeader(value="financialInstitution", required=true) String financialInstitution,@ApiParam(value = "" ,required=true) @RequestHeader(value="journeyId", required=true) String journeyId,@ApiParam(value = "" ,required=true) @RequestHeader(value="lang", required=true) String lang,@ApiParam(value = "" ,required=true) @RequestHeader(value="originUserId", required=true) String originUserId,@ApiParam(value = "" ,required=true) @RequestHeader(value="providerLogin", required=true) String providerLogin,@ApiParam(value = "" ,required=true) @RequestHeader(value="providerPassword", required=true) String providerPassword,@ApiParam(value = "" ,required=true) @RequestHeader(value="timeStamp", required=true) String timeStamp,@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreateCardTransactionInput body,@ApiParam(value = "" ) @RequestHeader(value="correlationId", required=false) String correlationId,@ApiParam(value = "" ) @RequestHeader(value="key", required=false) String key,@ApiParam(value = "" ) @RequestHeader(value="originChannelId", required=false) String originChannelId,@ApiParam(value = "" ) @RequestHeader(value="originDeptId", required=false) String originDeptId,@ApiParam(value = "" ) @RequestHeader(value="originEmployeeId", required=false) String originEmployeeId,@ApiParam(value = "" ) @RequestHeader(value="originSourceId", required=false) String originSourceId,@ApiParam(value = "" ) @RequestHeader(value="originTerminalId", required=false) String originTerminalId,@ApiParam(value = "" ) @RequestHeader(value="value", required=false) String value){
        
        CreateCardTransactionResponseWrapper res  = createCardTransactionI.execute(new CreateCardTransactionP(branchId, financialInstitution, journeyId, lang, originUserId, providerLogin, providerPassword, timeStamp, body, correlationId, key, originChannelId, originDeptId, originEmployeeId, originSourceId, originTerminalId, value));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<GetCardAccountEnquiryOutput> getCardAccountEnquiry(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "accountId", required = true) String accountId,@ApiParam(value = "" ,required=true) @RequestHeader(value="branchId", required=true) String branchId,@ApiParam(value = "" ,required=true) @RequestHeader(value="financialInstitution", required=true) String financialInstitution,@ApiParam(value = "" ,required=true) @RequestHeader(value="journeyId", required=true) String journeyId,@ApiParam(value = "" ,required=true) @RequestHeader(value="lang", required=true) String lang,@ApiParam(value = "" ,required=true) @RequestHeader(value="originUserId", required=true) String originUserId,@ApiParam(value = "" ,required=true) @RequestHeader(value="providerLogin", required=true) String providerLogin,@ApiParam(value = "" ,required=true) @RequestHeader(value="providerPassword", required=true) String providerPassword,@ApiParam(value = "" ,required=true) @RequestHeader(value="timeStamp", required=true) String timeStamp,@ApiParam(value = "Customer Identifier") @Valid @RequestParam(value = "cif", required = false) String cif,@ApiParam(value = "" ) @RequestHeader(value="correlationId", required=false) String correlationId,@ApiParam(value = "" ) @RequestHeader(value="key", required=false) String key,@ApiParam(value = "" ) @RequestHeader(value="originChannelId", required=false) String originChannelId,@ApiParam(value = "" ) @RequestHeader(value="originDeptId", required=false) String originDeptId,@ApiParam(value = "" ) @RequestHeader(value="originEmployeeId", required=false) String originEmployeeId,@ApiParam(value = "" ) @RequestHeader(value="originSourceId", required=false) String originSourceId,@ApiParam(value = "" ) @RequestHeader(value="originTerminalId", required=false) String originTerminalId,@ApiParam(value = "" ) @RequestHeader(value="value", required=false) String value,@ApiParam(value = "") @Valid @RequestParam(value = "cutOffDate", required = false) String cutOffDate,@ApiParam(value = "") @Valid @RequestParam(value = "cardNumber", required = false) String cardNumber){
        
        GetCardAccountEnquiryResponseWrapper res  = getCardAccountEnquiryI.execute(new GetCardAccountEnquiryP(accountId, branchId, financialInstitution, journeyId, lang, originUserId, providerLogin, providerPassword, timeStamp, cif, correlationId, key, originChannelId, originDeptId, originEmployeeId, originSourceId, originTerminalId, value, cutOffDate, cardNumber));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<GetCustomerCardDetailsOutput> getCustomerCardDetails(@ApiParam(value = "" ,required=true) @RequestHeader(value="branchId", required=true) String branchId,@ApiParam(value = "" ,required=true) @RequestHeader(value="financialInstitution", required=true) String financialInstitution,@ApiParam(value = "" ,required=true) @RequestHeader(value="journeyId", required=true) String journeyId,@ApiParam(value = "" ,required=true) @RequestHeader(value="lang", required=true) String lang,@ApiParam(value = "" ,required=true) @RequestHeader(value="originUserId", required=true) String originUserId,@ApiParam(value = "" ,required=true) @RequestHeader(value="providerLogin", required=true) String providerLogin,@ApiParam(value = "" ,required=true) @RequestHeader(value="providerPassword", required=true) String providerPassword,@ApiParam(value = "" ,required=true) @RequestHeader(value="timeStamp", required=true) String timeStamp,@ApiParam(value = "") @Valid @RequestParam(value = "cif", required = false) String cif,@ApiParam(value = "") @Valid @RequestParam(value = "legalId", required = false) String legalId,@ApiParam(value = "" ) @RequestHeader(value="correlationId", required=false) String correlationId,@ApiParam(value = "" ) @RequestHeader(value="key", required=false) String key,@ApiParam(value = "" ) @RequestHeader(value="originChannelId", required=false) String originChannelId,@ApiParam(value = "" ) @RequestHeader(value="originDeptId", required=false) String originDeptId,@ApiParam(value = "" ) @RequestHeader(value="originEmployeeId", required=false) String originEmployeeId,@ApiParam(value = "" ) @RequestHeader(value="originSourceId", required=false) String originSourceId,@ApiParam(value = "" ) @RequestHeader(value="originTerminalId", required=false) String originTerminalId,@ApiParam(value = "" ) @RequestHeader(value="value", required=false) String value,@ApiParam(value = "") @Valid @RequestParam(value = "accountNumber", required = false) String accountNumber,@ApiParam(value = "") @Valid @RequestParam(value = "cardNumber", required = false) String cardNumber,@ApiParam(value = "Customer Identifier") @Valid @RequestParam(value = "cardStatus", required = false) String cardStatus){
        
        GetCustomerCardDetailsResponseWrapper res  = getCustomerCardDetailsI.execute(new GetCustomerCardDetailsP(branchId, financialInstitution, journeyId, lang, originUserId, providerLogin, providerPassword, timeStamp, cif, legalId, correlationId, key, originChannelId, originDeptId, originEmployeeId, originSourceId, originTerminalId, value, accountNumber, cardNumber, cardStatus));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<UpdateDirectDebitsOutput> updateDirectDebits(@ApiParam(value = "" ,required=true) @RequestHeader(value="branchId", required=true) String branchId,@ApiParam(value = "" ,required=true) @RequestHeader(value="financialInstitution", required=true) String financialInstitution,@ApiParam(value = "" ,required=true) @RequestHeader(value="journeyId", required=true) String journeyId,@ApiParam(value = "" ,required=true) @RequestHeader(value="lang", required=true) String lang,@ApiParam(value = "" ,required=true) @RequestHeader(value="originUserId", required=true) String originUserId,@ApiParam(value = "" ,required=true) @RequestHeader(value="providerLogin", required=true) String providerLogin,@ApiParam(value = "" ,required=true) @RequestHeader(value="providerPassword", required=true) String providerPassword,@ApiParam(value = "" ,required=true) @RequestHeader(value="timeStamp", required=true) String timeStamp,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UpdateDirectDebitsInput body,@ApiParam(value = "" ) @RequestHeader(value="correlationId", required=false) String correlationId,@ApiParam(value = "" ) @RequestHeader(value="key", required=false) String key,@ApiParam(value = "" ) @RequestHeader(value="originChannelId", required=false) String originChannelId,@ApiParam(value = "" ) @RequestHeader(value="originDeptId", required=false) String originDeptId,@ApiParam(value = "" ) @RequestHeader(value="originEmployeeId", required=false) String originEmployeeId,@ApiParam(value = "" ) @RequestHeader(value="originSourceId", required=false) String originSourceId,@ApiParam(value = "" ) @RequestHeader(value="originTerminalId", required=false) String originTerminalId,@ApiParam(value = "" ) @RequestHeader(value="value", required=false) String value){
        
        UpdateDirectDebitsResponseWrapper res  = updateDirectDebitsI.execute(new UpdateDirectDebitsP(branchId, financialInstitution, journeyId, lang, originUserId, providerLogin, providerPassword, timeStamp, body, correlationId, key, originChannelId, originDeptId, originEmployeeId, originSourceId, originTerminalId, value));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

}
