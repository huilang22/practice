/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeUpdateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a ContractTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ContractTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ContractTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   ContractTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ContractTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractTypeObjectData noOpInIn) {
    super(id, context, "ContractTypeUpdate");
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
