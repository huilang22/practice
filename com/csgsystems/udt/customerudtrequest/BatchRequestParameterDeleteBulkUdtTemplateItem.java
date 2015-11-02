/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParameterDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParameterDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParameterDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParameterObjectBaseKeyData batchRequestParameterDeleteIn;
/**
 *
 * Constructor to create a  BatchRequestParameterDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParameterDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParameterObjectBaseKeyData batchRequestParameterDeleteInIn) {
    super(id, context, "BatchRequestParameterDelete");
    batchRequestParameterDeleteIn = batchRequestParameterDeleteInIn;
  }

  public void translateToMap() {
    if (batchRequestParameterDeleteIn != null) {
      batchRequestParameterDeleteIn.resetFlags(true, true);
      addInput("BatchRequestParameter", BatchRequestParameterObjectBaseKeyHelper.toMap(batchRequestParameterDeleteIn, new HashMap(), "BatchRequestParameterObjectBaseKeyData").get("BatchRequestParameterObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestParameter
 * @param batchRequestParameterDeleteInIn Value of the batchRequestParameterDeleteIn
 *
 */

  public void setBatchRequestParameter(BatchRequestParameterObjectBaseKeyData batchRequestParameterDeleteInIn) {
    batchRequestParameterDeleteIn = batchRequestParameterDeleteInIn;
  }

  public void translateFromMap() {
    batchRequestParameterDeleteIn = BatchRequestParameterObjectBaseKeyHelper.fromMap(inputMap, "BatchRequestParameter");
  }

/**
 *
 * Gets the BatchRequestParameter
 * @return Value of the BatchRequestParameter
 *
 */

  public BatchRequestParameterObjectBaseKeyData getBatchRequestParameter( ) {
    return batchRequestParameterDeleteIn;
  }

}
