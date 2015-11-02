/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectData batchRequestUpdateIn;
/**
 *
 * Constructor to create a  BatchRequestUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectData batchRequestUpdateInIn) {
    super(id, context, "BatchRequestUpdate");
    batchRequestUpdateIn = batchRequestUpdateInIn;
  }

  public void translateToMap() {
    if (batchRequestUpdateIn != null) {
      batchRequestUpdateIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(batchRequestUpdateIn, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param batchRequestUpdateInIn Value of the batchRequestUpdateIn
 *
 */

  public void setBatchRequest(BatchRequestObjectData batchRequestUpdateInIn) {
    batchRequestUpdateIn = batchRequestUpdateInIn;
  }

  public void translateFromMap() {
    batchRequestUpdateIn = BatchRequestObjectHelper.fromMap(inputMap, "BatchRequest");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectData getBatchRequest( ) {
    return batchRequestUpdateIn;
  }

}
