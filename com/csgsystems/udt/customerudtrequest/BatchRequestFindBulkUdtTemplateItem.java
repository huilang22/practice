/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectFilter batchRequestFindIn;
/**
 *
 * Constructor to create a  BatchRequestFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectFilter batchRequestFindInIn) {
    super(id, context, "BatchRequestFind");
    batchRequestFindIn = batchRequestFindInIn;
  }

  public void translateToMap() {
    if (batchRequestFindIn != null) {
      Integer index =  batchRequestFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(batchRequestFindIn, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param batchRequestFindInIn Value of the batchRequestFindIn
 *
 */

  public void setBatchRequest(BatchRequestObjectFilter batchRequestFindInIn) {
    batchRequestFindIn = batchRequestFindInIn;
  }

  public void translateFromMap() {
    batchRequestFindIn = BatchRequestObjectHelper.fromMapFilter(inputMap, "BatchRequest");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectFilter getBatchRequest( ) {
    return batchRequestFindIn;
  }

}
