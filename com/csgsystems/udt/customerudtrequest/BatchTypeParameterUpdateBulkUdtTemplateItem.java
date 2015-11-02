/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTypeParameterUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchTypeParameterUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTypeParameterUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTypeParameterObjectData batchTypeParameterUpdateIn;
/**
 *
 * Constructor to create a  BatchTypeParameterUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTypeParameterUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeParameterObjectData batchTypeParameterUpdateInIn) {
    super(id, context, "BatchTypeParameterUpdate");
    batchTypeParameterUpdateIn = batchTypeParameterUpdateInIn;
  }

  public void translateToMap() {
    if (batchTypeParameterUpdateIn != null) {
      batchTypeParameterUpdateIn.resetFlags(true, true);
      addInput("BatchTypeParameter", BatchTypeParameterObjectHelper.toMap(batchTypeParameterUpdateIn, new HashMap(), "BatchTypeParameter").get("BatchTypeParameter"));
    }
  }


/**
 *
 * Sets the BatchTypeParameter
 * @param batchTypeParameterUpdateInIn Value of the batchTypeParameterUpdateIn
 *
 */

  public void setBatchTypeParameter(BatchTypeParameterObjectData batchTypeParameterUpdateInIn) {
    batchTypeParameterUpdateIn = batchTypeParameterUpdateInIn;
  }

  public void translateFromMap() {
    batchTypeParameterUpdateIn = BatchTypeParameterObjectHelper.fromMap(inputMap, "BatchTypeParameter");
  }

/**
 *
 * Gets the BatchTypeParameter
 * @return Value of the BatchTypeParameter
 *
 */

  public BatchTypeParameterObjectData getBatchTypeParameter( ) {
    return batchTypeParameterUpdateIn;
  }

}
