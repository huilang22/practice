/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSuspendBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestSuspendBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestSuspendBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectKeyData batchRequestSuspendIn;
  protected String batchRequestSuspendActivityDescriptionIn;
/**
 *
 * Constructor to create a  BatchRequestSuspendBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestSuspendBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData batchRequestSuspendInIn, String batchRequestSuspendActivityDescriptionInIn) {
    super(id, context, "BatchRequestSuspend");
    batchRequestSuspendIn = batchRequestSuspendInIn;
    batchRequestSuspendActivityDescriptionIn = batchRequestSuspendActivityDescriptionInIn;
  }

  public void translateToMap() {
    if (batchRequestSuspendIn != null) {
      batchRequestSuspendIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestSuspendIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestSuspendActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestSuspendActivityDescriptionIn);
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param batchRequestSuspendInIn Value of the batchRequestSuspendIn
 *
 */

  public void setBatchRequest(BatchRequestObjectKeyData batchRequestSuspendInIn) {
    batchRequestSuspendIn = batchRequestSuspendInIn;
  }

/**
 *
 * Sets the ActivityDescription
 * @param batchRequestSuspendActivityDescriptionInIn Value of the batchRequestSuspendActivityDescriptionIn
 *
 */

  public void setActivityDescription(String batchRequestSuspendActivityDescriptionInIn) {
    batchRequestSuspendActivityDescriptionIn = batchRequestSuspendActivityDescriptionInIn;
  }

  public void translateFromMap() {
    batchRequestSuspendIn = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
    batchRequestSuspendActivityDescriptionIn = (String)inputMap.get("ActivityDescription");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectKeyData getBatchRequest( ) {
    return batchRequestSuspendIn;
  }

/**
 *
 * Gets the ActivityDescription
 * @return Value of the ActivityDescription
 *
 */

  public String getActivityDescription( ) {
    return batchRequestSuspendActivityDescriptionIn;
  }

}
