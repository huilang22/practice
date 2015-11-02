/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectData batchRequestCreateIn;
  protected String batchRequestCreateActivityDescriptionIn;
/**
 *
 * Constructor to create a  BatchRequestCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectData batchRequestCreateInIn, String batchRequestCreateActivityDescriptionInIn) {
    super(id, context, "BatchRequestCreate");
    batchRequestCreateIn = batchRequestCreateInIn;
    batchRequestCreateActivityDescriptionIn = batchRequestCreateActivityDescriptionInIn;
  }

  public void translateToMap() {
    if (batchRequestCreateIn != null) {
      batchRequestCreateIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(batchRequestCreateIn, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (batchRequestCreateActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestCreateActivityDescriptionIn);
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param batchRequestCreateInIn Value of the batchRequestCreateIn
 *
 */

  public void setBatchRequest(BatchRequestObjectData batchRequestCreateInIn) {
    batchRequestCreateIn = batchRequestCreateInIn;
  }

/**
 *
 * Sets the ActivityDescription
 * @param batchRequestCreateActivityDescriptionInIn Value of the batchRequestCreateActivityDescriptionIn
 *
 */

  public void setActivityDescription(String batchRequestCreateActivityDescriptionInIn) {
    batchRequestCreateActivityDescriptionIn = batchRequestCreateActivityDescriptionInIn;
  }

  public void translateFromMap() {
    batchRequestCreateIn = BatchRequestObjectHelper.fromMap(inputMap, "BatchRequest");
    batchRequestCreateActivityDescriptionIn = (String)inputMap.get("ActivityDescription");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectData getBatchRequest( ) {
    return batchRequestCreateIn;
  }

/**
 *
 * Gets the ActivityDescription
 * @return Value of the ActivityDescription
 *
 */

  public String getActivityDescription( ) {
    return batchRequestCreateActivityDescriptionIn;
  }

}
