/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchCategoryCreateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a BatchCategoryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchCategoryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchCategoryObjectData batchCategoryCreateIn;
/**
 *
 * Constructor to create a  BatchCategoryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchCategoryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchCategoryObjectData batchCategoryCreateInIn) {
    super(id, context, "BatchCategoryCreate");
    batchCategoryCreateIn = batchCategoryCreateInIn;
  }

  public void translateToMap() {
    if (batchCategoryCreateIn != null) {
      batchCategoryCreateIn.resetFlags(true, true);
      addInput("BatchCategory", BatchCategoryObjectHelper.toMap(batchCategoryCreateIn, new HashMap(), "BatchCategory").get("BatchCategory"));
    }
  }


/**
 *
 * Sets the BatchCategory
 * @param batchCategoryCreateInIn Value of the batchCategoryCreateIn
 *
 */

  public void setBatchCategory(BatchCategoryObjectData batchCategoryCreateInIn) {
    batchCategoryCreateIn = batchCategoryCreateInIn;
  }

  public void translateFromMap() {
    batchCategoryCreateIn = BatchCategoryObjectHelper.fromMap(inputMap, "BatchCategory");
  }

/**
 *
 * Gets the BatchCategory
 * @return Value of the BatchCategory
 *
 */

  public BatchCategoryObjectData getBatchCategory( ) {
    return batchCategoryCreateIn;
  }

}
