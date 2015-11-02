/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchCategorySequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchCategorySequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchCategorySequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchCategoryObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BatchCategorySequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchCategorySequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchCategoryObjectKeyData noOpInIn) {
    super(id, context, "BatchCategorySequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchCategory", BatchCategoryObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchCategory").get("BatchCategory"));
    }
  }
/**
 *
 * Sets the  BatchCategory
 * @param noOpInIn BatchCategoryObjectKeyData to set
 *
 */
  public void setBatchCategory(BatchCategoryObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchCategory passed into the constructor
 * @return Simulated response
 *
 */
  public BatchCategoryObjectKeyData getBatchCategory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchCategoryObjectKeyHelper.fromMap(inputMap, "BatchCategory");
  }
}
