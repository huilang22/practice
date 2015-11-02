/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyMessageCreateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a BatchRequestNotifyMessageCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestNotifyMessageCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestNotifyMessageObjectData batchRequestNotifyMessageCreateIn;
/**
 *
 * Constructor to create a  BatchRequestNotifyMessageCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestNotifyMessageCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyMessageObjectData batchRequestNotifyMessageCreateInIn) {
    super(id, context, "BatchRequestNotifyMessageCreate");
    batchRequestNotifyMessageCreateIn = batchRequestNotifyMessageCreateInIn;
  }

  public void translateToMap() {
    if (batchRequestNotifyMessageCreateIn != null) {
      batchRequestNotifyMessageCreateIn.resetFlags(true, true);
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectHelper.toMap(batchRequestNotifyMessageCreateIn, new HashMap(), "BatchRequestNotifyMessage").get("BatchRequestNotifyMessage"));
    }
  }


/**
 *
 * Sets the BatchRequestNotifyMessage
 * @param batchRequestNotifyMessageCreateInIn Value of the batchRequestNotifyMessageCreateIn
 *
 */

  public void setBatchRequestNotifyMessage(BatchRequestNotifyMessageObjectData batchRequestNotifyMessageCreateInIn) {
    batchRequestNotifyMessageCreateIn = batchRequestNotifyMessageCreateInIn;
  }

  public void translateFromMap() {
    batchRequestNotifyMessageCreateIn = BatchRequestNotifyMessageObjectHelper.fromMap(inputMap, "BatchRequestNotifyMessage");
  }

/**
 *
 * Gets the BatchRequestNotifyMessage
 * @return Value of the BatchRequestNotifyMessage
 *
 */

  public BatchRequestNotifyMessageObjectData getBatchRequestNotifyMessage( ) {
    return batchRequestNotifyMessageCreateIn;
  }

}
