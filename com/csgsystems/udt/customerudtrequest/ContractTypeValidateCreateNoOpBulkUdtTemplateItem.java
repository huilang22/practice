/*
 * Generated code DO NOT EDIT
 * Generated file: ContractTypeValidateCreateNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ContractTypeValidateCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ContractTypeValidateCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ContractTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   ContractTypeValidateCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ContractTypeValidateCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractTypeObjectData noOpInIn) {
    super(id, context, "ContractTypeValidateCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ContractTypeValidate", ContractTypeObjectHelper.toMap(noOpIn, new HashMap(), "ContractTypeValidate").get("ContractTypeValidate"));
    }
  }
/**
 *
 * Sets the  ContractTypeValidate
 * @param noOpInIn ContractTypeObjectData to set
 *
 */
  public void setContractTypeValidate(ContractTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ContractTypeValidate passed into the constructor
 * @return Simulated response
 *
 */
  public ContractTypeObjectData getContractTypeValidate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ContractTypeObjectHelper.fromMap(inputMap, "ContractTypeValidate");
  }
}
