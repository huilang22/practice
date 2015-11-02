/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageBulkAdjustmentGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a BilledUsageBulkAdjustmentGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BilledUsageBulkAdjustmentGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BilledUsageBulkAdjustmentGetOutputData noOpIn;

/**
 *
 * Constructor to create a   BilledUsageBulkAdjustmentGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BilledUsageBulkAdjustmentGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageBulkAdjustmentGetOutputData noOpInIn) {
    super(id, context, "BilledUsageBulkAdjustmentGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BilledUsageBulkAdjustmentGetOutputData", BilledUsageBulkAdjustmentGetOutputHelper.toMap(noOpIn).get("BilledUsageBulkAdjustmentGetOutputData"));
    }
  }
/**
 *
 * Sets the  BilledUsageBulkAdjustmentGetOutputData
 * @param noOpInIn BilledUsageBulkAdjustmentGetOutputData to set
 *
 */
  public void setBilledUsageBulkAdjustmentGetOutputData(BilledUsageBulkAdjustmentGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BilledUsageBulkAdjustmentGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public BilledUsageBulkAdjustmentGetOutputData getBilledUsageBulkAdjustmentGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BilledUsageBulkAdjustmentGetOutputHelper.fromMap(inputMap);
  }
}
