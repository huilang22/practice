/*
 * Generated code DO NOT EDIT
 * Generated file: UnbilledUsageBulkAdjustmentUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UnbilledUsageBulkAdjustmentUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnbilledUsageBulkAdjustmentUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestObjectData noOpIn;

/**
 *
 * Constructor to create a   UnbilledUsageBulkAdjustmentUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnbilledUsageBulkAdjustmentUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectData noOpInIn) {
    super(id, context, "UnbilledUsageBulkAdjustmentUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
/**
 *
 * Sets the  BatchRequest
 * @param noOpInIn BatchRequestObjectData to set
 *
 */
  public void setBatchRequest(BatchRequestObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequest passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestObjectData getBatchRequest() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestObjectHelper.fromMap(inputMap, "BatchRequest");
  }
}
