/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestResumeAllBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestResumeAllBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestResumeAllBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected String batchRequestResumeAllActivityDescriptionIn;
/**
 *
 * Constructor to create a  BatchRequestResumeAllBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestResumeAllBulkUdtTemplateItem(String id, BSDMSessionContext context, String batchRequestResumeAllActivityDescriptionInIn) {
    super(id, context, "BatchRequestResumeAll");
    batchRequestResumeAllActivityDescriptionIn = batchRequestResumeAllActivityDescriptionInIn;
  }

  public void translateToMap() {
    if (batchRequestResumeAllActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestResumeAllActivityDescriptionIn);
    }
  }


/**
 *
 * Sets the ActivityDescription
 * @param batchRequestResumeAllActivityDescriptionInIn Value of the batchRequestResumeAllActivityDescriptionIn
 *
 */

  public void setActivityDescription(String batchRequestResumeAllActivityDescriptionInIn) {
    batchRequestResumeAllActivityDescriptionIn = batchRequestResumeAllActivityDescriptionInIn;
  }

  public void translateFromMap() {
    batchRequestResumeAllActivityDescriptionIn = (String)inputMap.get("ActivityDescription");
  }

/**
 *
 * Gets the ActivityDescription
 * @return Value of the ActivityDescription
 *
 */

  public String getActivityDescription( ) {
    return batchRequestResumeAllActivityDescriptionIn;
  }

}
