/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParameterUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParameterUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParameterUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParameterObjectBaseData batchRequestParameterUpdateIn;
/**
 *
 * Constructor to create a  BatchRequestParameterUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParameterUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParameterObjectBaseData batchRequestParameterUpdateInIn) {
    super(id, context, "BatchRequestParameterUpdate");
    batchRequestParameterUpdateIn = batchRequestParameterUpdateInIn;
  }

  public void translateToMap() {
    if (batchRequestParameterUpdateIn != null) {
      batchRequestParameterUpdateIn.resetFlags(true, true);
      addInput("BatchRequestParameter", BatchRequestParameterObjectBaseHelper.toMap(batchRequestParameterUpdateIn, new HashMap(), "BatchRequestParameter").get("BatchRequestParameter"));
    }
  }


/**
 *
 * Sets the BatchRequestParameter
 * @param batchRequestParameterUpdateInIn Value of the batchRequestParameterUpdateIn
 *
 */

  public void setBatchRequestParameter(BatchRequestParameterObjectBaseData batchRequestParameterUpdateInIn) {
    batchRequestParameterUpdateIn = batchRequestParameterUpdateInIn;
  }

  public void translateFromMap() {
    batchRequestParameterUpdateIn = BatchRequestParameterObjectBaseHelper.fromMap(inputMap, "BatchRequestParameter");
  }

/**
 *
 * Gets the BatchRequestParameter
 * @return Value of the BatchRequestParameter
 *
 */

  public BatchRequestParameterObjectBaseData getBatchRequestParameter( ) {
    return batchRequestParameterUpdateIn;
  }

}
