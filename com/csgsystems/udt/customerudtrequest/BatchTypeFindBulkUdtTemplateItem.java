/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTypeObjectFilter batchTypeFindIn;
/**
 *
 * Constructor to create a  BatchTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeObjectFilter batchTypeFindInIn) {
    super(id, context, "BatchTypeFind");
    batchTypeFindIn = batchTypeFindInIn;
  }

  public void translateToMap() {
    if (batchTypeFindIn != null) {
      Integer index =  batchTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchType", BatchTypeObjectHelper.toMap(batchTypeFindIn, new HashMap(), "BatchType").get("BatchType"));
    }
  }


/**
 *
 * Sets the BatchType
 * @param batchTypeFindInIn Value of the batchTypeFindIn
 *
 */

  public void setBatchType(BatchTypeObjectFilter batchTypeFindInIn) {
    batchTypeFindIn = batchTypeFindInIn;
  }

  public void translateFromMap() {
    batchTypeFindIn = BatchTypeObjectHelper.fromMapFilter(inputMap, "BatchType");
  }

/**
 *
 * Gets the BatchType
 * @return Value of the BatchType
 *
 */

  public BatchTypeObjectFilter getBatchType( ) {
    return batchTypeFindIn;
  }

}
