/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractDiscountGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ContractDiscountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ContractDiscountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ContractDiscountObjectData noOpIn;

/**
 *
 * Constructor to create a   ContractDiscountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ContractDiscountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractDiscountObjectData noOpInIn) {
    super(id, context, "ContractDiscountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ContractDiscount", ContractDiscountObjectHelper.toMap(noOpIn, new HashMap(), "ContractDiscount").get("ContractDiscount"));
    }
  }
/**
 *
 * Sets the  ContractDiscount
 * @param noOpInIn ContractDiscountObjectData to set
 *
 */
  public void setContractDiscount(ContractDiscountObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ContractDiscount passed into the constructor
 * @return Simulated response
 *
 */
  public ContractDiscountObjectData getContractDiscount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ContractDiscountObjectHelper.fromMap(inputMap, "ContractDiscount");
  }
}
