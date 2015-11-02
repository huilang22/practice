/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestRestartBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestRestartBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestRestartBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectKeyData batchRequestRestartIn;
  protected Integer batchRequestRestartErrorThresholdIn;
  protected Date batchRequestRestartScheduledDateIn;
  protected String batchRequestRestartActivityDescriptionIn;
/**
 *
 * Constructor to create a  BatchRequestRestartBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestRestartBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData batchRequestRestartInIn, Integer batchRequestRestartErrorThresholdInIn, Date batchRequestRestartScheduledDateInIn, String batchRequestRestartActivityDescriptionInIn) {
    super(id, context, "BatchRequestRestart");
    batchRequestRestartIn = batchRequestRestartInIn;
    batchRequestRestartErrorThresholdIn = batchRequestRestartErrorThresholdInIn;
    batchRequestRestartScheduledDateIn = batchRequestRestartScheduledDateInIn;
    batchRequestRestartActivityDescriptionIn = batchRequestRestartActivityDescriptionInIn;
  }

  public void translateToMap() {
    if (batchRequestRestartIn != null) {
      batchRequestRestartIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestRestartIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestRestartErrorThresholdIn != null) {
      addInput("ErrorThreshold", batchRequestRestartErrorThresholdIn);
    }
    if (batchRequestRestartScheduledDateIn != null) {
      addInput("ScheduledDate", batchRequestRestartScheduledDateIn);
    }
    if (batchRequestRestartActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestRestartActivityDescriptionIn);
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param batchRequestRestartInIn Value of the batchRequestRestartIn
 *
 */

  public void setBatchRequest(BatchRequestObjectKeyData batchRequestRestartInIn) {
    batchRequestRestartIn = batchRequestRestartInIn;
  }

/**
 *
 * Sets the ErrorThreshold
 * @param batchRequestRestartErrorThresholdInIn Value of the batchRequestRestartErrorThresholdIn
 *
 */

  public void setErrorThreshold(Integer batchRequestRestartErrorThresholdInIn) {
    batchRequestRestartErrorThresholdIn = batchRequestRestartErrorThresholdInIn;
  }

/**
 *
 * Sets the ScheduledDate
 * @param batchRequestRestartScheduledDateInIn Value of the batchRequestRestartScheduledDateIn
 *
 */

  public void setScheduledDate(Date batchRequestRestartScheduledDateInIn) {
    batchRequestRestartScheduledDateIn = batchRequestRestartScheduledDateInIn;
  }

/**
 *
 * Sets the ActivityDescription
 * @param batchRequestRestartActivityDescriptionInIn Value of the batchRequestRestartActivityDescriptionIn
 *
 */

  public void setActivityDescription(String batchRequestRestartActivityDescriptionInIn) {
    batchRequestRestartActivityDescriptionIn = batchRequestRestartActivityDescriptionInIn;
  }

  public void translateFromMap() {
    batchRequestRestartIn = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
    batchRequestRestartErrorThresholdIn = (Integer)inputMap.get("ErrorThreshold");
    batchRequestRestartScheduledDateIn = (Date)inputMap.get("ScheduledDate");
    batchRequestRestartActivityDescriptionIn = (String)inputMap.get("ActivityDescription");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectKeyData getBatchRequest( ) {
    return batchRequestRestartIn;
  }

/**
 *
 * Gets the ErrorThreshold
 * @return Value of the ErrorThreshold
 *
 */

  public Integer getErrorThreshold( ) {
    return batchRequestRestartErrorThresholdIn;
  }

/**
 *
 * Gets the ScheduledDate
 * @return Value of the ScheduledDate
 *
 */

  public Date getScheduledDate( ) {
    return batchRequestRestartScheduledDateIn;
  }

/**
 *
 * Gets the ActivityDescription
 * @return Value of the ActivityDescription
 *
 */

  public String getActivityDescription( ) {
    return batchRequestRestartActivityDescriptionIn;
  }

}
