/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchCategoryGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchCategoryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchCategoryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchCategoryObjectKeyData batchCategoryGetIn;
/**
 *
 * Constructor to create a  BatchCategoryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchCategoryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchCategoryObjectKeyData batchCategoryGetInIn) {
    super(id, context, "BatchCategoryGet");
    batchCategoryGetIn = batchCategoryGetInIn;
  }

  public void translateToMap() {
    if (batchCategoryGetIn != null) {
      batchCategoryGetIn.resetFlags(true, true);
      addInput("BatchCategory", BatchCategoryObjectKeyHelper.toMap(batchCategoryGetIn, new HashMap(), "BatchCategoryObjectKeyData").get("BatchCategoryObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchCategory
 * @param batchCategoryGetInIn Value of the batchCategoryGetIn
 *
 */

  public void setBatchCategory(BatchCategoryObjectKeyData batchCategoryGetInIn) {
    batchCategoryGetIn = batchCategoryGetInIn;
  }

  public void translateFromMap() {
    batchCategoryGetIn = BatchCategoryObjectKeyHelper.fromMap(inputMap, "BatchCategory");
  }

/**
 *
 * Gets the BatchCategory
 * @return Value of the BatchCategory
 *
 */

  public BatchCategoryObjectKeyData getBatchCategory( ) {
    return batchCategoryGetIn;
  }

}
