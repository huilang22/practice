/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestNotifyParameterUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestNotifyParameterUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestNotifyParameterObjectData batchRequestNotifyParameterUpdateIn;
/**
 *
 * Constructor to create a  BatchRequestNotifyParameterUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestNotifyParameterUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyParameterObjectData batchRequestNotifyParameterUpdateInIn) {
    super(id, context, "BatchRequestNotifyParameterUpdate");
    batchRequestNotifyParameterUpdateIn = batchRequestNotifyParameterUpdateInIn;
  }

  public void translateToMap() {
    if (batchRequestNotifyParameterUpdateIn != null) {
      batchRequestNotifyParameterUpdateIn.resetFlags(true, true);
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(batchRequestNotifyParameterUpdateIn, new HashMap(), "BatchRequestNotifyParameter").get("BatchRequestNotifyParameter"));
    }
  }


/**
 *
 * Sets the BatchRequestNotifyParameter
 * @param batchRequestNotifyParameterUpdateInIn Value of the batchRequestNotifyParameterUpdateIn
 *
 */

  public void setBatchRequestNotifyParameter(BatchRequestNotifyParameterObjectData batchRequestNotifyParameterUpdateInIn) {
    batchRequestNotifyParameterUpdateIn = batchRequestNotifyParameterUpdateInIn;
  }

  public void translateFromMap() {
    batchRequestNotifyParameterUpdateIn = BatchRequestNotifyParameterObjectHelper.fromMap(inputMap, "BatchRequestNotifyParameter");
  }

/**
 *
 * Gets the BatchRequestNotifyParameter
 * @return Value of the BatchRequestNotifyParameter
 *
 */

  public BatchRequestNotifyParameterObjectData getBatchRequestNotifyParameter( ) {
    return batchRequestNotifyParameterUpdateIn;
  }

}
