/*
 * Generated code DO NOT EDIT
 * Generated file: UnbilledUsageBulkAdjustmentGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UnbilledUsageBulkAdjustmentGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnbilledUsageBulkAdjustmentGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnbilledUsageBulkAdjustmentGetOutputData noOpIn;

/**
 *
 * Constructor to create a   UnbilledUsageBulkAdjustmentGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnbilledUsageBulkAdjustmentGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageBulkAdjustmentGetOutputData noOpInIn) {
    super(id, context, "UnbilledUsageBulkAdjustmentGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UnbilledUsageBulkAdjustmentGetOutputData", UnbilledUsageBulkAdjustmentGetOutputHelper.toMap(noOpIn).get("UnbilledUsageBulkAdjustmentGetOutputData"));
    }
  }
/**
 *
 * Sets the  UnbilledUsageBulkAdjustmentGetOutputData
 * @param noOpInIn UnbilledUsageBulkAdjustmentGetOutputData to set
 *
 */
  public void setUnbilledUsageBulkAdjustmentGetOutputData(UnbilledUsageBulkAdjustmentGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnbilledUsageBulkAdjustmentGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public UnbilledUsageBulkAdjustmentGetOutputData getUnbilledUsageBulkAdjustmentGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnbilledUsageBulkAdjustmentGetOutputHelper.fromMap(inputMap);
  }
}
