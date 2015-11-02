/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestResumeBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestResumeBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestResumeBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectKeyData batchRequestResumeIn;
  protected Integer batchRequestResumeErrorThresholdIn;
  protected Date batchRequestResumeScheduledDateIn;
  protected String batchRequestResumeActivityDescriptionIn;
/**
 *
 * Constructor to create a  BatchRequestResumeBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestResumeBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData batchRequestResumeInIn, Integer batchRequestResumeErrorThresholdInIn, Date batchRequestResumeScheduledDateInIn, String batchRequestResumeActivityDescriptionInIn) {
    super(id, context, "BatchRequestResume");
    batchRequestResumeIn = batchRequestResumeInIn;
    batchRequestResumeErrorThresholdIn = batchRequestResumeErrorThresholdInIn;
    batchRequestResumeScheduledDateIn = batchRequestResumeScheduledDateInIn;
    batchRequestResumeActivityDescriptionIn = batchRequestResumeActivityDescriptionInIn;
  }

  public void translateToMap() {
    if (batchRequestResumeIn != null) {
      batchRequestResumeIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestResumeIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestResumeErrorThresholdIn != null) {
      addInput("ErrorThreshold", batchRequestResumeErrorThresholdIn);
    }
    if (batchRequestResumeScheduledDateIn != null) {
      addInput("ScheduledDate", batchRequestResumeScheduledDateIn);
    }
    if (batchRequestResumeActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestResumeActivityDescriptionIn);
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param batchRequestResumeInIn Value of the batchRequestResumeIn
 *
 */

  public void setBatchRequest(BatchRequestObjectKeyData batchRequestResumeInIn) {
    batchRequestResumeIn = batchRequestResumeInIn;
  }

/**
 *
 * Sets the ErrorThreshold
 * @param batchRequestResumeErrorThresholdInIn Value of the batchRequestResumeErrorThresholdIn
 *
 */

  public void setErrorThreshold(Integer batchRequestResumeErrorThresholdInIn) {
    batchRequestResumeErrorThresholdIn = batchRequestResumeErrorThresholdInIn;
  }

/**
 *
 * Sets the ScheduledDate
 * @param batchRequestResumeScheduledDateInIn Value of the batchRequestResumeScheduledDateIn
 *
 */

  public void setScheduledDate(Date batchRequestResumeScheduledDateInIn) {
    batchRequestResumeScheduledDateIn = batchRequestResumeScheduledDateInIn;
  }

/**
 *
 * Sets the ActivityDescription
 * @param batchRequestResumeActivityDescriptionInIn Value of the batchRequestResumeActivityDescriptionIn
 *
 */

  public void setActivityDescription(String batchRequestResumeActivityDescriptionInIn) {
    batchRequestResumeActivityDescriptionIn = batchRequestResumeActivityDescriptionInIn;
  }

  public void translateFromMap() {
    batchRequestResumeIn = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
    batchRequestResumeErrorThresholdIn = (Integer)inputMap.get("ErrorThreshold");
    batchRequestResumeScheduledDateIn = (Date)inputMap.get("ScheduledDate");
    batchRequestResumeActivityDescriptionIn = (String)inputMap.get("ActivityDescription");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectKeyData getBatchRequest( ) {
    return batchRequestResumeIn;
  }

/**
 *
 * Gets the ErrorThreshold
 * @return Value of the ErrorThreshold
 *
 */

  public Integer getErrorThreshold( ) {
    return batchRequestResumeErrorThresholdIn;
  }

/**
 *
 * Gets the ScheduledDate
 * @return Value of the ScheduledDate
 *
 */

  public Date getScheduledDate( ) {
    return batchRequestResumeScheduledDateIn;
  }

/**
 *
 * Gets the ActivityDescription
 * @return Value of the ActivityDescription
 *
 */

  public String getActivityDescription( ) {
    return batchRequestResumeActivityDescriptionIn;
  }

}
