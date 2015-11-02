/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageAmountGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a BilledUsageAmountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BilledUsageAmountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BilledUsageAmountObjectData noOpIn;

/**
 *
 * Constructor to create a   BilledUsageAmountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BilledUsageAmountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageAmountObjectData noOpInIn) {
    super(id, context, "BilledUsageAmountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BilledUsageAmount", BilledUsageAmountObjectHelper.toMap(noOpIn, new HashMap(), "BilledUsageAmount").get("BilledUsageAmount"));
    }
  }
/**
 *
 * Sets the  BilledUsageAmount
 * @param noOpInIn BilledUsageAmountObjectData to set
 *
 */
  public void setBilledUsageAmount(BilledUsageAmountObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BilledUsageAmount passed into the constructor
 * @return Simulated response
 *
 */
  public BilledUsageAmountObjectData getBilledUsageAmount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BilledUsageAmountObjectHelper.fromMap(inputMap, "BilledUsageAmount");
  }
}
