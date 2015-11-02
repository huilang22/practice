/*
 * Generated code DO NOT EDIT
 * Generated file: BatchCategoryUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchCategoryUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchCategoryUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchCategoryObjectData batchCategoryUpdateIn;
/**
 *
 * Constructor to create a  BatchCategoryUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchCategoryUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchCategoryObjectData batchCategoryUpdateInIn) {
    super(id, context, "BatchCategoryUpdate");
    batchCategoryUpdateIn = batchCategoryUpdateInIn;
  }

  public void translateToMap() {
    if (batchCategoryUpdateIn != null) {
      batchCategoryUpdateIn.resetFlags(true, true);
      addInput("BatchCategory", BatchCategoryObjectHelper.toMap(batchCategoryUpdateIn, new HashMap(), "BatchCategory").get("BatchCategory"));
    }
  }


/**
 *
 * Sets the BatchCategory
 * @param batchCategoryUpdateInIn Value of the batchCategoryUpdateIn
 *
 */

  public void setBatchCategory(BatchCategoryObjectData batchCategoryUpdateInIn) {
    batchCategoryUpdateIn = batchCategoryUpdateInIn;
  }

  public void translateFromMap() {
    batchCategoryUpdateIn = BatchCategoryObjectHelper.fromMap(inputMap, "BatchCategory");
  }

/**
 *
 * Gets the BatchCategory
 * @return Value of the BatchCategory
 *
 */

  public BatchCategoryObjectData getBatchCategory( ) {
    return batchCategoryUpdateIn;
  }

}
