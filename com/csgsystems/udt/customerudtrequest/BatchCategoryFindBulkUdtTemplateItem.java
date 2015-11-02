/*
 * Generated code DO NOT EDIT
 * Generated file: BatchCategoryFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchCategoryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchCategoryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchCategoryObjectFilter batchCategoryFindIn;
/**
 *
 * Constructor to create a  BatchCategoryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchCategoryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchCategoryObjectFilter batchCategoryFindInIn) {
    super(id, context, "BatchCategoryFind");
    batchCategoryFindIn = batchCategoryFindInIn;
  }

  public void translateToMap() {
    if (batchCategoryFindIn != null) {
      Integer index =  batchCategoryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchCategory", BatchCategoryObjectHelper.toMap(batchCategoryFindIn, new HashMap(), "BatchCategory").get("BatchCategory"));
    }
  }


/**
 *
 * Sets the BatchCategory
 * @param batchCategoryFindInIn Value of the batchCategoryFindIn
 *
 */

  public void setBatchCategory(BatchCategoryObjectFilter batchCategoryFindInIn) {
    batchCategoryFindIn = batchCategoryFindInIn;
  }

  public void translateFromMap() {
    batchCategoryFindIn = BatchCategoryObjectHelper.fromMapFilter(inputMap, "BatchCategory");
  }

/**
 *
 * Gets the BatchCategory
 * @return Value of the BatchCategory
 *
 */

  public BatchCategoryObjectFilter getBatchCategory( ) {
    return batchCategoryFindIn;
  }

}
