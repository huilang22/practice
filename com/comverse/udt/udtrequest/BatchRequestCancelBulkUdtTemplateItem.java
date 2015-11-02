/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestCancelBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestCancelBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestCancelBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectKeyData batchRequestCancelIn;
  protected String batchRequestCancelActivityDescriptionIn;
/**
 *
 * Constructor to create a  BatchRequestCancelBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestCancelBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData batchRequestCancelInIn, String batchRequestCancelActivityDescriptionInIn) {
    super(id, context, "BatchRequestCancel");
    batchRequestCancelIn = batchRequestCancelInIn;
    batchRequestCancelActivityDescriptionIn = batchRequestCancelActivityDescriptionInIn;
  }

  public void translateToMap() {
    if (batchRequestCancelIn != null) {
      batchRequestCancelIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestCancelIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestCancelActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestCancelActivityDescriptionIn);
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param batchRequestCancelInIn Value of the batchRequestCancelIn
 *
 */

  public void setBatchRequest(BatchRequestObjectKeyData batchRequestCancelInIn) {
    batchRequestCancelIn = batchRequestCancelInIn;
  }

/**
 *
 * Sets the ActivityDescription
 * @param batchRequestCancelActivityDescriptionInIn Value of the batchRequestCancelActivityDescriptionIn
 *
 */

  public void setActivityDescription(String batchRequestCancelActivityDescriptionInIn) {
    batchRequestCancelActivityDescriptionIn = batchRequestCancelActivityDescriptionInIn;
  }

  public void translateFromMap() {
    batchRequestCancelIn = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
    batchRequestCancelActivityDescriptionIn = (String)inputMap.get("ActivityDescription");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectKeyData getBatchRequest( ) {
    return batchRequestCancelIn;
  }

/**
 *
 * Gets the ActivityDescription
 * @return Value of the ActivityDescription
 *
 */

  public String getActivityDescription( ) {
    return batchRequestCancelActivityDescriptionIn;
  }

}
