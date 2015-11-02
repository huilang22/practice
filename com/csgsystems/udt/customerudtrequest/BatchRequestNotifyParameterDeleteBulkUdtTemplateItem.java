/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestNotifyParameterDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestNotifyParameterDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestNotifyParameterDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestNotifyParameterObjectKeyData batchRequestNotifyParameterDeleteIn;
/**
 *
 * Constructor to create a  BatchRequestNotifyParameterDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestNotifyParameterDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyParameterObjectKeyData batchRequestNotifyParameterDeleteInIn) {
    super(id, context, "BatchRequestNotifyParameterDelete");
    batchRequestNotifyParameterDeleteIn = batchRequestNotifyParameterDeleteInIn;
  }

  public void translateToMap() {
    if (batchRequestNotifyParameterDeleteIn != null) {
      batchRequestNotifyParameterDeleteIn.resetFlags(true, true);
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectKeyHelper.toMap(batchRequestNotifyParameterDeleteIn, new HashMap(), "BatchRequestNotifyParameterObjectKeyData").get("BatchRequestNotifyParameterObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestNotifyParameter
 * @param batchRequestNotifyParameterDeleteInIn Value of the batchRequestNotifyParameterDeleteIn
 *
 */

  public void setBatchRequestNotifyParameter(BatchRequestNotifyParameterObjectKeyData batchRequestNotifyParameterDeleteInIn) {
    batchRequestNotifyParameterDeleteIn = batchRequestNotifyParameterDeleteInIn;
  }

  public void translateFromMap() {
    batchRequestNotifyParameterDeleteIn = BatchRequestNotifyParameterObjectKeyHelper.fromMap(inputMap, "BatchRequestNotifyParameter");
  }

/**
 *
 * Gets the BatchRequestNotifyParameter
 * @return Value of the BatchRequestNotifyParameter
 *
 */

  public BatchRequestNotifyParameterObjectKeyData getBatchRequestNotifyParameter( ) {
    return batchRequestNotifyParameterDeleteIn;
  }

}
