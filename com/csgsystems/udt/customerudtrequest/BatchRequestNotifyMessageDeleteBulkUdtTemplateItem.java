/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestNotifyMessageDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestNotifyMessageDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestNotifyMessageDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestNotifyMessageObjectKeyData batchRequestNotifyMessageDeleteIn;
/**
 *
 * Constructor to create a  BatchRequestNotifyMessageDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestNotifyMessageDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyMessageObjectKeyData batchRequestNotifyMessageDeleteInIn) {
    super(id, context, "BatchRequestNotifyMessageDelete");
    batchRequestNotifyMessageDeleteIn = batchRequestNotifyMessageDeleteInIn;
  }

  public void translateToMap() {
    if (batchRequestNotifyMessageDeleteIn != null) {
      batchRequestNotifyMessageDeleteIn.resetFlags(true, true);
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectKeyHelper.toMap(batchRequestNotifyMessageDeleteIn, new HashMap(), "BatchRequestNotifyMessageObjectKeyData").get("BatchRequestNotifyMessageObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestNotifyMessage
 * @param batchRequestNotifyMessageDeleteInIn Value of the batchRequestNotifyMessageDeleteIn
 *
 */

  public void setBatchRequestNotifyMessage(BatchRequestNotifyMessageObjectKeyData batchRequestNotifyMessageDeleteInIn) {
    batchRequestNotifyMessageDeleteIn = batchRequestNotifyMessageDeleteInIn;
  }

  public void translateFromMap() {
    batchRequestNotifyMessageDeleteIn = BatchRequestNotifyMessageObjectKeyHelper.fromMap(inputMap, "BatchRequestNotifyMessage");
  }

/**
 *
 * Gets the BatchRequestNotifyMessage
 * @return Value of the BatchRequestNotifyMessage
 *
 */

  public BatchRequestNotifyMessageObjectKeyData getBatchRequestNotifyMessage( ) {
    return batchRequestNotifyMessageDeleteIn;
  }

}
