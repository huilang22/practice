/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestNotifyParameterCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestNotifyParameterCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestNotifyParameterCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestNotifyParameterObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestNotifyParameterCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestNotifyParameterCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyParameterObjectData noOpInIn) {
    super(id, context, "BatchRequestNotifyParameterCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestNotifyParameter").get("BatchRequestNotifyParameter"));
    }
  }
/**
 *
 * Sets the  BatchRequestNotifyParameter
 * @param noOpInIn BatchRequestNotifyParameterObjectData to set
 *
 */
  public void setBatchRequestNotifyParameter(BatchRequestNotifyParameterObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestNotifyParameter passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestNotifyParameterObjectData getBatchRequestNotifyParameter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestNotifyParameterObjectHelper.fromMap(inputMap, "BatchRequestNotifyParameter");
  }
}
