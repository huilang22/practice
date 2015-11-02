/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyMessageFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestNotifyMessageFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestNotifyMessageFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestNotifyMessageObjectFilter batchRequestNotifyMessageFindIn;
/**
 *
 * Constructor to create a  BatchRequestNotifyMessageFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestNotifyMessageFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyMessageObjectFilter batchRequestNotifyMessageFindInIn) {
    super(id, context, "BatchRequestNotifyMessageFind");
    batchRequestNotifyMessageFindIn = batchRequestNotifyMessageFindInIn;
  }

  public void translateToMap() {
    if (batchRequestNotifyMessageFindIn != null) {
      Integer index =  batchRequestNotifyMessageFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectHelper.toMap(batchRequestNotifyMessageFindIn, new HashMap(), "BatchRequestNotifyMessage").get("BatchRequestNotifyMessage"));
    }
  }


/**
 *
 * Sets the BatchRequestNotifyMessage
 * @param batchRequestNotifyMessageFindInIn Value of the batchRequestNotifyMessageFindIn
 *
 */

  public void setBatchRequestNotifyMessage(BatchRequestNotifyMessageObjectFilter batchRequestNotifyMessageFindInIn) {
    batchRequestNotifyMessageFindIn = batchRequestNotifyMessageFindInIn;
  }

  public void translateFromMap() {
    batchRequestNotifyMessageFindIn = BatchRequestNotifyMessageObjectHelper.fromMapFilter(inputMap, "BatchRequestNotifyMessage");
  }

/**
 *
 * Gets the BatchRequestNotifyMessage
 * @return Value of the BatchRequestNotifyMessage
 *
 */

  public BatchRequestNotifyMessageObjectFilter getBatchRequestNotifyMessage( ) {
    return batchRequestNotifyMessageFindIn;
  }

}
