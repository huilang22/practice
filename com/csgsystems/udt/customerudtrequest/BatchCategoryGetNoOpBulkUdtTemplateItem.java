/*
 * Generated code DO NOT EDIT
 * Generated file: BatchCategoryGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchCategoryGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchCategoryGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchCategoryObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchCategoryGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchCategoryGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchCategoryObjectData noOpInIn) {
    super(id, context, "BatchCategoryGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchCategory", BatchCategoryObjectHelper.toMap(noOpIn, new HashMap(), "BatchCategory").get("BatchCategory"));
    }
  }
/**
 *
 * Sets the  BatchCategory
 * @param noOpInIn BatchCategoryObjectData to set
 *
 */
  public void setBatchCategory(BatchCategoryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchCategory passed into the constructor
 * @return Simulated response
 *
 */
  public BatchCategoryObjectData getBatchCategory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchCategoryObjectHelper.fromMap(inputMap, "BatchCategory");
  }
}
