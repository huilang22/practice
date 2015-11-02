/*
 * Generated code DO NOT EDIT
 * Generated file: BatchNotifyTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchNotifyTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchNotifyTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchNotifyTypeObjectFilter batchNotifyTypeFindIn;
/**
 *
 * Constructor to create a  BatchNotifyTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchNotifyTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchNotifyTypeObjectFilter batchNotifyTypeFindInIn) {
    super(id, context, "BatchNotifyTypeFind");
    batchNotifyTypeFindIn = batchNotifyTypeFindInIn;
  }

  public void translateToMap() {
    if (batchNotifyTypeFindIn != null) {
      Integer index =  batchNotifyTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchNotifyType", BatchNotifyTypeObjectHelper.toMap(batchNotifyTypeFindIn, new HashMap(), "BatchNotifyType").get("BatchNotifyType"));
    }
  }


/**
 *
 * Sets the BatchNotifyType
 * @param batchNotifyTypeFindInIn Value of the batchNotifyTypeFindIn
 *
 */

  public void setBatchNotifyType(BatchNotifyTypeObjectFilter batchNotifyTypeFindInIn) {
    batchNotifyTypeFindIn = batchNotifyTypeFindInIn;
  }

  public void translateFromMap() {
    batchNotifyTypeFindIn = BatchNotifyTypeObjectHelper.fromMapFilter(inputMap, "BatchNotifyType");
  }

/**
 *
 * Gets the BatchNotifyType
 * @return Value of the BatchNotifyType
 *
 */

  public BatchNotifyTypeObjectFilter getBatchNotifyType( ) {
    return batchNotifyTypeFindIn;
  }

}
