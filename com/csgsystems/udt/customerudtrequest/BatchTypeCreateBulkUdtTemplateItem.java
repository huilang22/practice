/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTypeObjectData batchTypeCreateIn;
/**
 *
 * Constructor to create a  BatchTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeObjectData batchTypeCreateInIn) {
    super(id, context, "BatchTypeCreate");
    batchTypeCreateIn = batchTypeCreateInIn;
  }

  public void translateToMap() {
    if (batchTypeCreateIn != null) {
      batchTypeCreateIn.resetFlags(true, true);
      addInput("BatchType", BatchTypeObjectHelper.toMap(batchTypeCreateIn, new HashMap(), "BatchType").get("BatchType"));
    }
  }


/**
 *
 * Sets the BatchType
 * @param batchTypeCreateInIn Value of the batchTypeCreateIn
 *
 */

  public void setBatchType(BatchTypeObjectData batchTypeCreateInIn) {
    batchTypeCreateIn = batchTypeCreateInIn;
  }

  public void translateFromMap() {
    batchTypeCreateIn = BatchTypeObjectHelper.fromMap(inputMap, "BatchType");
  }

/**
 *
 * Gets the BatchType
 * @return Value of the BatchType
 *
 */

  public BatchTypeObjectData getBatchType( ) {
    return batchTypeCreateIn;
  }

}
