/*
 * Generated code DO NOT EDIT
 * Generated file: BatchNotifyTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchNotifyTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchNotifyTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchNotifyTypeObjectKeyData batchNotifyTypeDeleteIn;
/**
 *
 * Constructor to create a  BatchNotifyTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchNotifyTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchNotifyTypeObjectKeyData batchNotifyTypeDeleteInIn) {
    super(id, context, "BatchNotifyTypeDelete");
    batchNotifyTypeDeleteIn = batchNotifyTypeDeleteInIn;
  }

  public void translateToMap() {
    if (batchNotifyTypeDeleteIn != null) {
      batchNotifyTypeDeleteIn.resetFlags(true, true);
      addInput("BatchNotifyType", BatchNotifyTypeObjectKeyHelper.toMap(batchNotifyTypeDeleteIn, new HashMap(), "BatchNotifyTypeObjectKeyData").get("BatchNotifyTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchNotifyType
 * @param batchNotifyTypeDeleteInIn Value of the batchNotifyTypeDeleteIn
 *
 */

  public void setBatchNotifyType(BatchNotifyTypeObjectKeyData batchNotifyTypeDeleteInIn) {
    batchNotifyTypeDeleteIn = batchNotifyTypeDeleteInIn;
  }

  public void translateFromMap() {
    batchNotifyTypeDeleteIn = BatchNotifyTypeObjectKeyHelper.fromMap(inputMap, "BatchNotifyType");
  }

/**
 *
 * Gets the BatchNotifyType
 * @return Value of the BatchNotifyType
 *
 */

  public BatchNotifyTypeObjectKeyData getBatchNotifyType( ) {
    return batchNotifyTypeDeleteIn;
  }

}
