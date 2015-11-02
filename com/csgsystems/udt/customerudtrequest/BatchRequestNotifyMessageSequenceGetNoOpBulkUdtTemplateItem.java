/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestNotifyMessageSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestNotifyMessageSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestNotifyMessageSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestNotifyMessageObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestNotifyMessageSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestNotifyMessageSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyMessageObjectKeyData noOpInIn) {
    super(id, context, "BatchRequestNotifyMessageSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchRequestNotifyMessage").get("BatchRequestNotifyMessage"));
    }
  }
/**
 *
 * Sets the  BatchRequestNotifyMessage
 * @param noOpInIn BatchRequestNotifyMessageObjectKeyData to set
 *
 */
  public void setBatchRequestNotifyMessage(BatchRequestNotifyMessageObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestNotifyMessage passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestNotifyMessageObjectKeyData getBatchRequestNotifyMessage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestNotifyMessageObjectKeyHelper.fromMap(inputMap, "BatchRequestNotifyMessage");
  }
}
