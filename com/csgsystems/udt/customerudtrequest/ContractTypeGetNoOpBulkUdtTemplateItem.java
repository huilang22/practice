/*
 * Generated code DO NOT EDIT
 * Generated file: ContractTypeGetNoOpBulkUdtTemplateItem.java
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

/**
 *
 * NoOp class used to simulate a ContractTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ContractTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ContractTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   ContractTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ContractTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractTypeObjectData noOpInIn) {
    super(id, context, "ContractTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ContractType", ContractTypeObjectHelper.toMap(noOpIn, new HashMap(), "ContractType").get("ContractType"));
    }
  }
/**
 *
 * Sets the  ContractType
 * @param noOpInIn ContractTypeObjectData to set
 *
 */
  public void setContractType(ContractTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ContractType passed into the constructor
 * @return Simulated response
 *
 */
  public ContractTypeObjectData getContractType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ContractTypeObjectHelper.fromMap(inputMap, "ContractType");
  }
}
