/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTypeParameterDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchTypeParameterDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTypeParameterDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTypeParameterObjectKeyData batchTypeParameterDeleteIn;
/**
 *
 * Constructor to create a  BatchTypeParameterDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTypeParameterDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeParameterObjectKeyData batchTypeParameterDeleteInIn) {
    super(id, context, "BatchTypeParameterDelete");
    batchTypeParameterDeleteIn = batchTypeParameterDeleteInIn;
  }

  public void translateToMap() {
    if (batchTypeParameterDeleteIn != null) {
      batchTypeParameterDeleteIn.resetFlags(true, true);
      addInput("BatchTypeParameter", BatchTypeParameterObjectKeyHelper.toMap(batchTypeParameterDeleteIn, new HashMap(), "BatchTypeParameterObjectKeyData").get("BatchTypeParameterObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchTypeParameter
 * @param batchTypeParameterDeleteInIn Value of the batchTypeParameterDeleteIn
 *
 */

  public void setBatchTypeParameter(BatchTypeParameterObjectKeyData batchTypeParameterDeleteInIn) {
    batchTypeParameterDeleteIn = batchTypeParameterDeleteInIn;
  }

  public void translateFromMap() {
    batchTypeParameterDeleteIn = BatchTypeParameterObjectKeyHelper.fromMap(inputMap, "BatchTypeParameter");
  }

/**
 *
 * Gets the BatchTypeParameter
 * @return Value of the BatchTypeParameter
 *
 */

  public BatchTypeParameterObjectKeyData getBatchTypeParameter( ) {
    return batchTypeParameterDeleteIn;
  }

}
