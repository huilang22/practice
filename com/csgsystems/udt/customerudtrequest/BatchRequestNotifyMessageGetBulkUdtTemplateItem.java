/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestNotifyMessageGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestNotifyMessageGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestNotifyMessageGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestNotifyMessageObjectKeyData batchRequestNotifyMessageGetIn;
/**
 *
 * Constructor to create a  BatchRequestNotifyMessageGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestNotifyMessageGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyMessageObjectKeyData batchRequestNotifyMessageGetInIn) {
    super(id, context, "BatchRequestNotifyMessageGet");
    batchRequestNotifyMessageGetIn = batchRequestNotifyMessageGetInIn;
  }

  public void translateToMap() {
    if (batchRequestNotifyMessageGetIn != null) {
      batchRequestNotifyMessageGetIn.resetFlags(true, true);
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectKeyHelper.toMap(batchRequestNotifyMessageGetIn, new HashMap(), "BatchRequestNotifyMessageObjectKeyData").get("BatchRequestNotifyMessageObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestNotifyMessage
 * @param batchRequestNotifyMessageGetInIn Value of the batchRequestNotifyMessageGetIn
 *
 */

  public void setBatchRequestNotifyMessage(BatchRequestNotifyMessageObjectKeyData batchRequestNotifyMessageGetInIn) {
    batchRequestNotifyMessageGetIn = batchRequestNotifyMessageGetInIn;
  }

  public void translateFromMap() {
    batchRequestNotifyMessageGetIn = BatchRequestNotifyMessageObjectKeyHelper.fromMap(inputMap, "BatchRequestNotifyMessage");
  }

/**
 *
 * Gets the BatchRequestNotifyMessage
 * @return Value of the BatchRequestNotifyMessage
 *
 */

  public BatchRequestNotifyMessageObjectKeyData getBatchRequestNotifyMessage( ) {
    return batchRequestNotifyMessageGetIn;
  }

}
