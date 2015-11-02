/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTemplateTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchTemplateTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTemplateTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTemplateTypeObjectFilter batchTemplateTypeFindIn;
/**
 *
 * Constructor to create a  BatchTemplateTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTemplateTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTemplateTypeObjectFilter batchTemplateTypeFindInIn) {
    super(id, context, "BatchTemplateTypeFind");
    batchTemplateTypeFindIn = batchTemplateTypeFindInIn;
  }

  public void translateToMap() {
    if (batchTemplateTypeFindIn != null) {
      Integer index =  batchTemplateTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchTemplateType", BatchTemplateTypeObjectHelper.toMap(batchTemplateTypeFindIn, new HashMap(), "BatchTemplateType").get("BatchTemplateType"));
    }
  }


/**
 *
 * Sets the BatchTemplateType
 * @param batchTemplateTypeFindInIn Value of the batchTemplateTypeFindIn
 *
 */

  public void setBatchTemplateType(BatchTemplateTypeObjectFilter batchTemplateTypeFindInIn) {
    batchTemplateTypeFindIn = batchTemplateTypeFindInIn;
  }

  public void translateFromMap() {
    batchTemplateTypeFindIn = BatchTemplateTypeObjectHelper.fromMapFilter(inputMap, "BatchTemplateType");
  }

/**
 *
 * Gets the BatchTemplateType
 * @return Value of the BatchTemplateType
 *
 */

  public BatchTemplateTypeObjectFilter getBatchTemplateType( ) {
    return batchTemplateTypeFindIn;
  }

}
