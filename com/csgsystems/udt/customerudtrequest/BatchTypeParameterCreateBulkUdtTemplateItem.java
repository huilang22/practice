/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTypeParameterCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchTypeParameterCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTypeParameterCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTypeParameterObjectData batchTypeParameterCreateIn;
/**
 *
 * Constructor to create a  BatchTypeParameterCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTypeParameterCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeParameterObjectData batchTypeParameterCreateInIn) {
    super(id, context, "BatchTypeParameterCreate");
    batchTypeParameterCreateIn = batchTypeParameterCreateInIn;
  }

  public void translateToMap() {
    if (batchTypeParameterCreateIn != null) {
      batchTypeParameterCreateIn.resetFlags(true, true);
      addInput("BatchTypeParameter", BatchTypeParameterObjectHelper.toMap(batchTypeParameterCreateIn, new HashMap(), "BatchTypeParameter").get("BatchTypeParameter"));
    }
  }


/**
 *
 * Sets the BatchTypeParameter
 * @param batchTypeParameterCreateInIn Value of the batchTypeParameterCreateIn
 *
 */

  public void setBatchTypeParameter(BatchTypeParameterObjectData batchTypeParameterCreateInIn) {
    batchTypeParameterCreateIn = batchTypeParameterCreateInIn;
  }

  public void translateFromMap() {
    batchTypeParameterCreateIn = BatchTypeParameterObjectHelper.fromMap(inputMap, "BatchTypeParameter");
  }

/**
 *
 * Gets the BatchTypeParameter
 * @return Value of the BatchTypeParameter
 *
 */

  public BatchTypeParameterObjectData getBatchTypeParameter( ) {
    return batchTypeParameterCreateIn;
  }

}
