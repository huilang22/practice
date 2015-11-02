/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestSuspendNoOpBulkUdtTemplateItem.java
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

/**
 *
 * NoOp class used to simulate a BatchRequestSuspendNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestSuspendNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestSuspendNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestSuspendNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectData noOpInIn) {
    super(id, context, "BatchRequestSuspend");
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
