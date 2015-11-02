/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestCloseBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestCloseBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestCloseBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectKeyData batchRequestCloseIn;
  protected String batchRequestCloseActivityDescriptionIn;
/**
 *
 * Constructor to create a  BatchRequestCloseBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestCloseBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData batchRequestCloseInIn, String batchRequestCloseActivityDescriptionInIn) {
    super(id, context, "BatchRequestClose");
    batchRequestCloseIn = batchRequestCloseInIn;
    batchRequestCloseActivityDescriptionIn = batchRequestCloseActivityDescriptionInIn;
  }

  public void translateToMap() {
    if (batchRequestCloseIn != null) {
      batchRequestCloseIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestCloseIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestCloseActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestCloseActivityDescriptionIn);
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param batchRequestCloseInIn Value of the batchRequestCloseIn
 *
 */

  public void setBatchRequest(BatchRequestObjectKeyData batchRequestCloseInIn) {
    batchRequestCloseIn = batchRequestCloseInIn;
  }

/**
 *
 * Sets the ActivityDescription
 * @param batchRequestCloseActivityDescriptionInIn Value of the batchRequestCloseActivityDescriptionIn
 *
 */

  public void setActivityDescription(String batchRequestCloseActivityDescriptionInIn) {
    batchRequestCloseActivityDescriptionIn = batchRequestCloseActivityDescriptionInIn;
  }

  public void translateFromMap() {
    batchRequestCloseIn = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
    batchRequestCloseActivityDescriptionIn = (String)inputMap.get("ActivityDescription");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectKeyData getBatchRequest( ) {
    return batchRequestCloseIn;
  }

/**
 *
 * Gets the ActivityDescription
 * @return Value of the ActivityDescription
 *
 */

  public String getActivityDescription( ) {
    return batchRequestCloseActivityDescriptionIn;
  }

}
