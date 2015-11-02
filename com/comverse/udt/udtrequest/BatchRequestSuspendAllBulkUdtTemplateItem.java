/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSuspendAllBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestSuspendAllBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestSuspendAllBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected String batchRequestSuspendAllActivityDescriptionIn;
/**
 *
 * Constructor to create a  BatchRequestSuspendAllBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestSuspendAllBulkUdtTemplateItem(String id, BSDMSessionContext context, String batchRequestSuspendAllActivityDescriptionInIn) {
    super(id, context, "BatchRequestSuspendAll");
    batchRequestSuspendAllActivityDescriptionIn = batchRequestSuspendAllActivityDescriptionInIn;
  }

  public void translateToMap() {
    if (batchRequestSuspendAllActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestSuspendAllActivityDescriptionIn);
    }
  }


/**
 *
 * Sets the ActivityDescription
 * @param batchRequestSuspendAllActivityDescriptionInIn Value of the batchRequestSuspendAllActivityDescriptionIn
 *
 */

  public void setActivityDescription(String batchRequestSuspendAllActivityDescriptionInIn) {
    batchRequestSuspendAllActivityDescriptionIn = batchRequestSuspendAllActivityDescriptionInIn;
  }

  public void translateFromMap() {
    batchRequestSuspendAllActivityDescriptionIn = (String)inputMap.get("ActivityDescription");
  }

/**
 *
 * Gets the ActivityDescription
 * @return Value of the ActivityDescription
 *
 */

  public String getActivityDescription( ) {
    return batchRequestSuspendAllActivityDescriptionIn;
  }

}
