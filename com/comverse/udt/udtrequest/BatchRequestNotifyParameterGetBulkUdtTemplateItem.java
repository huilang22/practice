/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestNotifyParameterGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestNotifyParameterGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestNotifyParameterObjectKeyData batchRequestNotifyParameterGetIn;
/**
 *
 * Constructor to create a  BatchRequestNotifyParameterGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestNotifyParameterGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyParameterObjectKeyData batchRequestNotifyParameterGetInIn) {
    super(id, context, "BatchRequestNotifyParameterGet");
    batchRequestNotifyParameterGetIn = batchRequestNotifyParameterGetInIn;
  }

  public void translateToMap() {
    if (batchRequestNotifyParameterGetIn != null) {
      batchRequestNotifyParameterGetIn.resetFlags(true, true);
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectKeyHelper.toMap(batchRequestNotifyParameterGetIn, new HashMap(), "BatchRequestNotifyParameterObjectKeyData").get("BatchRequestNotifyParameterObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestNotifyParameter
 * @param batchRequestNotifyParameterGetInIn Value of the batchRequestNotifyParameterGetIn
 *
 */

  public void setBatchRequestNotifyParameter(BatchRequestNotifyParameterObjectKeyData batchRequestNotifyParameterGetInIn) {
    batchRequestNotifyParameterGetIn = batchRequestNotifyParameterGetInIn;
  }

  public void translateFromMap() {
    batchRequestNotifyParameterGetIn = BatchRequestNotifyParameterObjectKeyHelper.fromMap(inputMap, "BatchRequestNotifyParameter");
  }

/**
 *
 * Gets the BatchRequestNotifyParameter
 * @return Value of the BatchRequestNotifyParameter
 *
 */

  public BatchRequestNotifyParameterObjectKeyData getBatchRequestNotifyParameter( ) {
    return batchRequestNotifyParameterGetIn;
  }

}
