/*
 * Generated code DO NOT EDIT
 * Generated file: UnbilledUsageAmountGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UnbilledUsageAmountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnbilledUsageAmountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnbilledUsageAmountObjectData noOpIn;

/**
 *
 * Constructor to create a   UnbilledUsageAmountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnbilledUsageAmountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageAmountObjectData noOpInIn) {
    super(id, context, "UnbilledUsageAmountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UnbilledUsageAmount", UnbilledUsageAmountObjectHelper.toMap(noOpIn, new HashMap(), "UnbilledUsageAmount").get("UnbilledUsageAmount"));
    }
  }
/**
 *
 * Sets the  UnbilledUsageAmount
 * @param noOpInIn UnbilledUsageAmountObjectData to set
 *
 */
  public void setUnbilledUsageAmount(UnbilledUsageAmountObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnbilledUsageAmount passed into the constructor
 * @return Simulated response
 *
 */
  public UnbilledUsageAmountObjectData getUnbilledUsageAmount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnbilledUsageAmountObjectHelper.fromMap(inputMap, "UnbilledUsageAmount");
  }
}
