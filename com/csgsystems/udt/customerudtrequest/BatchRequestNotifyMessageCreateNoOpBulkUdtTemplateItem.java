/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestNotifyMessageCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestNotifyMessageCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestNotifyMessageCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestNotifyMessageObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestNotifyMessageCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestNotifyMessageCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyMessageObjectData noOpInIn) {
    super(id, context, "BatchRequestNotifyMessageCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestNotifyMessage").get("BatchRequestNotifyMessage"));
    }
  }
/**
 *
 * Sets the  BatchRequestNotifyMessage
 * @param noOpInIn BatchRequestNotifyMessageObjectData to set
 *
 */
  public void setBatchRequestNotifyMessage(BatchRequestNotifyMessageObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestNotifyMessage passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestNotifyMessageObjectData getBatchRequestNotifyMessage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestNotifyMessageObjectHelper.fromMap(inputMap, "BatchRequestNotifyMessage");
  }
}
