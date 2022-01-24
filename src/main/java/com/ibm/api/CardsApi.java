/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
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
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@Validated
@Api(value = "cards", description = "the cards API")
public interface CardsApi {
    

    @ApiOperation(value = "API to create credit or debit transaction for customer", nickname = "createCardTransaction", notes = "Provides functionality to debit or credit a credit card account as per customer request.", response = CreateCardTransactionOutput.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = CreateCardTransactionOutput.class),
        @ApiResponse(code = 400, message = "Bad Request", response = CreateCardTransactionFault.class),
        @ApiResponse(code = 404, message = "Not found", response = CreateCardTransactionFault.class),
        @ApiResponse(code = 405, message = "Method Not Found", response = CreateCardTransactionFault.class),
        @ApiResponse(code = 429, message = "Too Many Request", response = CreateCardTransactionFault.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = CreateCardTransactionFault.class),
        @ApiResponse(code = 503, message = "Service Unavailable", response = CreateCardTransactionFault.class) })
    @RequestMapping(value = "/cards",
        produces = { "*/*" }, 
        method = RequestMethod.POST)
    ResponseEntity<CreateCardTransactionOutput> createCardTransaction(@ApiParam(value = "" ,required=true) @RequestHeader(value="branchId", required=true) String branchId,@ApiParam(value = "" ,required=true) @RequestHeader(value="financialInstitution", required=true) String financialInstitution,@ApiParam(value = "" ,required=true) @RequestHeader(value="journeyId", required=true) String journeyId,@ApiParam(value = "" ,required=true) @RequestHeader(value="lang", required=true) String lang,@ApiParam(value = "" ,required=true) @RequestHeader(value="originUserId", required=true) String originUserId,@ApiParam(value = "" ,required=true) @RequestHeader(value="providerLogin", required=true) String providerLogin,@ApiParam(value = "" ,required=true) @RequestHeader(value="providerPassword", required=true) String providerPassword,@ApiParam(value = "" ,required=true) @RequestHeader(value="timeStamp", required=true) String timeStamp,@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreateCardTransactionInput body,@ApiParam(value = "" ) @RequestHeader(value="correlationId", required=false) String correlationId,@ApiParam(value = "" ) @RequestHeader(value="key", required=false) String key,@ApiParam(value = "" ) @RequestHeader(value="originChannelId", required=false) String originChannelId,@ApiParam(value = "" ) @RequestHeader(value="originDeptId", required=false) String originDeptId,@ApiParam(value = "" ) @RequestHeader(value="originEmployeeId", required=false) String originEmployeeId,@ApiParam(value = "" ) @RequestHeader(value="originSourceId", required=false) String originSourceId,@ApiParam(value = "" ) @RequestHeader(value="originTerminalId", required=false) String originTerminalId,@ApiParam(value = "" ) @RequestHeader(value="value", required=false) String value); 


    @ApiOperation(value = "API to retrieve get card account enquiry", nickname = "getCardAccountEnquiry", notes = "Provides functionality to update customer instructions regarding automatic payment for his credit card account. The account that will be debited and the percentage of the payment.", response = GetCardAccountEnquiryOutput.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = GetCardAccountEnquiryOutput.class),
        @ApiResponse(code = 400, message = "Bad Request", response = GetCardAccountEnquiryFault.class),
        @ApiResponse(code = 404, message = "Not found", response = GetCardAccountEnquiryFault.class),
        @ApiResponse(code = 405, message = "Method Not Found", response = GetCardAccountEnquiryFault.class),
        @ApiResponse(code = 429, message = "Too Many Request", response = GetCardAccountEnquiryFault.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = GetCardAccountEnquiryFault.class),
        @ApiResponse(code = 503, message = "Service Unavailable", response = GetCardAccountEnquiryFault.class) })
    @RequestMapping(value = "/cards/cardsAccounts",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<GetCardAccountEnquiryOutput> getCardAccountEnquiry(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "accountId", required = true) String accountId,@ApiParam(value = "" ,required=true) @RequestHeader(value="branchId", required=true) String branchId,@ApiParam(value = "" ,required=true) @RequestHeader(value="financialInstitution", required=true) String financialInstitution,@ApiParam(value = "" ,required=true) @RequestHeader(value="journeyId", required=true) String journeyId,@ApiParam(value = "" ,required=true) @RequestHeader(value="lang", required=true) String lang,@ApiParam(value = "" ,required=true) @RequestHeader(value="originUserId", required=true) String originUserId,@ApiParam(value = "" ,required=true) @RequestHeader(value="providerLogin", required=true) String providerLogin,@ApiParam(value = "" ,required=true) @RequestHeader(value="providerPassword", required=true) String providerPassword,@ApiParam(value = "" ,required=true) @RequestHeader(value="timeStamp", required=true) String timeStamp,@ApiParam(value = "Customer Identifier") @Valid @RequestParam(value = "cif", required = false) String cif,@ApiParam(value = "" ) @RequestHeader(value="correlationId", required=false) String correlationId,@ApiParam(value = "" ) @RequestHeader(value="key", required=false) String key,@ApiParam(value = "" ) @RequestHeader(value="originChannelId", required=false) String originChannelId,@ApiParam(value = "" ) @RequestHeader(value="originDeptId", required=false) String originDeptId,@ApiParam(value = "" ) @RequestHeader(value="originEmployeeId", required=false) String originEmployeeId,@ApiParam(value = "" ) @RequestHeader(value="originSourceId", required=false) String originSourceId,@ApiParam(value = "" ) @RequestHeader(value="originTerminalId", required=false) String originTerminalId,@ApiParam(value = "" ) @RequestHeader(value="value", required=false) String value,@ApiParam(value = "") @Valid @RequestParam(value = "cutOffDate", required = false) String cutOffDate,@ApiParam(value = "") @Valid @RequestParam(value = "cardNumber", required = false) String cardNumber); 


    @ApiOperation(value = "API to retrieve customer card details", nickname = "getCustomerCardDetails", notes = "Retrieve card/credit card accounts' details that belong to a customer.", response = GetCustomerCardDetailsOutput.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = GetCustomerCardDetailsOutput.class),
        @ApiResponse(code = 400, message = "Bad Request", response = GetCustomerCardDetailsFault.class),
        @ApiResponse(code = 404, message = "Not found", response = GetCustomerCardDetailsFault.class),
        @ApiResponse(code = 405, message = "Method Not Found", response = GetCustomerCardDetailsFault.class),
        @ApiResponse(code = 429, message = "Too Many Request", response = GetCustomerCardDetailsFault.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = GetCustomerCardDetailsFault.class),
        @ApiResponse(code = 503, message = "Service Unavailable", response = GetCustomerCardDetailsFault.class) })
    @RequestMapping(value = "/cards",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<GetCustomerCardDetailsOutput> getCustomerCardDetails(@ApiParam(value = "" ,required=true) @RequestHeader(value="branchId", required=true) String branchId,@ApiParam(value = "" ,required=true) @RequestHeader(value="financialInstitution", required=true) String financialInstitution,@ApiParam(value = "" ,required=true) @RequestHeader(value="journeyId", required=true) String journeyId,@ApiParam(value = "" ,required=true) @RequestHeader(value="lang", required=true) String lang,@ApiParam(value = "" ,required=true) @RequestHeader(value="originUserId", required=true) String originUserId,@ApiParam(value = "" ,required=true) @RequestHeader(value="providerLogin", required=true) String providerLogin,@ApiParam(value = "" ,required=true) @RequestHeader(value="providerPassword", required=true) String providerPassword,@ApiParam(value = "" ,required=true) @RequestHeader(value="timeStamp", required=true) String timeStamp,@ApiParam(value = "") @Valid @RequestParam(value = "cif", required = false) String cif,@ApiParam(value = "") @Valid @RequestParam(value = "legalId", required = false) String legalId,@ApiParam(value = "" ) @RequestHeader(value="correlationId", required=false) String correlationId,@ApiParam(value = "" ) @RequestHeader(value="key", required=false) String key,@ApiParam(value = "" ) @RequestHeader(value="originChannelId", required=false) String originChannelId,@ApiParam(value = "" ) @RequestHeader(value="originDeptId", required=false) String originDeptId,@ApiParam(value = "" ) @RequestHeader(value="originEmployeeId", required=false) String originEmployeeId,@ApiParam(value = "" ) @RequestHeader(value="originSourceId", required=false) String originSourceId,@ApiParam(value = "" ) @RequestHeader(value="originTerminalId", required=false) String originTerminalId,@ApiParam(value = "" ) @RequestHeader(value="value", required=false) String value,@ApiParam(value = "") @Valid @RequestParam(value = "accountNumber", required = false) String accountNumber,@ApiParam(value = "") @Valid @RequestParam(value = "cardNumber", required = false) String cardNumber,@ApiParam(value = "Customer Identifier") @Valid @RequestParam(value = "cardStatus", required = false) String cardStatus); 


    @ApiOperation(value = "API to update direct debits", nickname = "updateDirectDebits", notes = "Provides functionality to update various information regarding credit card account example: balance, interest, statement balance etc.", response = UpdateDirectDebitsOutput.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = UpdateDirectDebitsOutput.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UpdateDirectDebitsFault.class),
        @ApiResponse(code = 404, message = "Not found", response = UpdateDirectDebitsFault.class),
        @ApiResponse(code = 405, message = "Method Not Found", response = UpdateDirectDebitsFault.class),
        @ApiResponse(code = 429, message = "Too Many Request", response = UpdateDirectDebitsFault.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UpdateDirectDebitsFault.class),
        @ApiResponse(code = 503, message = "Service Unavailable", response = UpdateDirectDebitsFault.class) })
    @RequestMapping(value = "/cards/directDebits",
        produces = { "*/*" }, 
        method = RequestMethod.PUT)
    ResponseEntity<UpdateDirectDebitsOutput> updateDirectDebits(@ApiParam(value = "" ,required=true) @RequestHeader(value="branchId", required=true) String branchId,@ApiParam(value = "" ,required=true) @RequestHeader(value="financialInstitution", required=true) String financialInstitution,@ApiParam(value = "" ,required=true) @RequestHeader(value="journeyId", required=true) String journeyId,@ApiParam(value = "" ,required=true) @RequestHeader(value="lang", required=true) String lang,@ApiParam(value = "" ,required=true) @RequestHeader(value="originUserId", required=true) String originUserId,@ApiParam(value = "" ,required=true) @RequestHeader(value="providerLogin", required=true) String providerLogin,@ApiParam(value = "" ,required=true) @RequestHeader(value="providerPassword", required=true) String providerPassword,@ApiParam(value = "" ,required=true) @RequestHeader(value="timeStamp", required=true) String timeStamp,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UpdateDirectDebitsInput body,@ApiParam(value = "" ) @RequestHeader(value="correlationId", required=false) String correlationId,@ApiParam(value = "" ) @RequestHeader(value="key", required=false) String key,@ApiParam(value = "" ) @RequestHeader(value="originChannelId", required=false) String originChannelId,@ApiParam(value = "" ) @RequestHeader(value="originDeptId", required=false) String originDeptId,@ApiParam(value = "" ) @RequestHeader(value="originEmployeeId", required=false) String originEmployeeId,@ApiParam(value = "" ) @RequestHeader(value="originSourceId", required=false) String originSourceId,@ApiParam(value = "" ) @RequestHeader(value="originTerminalId", required=false) String originTerminalId,@ApiParam(value = "" ) @RequestHeader(value="value", required=false) String value); 

}
