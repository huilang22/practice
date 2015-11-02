/*
 * Generated code DO NOT EDIT
 * Generated file: BatchCategoryDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchCategoryDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchCategoryDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchCategoryObjectKeyData batchCategoryDeleteIn;
/**
 *
 * Constructor to create a  BatchCategoryDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchCategoryDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchCategoryObjectKeyData batchCategoryDeleteInIn) {
    super(id, context, "BatchCategoryDelete");
    batchCategoryDeleteIn = batchCategoryDeleteInIn;
  }

  public void translateToMap() {
    if (batchCategoryDeleteIn != null) {
      batchCategoryDeleteIn.resetFlags(true, true);
      addInput("BatchCategory", BatchCategoryObjectKeyHelper.toMap(batchCategoryDeleteIn, new HashMap(), "BatchCategoryObjectKeyData").get("BatchCategoryObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchCategory
 * @param batchCategoryDeleteInIn Value of the batchCategoryDeleteIn
 *
 */

  public void setBatchCategory(BatchCategoryObjectKeyData batchCategoryDeleteInIn) {
    batchCategoryDeleteIn = batchCategoryDeleteInIn;
  }

  public void translateFromMap() {
    batchCategoryDeleteIn = BatchCategoryObjectKeyHelper.fromMap(inputMap, "BatchCategory");
  }

/**
 *
 * Gets the BatchCategory
 * @return Value of the BatchCategory
 *
 */

  public BatchCategoryObjectKeyData getBatchCategory( ) {
    return batchCategoryDeleteIn;
  }

}
