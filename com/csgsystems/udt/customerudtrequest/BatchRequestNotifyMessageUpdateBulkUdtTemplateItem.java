/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestNotifyMessageUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestNotifyMessageUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestNotifyMessageUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestNotifyMessageObjectData batchRequestNotifyMessageUpdateIn;
/**
 *
 * Constructor to create a  BatchRequestNotifyMessageUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestNotifyMessageUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyMessageObjectData batchRequestNotifyMessageUpdateInIn) {
    super(id, context, "BatchRequestNotifyMessageUpdate");
    batchRequestNotifyMessageUpdateIn = batchRequestNotifyMessageUpdateInIn;
  }

  public void translateToMap() {
    if (batchRequestNotifyMessageUpdateIn != null) {
      batchRequestNotifyMessageUpdateIn.resetFlags(true, true);
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectHelper.toMap(batchRequestNotifyMessageUpdateIn, new HashMap(), "BatchRequestNotifyMessage").get("BatchRequestNotifyMessage"));
    }
  }


/**
 *
 * Sets the BatchRequestNotifyMessage
 * @param batchRequestNotifyMessageUpdateInIn Value of the batchRequestNotifyMessageUpdateIn
 *
 */

  public void setBatchRequestNotifyMessage(BatchRequestNotifyMessageObjectData batchRequestNotifyMessageUpdateInIn) {
    batchRequestNotifyMessageUpdateIn = batchRequestNotifyMessageUpdateInIn;
  }

  public void translateFromMap() {
    batchRequestNotifyMessageUpdateIn = BatchRequestNotifyMessageObjectHelper.fromMap(inputMap, "BatchRequestNotifyMessage");
  }

/**
 *
 * Gets the BatchRequestNotifyMessage
 * @return Value of the BatchRequestNotifyMessage
 *
 */

  public BatchRequestNotifyMessageObjectData getBatchRequestNotifyMessage( ) {
    return batchRequestNotifyMessageUpdateIn;
  }

}
