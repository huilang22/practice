/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractUnitCreditConfigGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ContractUnitCreditConfigGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ContractUnitCreditConfigGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ContractUnitCreditObjectData noOpIn;

/**
 *
 * Constructor to create a   ContractUnitCreditConfigGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ContractUnitCreditConfigGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractUnitCreditObjectData noOpInIn) {
    super(id, context, "ContractUnitCreditConfigGet");
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
