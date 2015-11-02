/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyMessageDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestNotifyMessageDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestNotifyMessageDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestNotifyMessageObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestNotifyMessageDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestNotifyMessageDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyMessageObjectData noOpInIn) {
    super(id, context, "BatchRequestNotifyMessageDelete");
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
