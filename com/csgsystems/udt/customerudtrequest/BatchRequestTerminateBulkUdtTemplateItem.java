/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestTerminateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestTerminateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestTerminateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectKeyData batchRequestTerminateIn;
  protected String batchRequestTerminateActivityDescriptionIn;
/**
 *
 * Constructor to create a  BatchRequestTerminateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestTerminateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData batchRequestTerminateInIn, String batchRequestTerminateActivityDescriptionInIn) {
    super(id, context, "BatchRequestTerminate");
    batchRequestTerminateIn = batchRequestTerminateInIn;
    batchRequestTerminateActivityDescriptionIn = batchRequestTerminateActivityDescriptionInIn;
  }

  public void translateToMap() {
    if (batchRequestTerminateIn != null) {
      batchRequestTerminateIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestTerminateIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestTerminateActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestTerminateActivityDescriptionIn);
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param batchRequestTerminateInIn Value of the batchRequestTerminateIn
 *
 */

  public void setBatchRequest(BatchRequestObjectKeyData batchRequestTerminateInIn) {
    batchRequestTerminateIn = batchRequestTerminateInIn;
  }

/**
 *
 * Sets the ActivityDescription
 * @param batchRequestTerminateActivityDescriptionInIn Value of the batchRequestTerminateActivityDescriptionIn
 *
 */

  public void setActivityDescription(String batchRequestTerminateActivityDescriptionInIn) {
    batchRequestTerminateActivityDescriptionIn = batchRequestTerminateActivityDescriptionInIn;
  }

  public void translateFromMap() {
    batchRequestTerminateIn = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
    batchRequestTerminateActivityDescriptionIn = (String)inputMap.get("ActivityDescription");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectKeyData getBatchRequest( ) {
    return batchRequestTerminateIn;
  }

/**
 *
 * Gets the ActivityDescription
 * @return Value of the ActivityDescription
 *
 */

  public String getActivityDescription( ) {
    return batchRequestTerminateActivityDescriptionIn;
  }

}
