package com.ibm.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.ibm.model.CreateCardTransactionInput;

@Repository
public interface CreateCardTransactionInputRepo extends MongoRepository<CreateCardTransactionInput,String>{

}
