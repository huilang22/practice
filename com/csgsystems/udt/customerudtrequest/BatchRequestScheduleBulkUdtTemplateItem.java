/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestScheduleBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestScheduleBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestScheduleBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectKeyData batchRequestScheduleIn;
  protected Integer batchRequestScheduleRunTypeIn;
  protected Integer batchRequestScheduleErrorThresholdIn;
  protected Date batchRequestScheduleScheduledDateIn;
  protected String batchRequestScheduleActivityDescriptionIn;
/**
 *
 * Constructor to create a  BatchRequestScheduleBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestScheduleBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData batchRequestScheduleInIn, Integer batchRequestScheduleRunTypeInIn, Integer batchRequestScheduleErrorThresholdInIn, Date batchRequestScheduleScheduledDateInIn, String batchRequestScheduleActivityDescriptionInIn) {
    super(id, context, "BatchRequestSchedule");
    batchRequestScheduleIn = batchRequestScheduleInIn;
    batchRequestScheduleRunTypeIn = batchRequestScheduleRunTypeInIn;
    batchRequestScheduleErrorThresholdIn = batchRequestScheduleErrorThresholdInIn;
    batchRequestScheduleScheduledDateIn = batchRequestScheduleScheduledDateInIn;
    batchRequestScheduleActivityDescriptionIn = batchRequestScheduleActivityDescriptionInIn;
  }

  public void translateToMap() {
    if (batchRequestScheduleIn != null) {
      batchRequestScheduleIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestScheduleIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestScheduleRunTypeIn != null) {
      addInput("RunType", batchRequestScheduleRunTypeIn);
    }
    if (batchRequestScheduleErrorThresholdIn != null) {
      addInput("ErrorThreshold", batchRequestScheduleErrorThresholdIn);
    }
    if (batchRequestScheduleScheduledDateIn != null) {
      addInput("ScheduledDate", batchRequestScheduleScheduledDateIn);
    }
    if (batchRequestScheduleActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestScheduleActivityDescriptionIn);
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param batchRequestScheduleInIn Value of the batchRequestScheduleIn
 *
 */

  public void setBatchRequest(BatchRequestObjectKeyData batchRequestScheduleInIn) {
    batchRequestScheduleIn = batchRequestScheduleInIn;
  }

/**
 *
 * Sets the RunType
 * @param batchRequestScheduleRunTypeInIn Value of the batchRequestScheduleRunTypeIn
 *
 */

  public void setRunType(Integer batchRequestScheduleRunTypeInIn) {
    batchRequestScheduleRunTypeIn = batchRequestScheduleRunTypeInIn;
  }

/**
 *
 * Sets the ErrorThreshold
 * @param batchRequestScheduleErrorThresholdInIn Value of the batchRequestScheduleErrorThresholdIn
 *
 */

  public void setErrorThreshold(Integer batchRequestScheduleErrorThresholdInIn) {
    batchRequestScheduleErrorThresholdIn = batchRequestScheduleErrorThresholdInIn;
  }

/**
 *
 * Sets the ScheduledDate
 * @param batchRequestScheduleScheduledDateInIn Value of the batchRequestScheduleScheduledDateIn
 *
 */

  public void setScheduledDate(Date batchRequestScheduleScheduledDateInIn) {
    batchRequestScheduleScheduledDateIn = batchRequestScheduleScheduledDateInIn;
  }

/**
 *
 * Sets the ActivityDescription
 * @param batchRequestScheduleActivityDescriptionInIn Value of the batchRequestScheduleActivityDescriptionIn
 *
 */

  public void setActivityDescription(String batchRequestScheduleActivityDescriptionInIn) {
    batchRequestScheduleActivityDescriptionIn = batchRequestScheduleActivityDescriptionInIn;
  }

  public void translateFromMap() {
    batchRequestScheduleIn = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
    batchRequestScheduleRunTypeIn = (Integer)inputMap.get("RunType");
    batchRequestScheduleErrorThresholdIn = (Integer)inputMap.get("ErrorThreshold");
    batchRequestScheduleScheduledDateIn = (Date)inputMap.get("ScheduledDate");
    batchRequestScheduleActivityDescriptionIn = (String)inputMap.get("ActivityDescription");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectKeyData getBatchRequest( ) {
    return batchRequestScheduleIn;
  }

/**
 *
 * Gets the RunType
 * @return Value of the RunType
 *
 */

  public Integer getRunType( ) {
    return batchRequestScheduleRunTypeIn;
  }

/**
 *
 * Gets the ErrorThreshold
 * @return Value of the ErrorThreshold
 *
 */

  public Integer getErrorThreshold( ) {
    return batchRequestScheduleErrorThresholdIn;
  }

/**
 *
 * Gets the ScheduledDate
 * @return Value of the ScheduledDate
 *
 */

  public Date getScheduledDate( ) {
    return batchRequestScheduleScheduledDateIn;
  }

/**
 *
 * Gets the ActivityDescription
 * @return Value of the ActivityDescription
 *
 */

  public String getActivityDescription( ) {
    return batchRequestScheduleActivityDescriptionIn;
  }

}
