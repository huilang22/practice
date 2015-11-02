/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemAmountGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BalanceLineItemAmountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BalanceLineItemAmountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BigInteger noOpIn;

/**
 *
 * Constructor to create a   BalanceLineItemAmountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BalanceLineItemAmountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger noOpInIn) {
    super(id, context, "BalanceLineItemAmountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("AdjustmentEligibleAmount", noOpIn);
    }
  }
/**
 *
 * Sets the  AdjustmentEligibleAmount
 * @param noOpInIn BigInteger to set
 *
 */
  public void setAdjustmentEligibleAmount(BigInteger noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AdjustmentEligibleAmount passed into the constructor
 * @return Simulated response
 *
 */
  public BigInteger getAdjustmentEligibleAmount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (BigInteger)inputMap.get("AdjustmentEligibleAmount");
  }
}
