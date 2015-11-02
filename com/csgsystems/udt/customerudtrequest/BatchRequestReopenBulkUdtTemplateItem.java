/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestReopenBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestReopenBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestReopenBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectKeyData batchRequestReopenIn;
  protected String batchRequestReopenActivityDescriptionIn;
/**
 *
 * Constructor to create a  BatchRequestReopenBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestReopenBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData batchRequestReopenInIn, String batchRequestReopenActivityDescriptionInIn) {
    super(id, context, "BatchRequestReopen");
    batchRequestReopenIn = batchRequestReopenInIn;
    batchRequestReopenActivityDescriptionIn = batchRequestReopenActivityDescriptionInIn;
  }

  public void translateToMap() {
    if (batchRequestReopenIn != null) {
      batchRequestReopenIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestReopenIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestReopenActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestReopenActivityDescriptionIn);
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param batchRequestReopenInIn Value of the batchRequestReopenIn
 *
 */

  public void setBatchRequest(BatchRequestObjectKeyData batchRequestReopenInIn) {
    batchRequestReopenIn = batchRequestReopenInIn;
  }

/**
 *
 * Sets the ActivityDescription
 * @param batchRequestReopenActivityDescriptionInIn Value of the batchRequestReopenActivityDescriptionIn
 *
 */

  public void setActivityDescription(String batchRequestReopenActivityDescriptionInIn) {
    batchRequestReopenActivityDescriptionIn = batchRequestReopenActivityDescriptionInIn;
  }

  public void translateFromMap() {
    batchRequestReopenIn = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
    batchRequestReopenActivityDescriptionIn = (String)inputMap.get("ActivityDescription");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectKeyData getBatchRequest( ) {
    return batchRequestReopenIn;
  }

/**
 *
 * Gets the ActivityDescription
 * @return Value of the ActivityDescription
 *
 */

  public String getActivityDescription( ) {
    return batchRequestReopenActivityDescriptionIn;
  }

}
