/*
 * Generated code DO NOT EDIT
 * Generated file: ContractUnitCreditUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ContractUnitCreditUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ContractUnitCreditUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ContractUnitCreditObjectData noOpIn;

/**
 *
 * Constructor to create a   ContractUnitCreditUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ContractUnitCreditUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractUnitCreditObjectData noOpInIn) {
    super(id, context, "ContractUnitCreditUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ContractUnitCredit", ContractUnitCreditObjectHelper.toMap(noOpIn, new HashMap(), "ContractUnitCredit").get("ContractUnitCredit"));
    }
  }
/**
 *
 * Sets the  ContractUnitCredit
 * @param noOpInIn ContractUnitCreditObjectData to set
 *
 */
  public void setContractUnitCredit(ContractUnitCreditObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ContractUnitCredit passed into the constructor
 * @return Simulated response
 *
 */
  public ContractUnitCreditObjectData getContractUnitCredit() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ContractUnitCreditObjectHelper.fromMap(inputMap, "ContractUnitCredit");
  }
}
