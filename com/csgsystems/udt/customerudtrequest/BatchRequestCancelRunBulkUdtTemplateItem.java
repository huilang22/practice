/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestCancelRunBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestCancelRunBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestCancelRunBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectKeyData batchRequestCancelRunIn;
  protected String batchRequestCancelRunActivityDescriptionIn;
/**
 *
 * Constructor to create a  BatchRequestCancelRunBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestCancelRunBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData batchRequestCancelRunInIn, String batchRequestCancelRunActivityDescriptionInIn) {
    super(id, context, "BatchRequestCancelRun");
    batchRequestCancelRunIn = batchRequestCancelRunInIn;
    batchRequestCancelRunActivityDescriptionIn = batchRequestCancelRunActivityDescriptionInIn;
  }

  public void translateToMap() {
    if (batchRequestCancelRunIn != null) {
      batchRequestCancelRunIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestCancelRunIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestCancelRunActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestCancelRunActivityDescriptionIn);
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param batchRequestCancelRunInIn Value of the batchRequestCancelRunIn
 *
 */

  public void setBatchRequest(BatchRequestObjectKeyData batchRequestCancelRunInIn) {
    batchRequestCancelRunIn = batchRequestCancelRunInIn;
  }

/**
 *
 * Sets the ActivityDescription
 * @param batchRequestCancelRunActivityDescriptionInIn Value of the batchRequestCancelRunActivityDescriptionIn
 *
 */

  public void setActivityDescription(String batchRequestCancelRunActivityDescriptionInIn) {
    batchRequestCancelRunActivityDescriptionIn = batchRequestCancelRunActivityDescriptionInIn;
  }

  public void translateFromMap() {
    batchRequestCancelRunIn = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
    batchRequestCancelRunActivityDescriptionIn = (String)inputMap.get("ActivityDescription");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectKeyData getBatchRequest( ) {
    return batchRequestCancelRunIn;
  }

/**
 *
 * Gets the ActivityDescription
 * @return Value of the ActivityDescription
 *
 */

  public String getActivityDescription( ) {
    return batchRequestCancelRunActivityDescriptionIn;
  }

}
