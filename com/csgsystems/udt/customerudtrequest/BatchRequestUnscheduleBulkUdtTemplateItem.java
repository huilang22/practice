/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestUnscheduleBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestUnscheduleBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestUnscheduleBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectKeyData batchRequestUnscheduleIn;
  protected String batchRequestUnscheduleActivityDescriptionIn;
/**
 *
 * Constructor to create a  BatchRequestUnscheduleBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestUnscheduleBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData batchRequestUnscheduleInIn, String batchRequestUnscheduleActivityDescriptionInIn) {
    super(id, context, "BatchRequestUnschedule");
    batchRequestUnscheduleIn = batchRequestUnscheduleInIn;
    batchRequestUnscheduleActivityDescriptionIn = batchRequestUnscheduleActivityDescriptionInIn;
  }

  public void translateToMap() {
    if (batchRequestUnscheduleIn != null) {
      batchRequestUnscheduleIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestUnscheduleIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestUnscheduleActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestUnscheduleActivityDescriptionIn);
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param batchRequestUnscheduleInIn Value of the batchRequestUnscheduleIn
 *
 */

  public void setBatchRequest(BatchRequestObjectKeyData batchRequestUnscheduleInIn) {
    batchRequestUnscheduleIn = batchRequestUnscheduleInIn;
  }

/**
 *
 * Sets the ActivityDescription
 * @param batchRequestUnscheduleActivityDescriptionInIn Value of the batchRequestUnscheduleActivityDescriptionIn
 *
 */

  public void setActivityDescription(String batchRequestUnscheduleActivityDescriptionInIn) {
    batchRequestUnscheduleActivityDescriptionIn = batchRequestUnscheduleActivityDescriptionInIn;
  }

  public void translateFromMap() {
    batchRequestUnscheduleIn = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
    batchRequestUnscheduleActivityDescriptionIn = (String)inputMap.get("ActivityDescription");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectKeyData getBatchRequest( ) {
    return batchRequestUnscheduleIn;
  }

/**
 *
 * Gets the ActivityDescription
 * @return Value of the ActivityDescription
 *
 */

  public String getActivityDescription( ) {
    return batchRequestUnscheduleActivityDescriptionIn;
  }

}
