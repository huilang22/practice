/*
 * Generated code DO NOT EDIT
 * Generated file: BatchNotifyTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchNotifyTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchNotifyTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchNotifyTypeObjectData batchNotifyTypeUpdateIn;
/**
 *
 * Constructor to create a  BatchNotifyTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchNotifyTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchNotifyTypeObjectData batchNotifyTypeUpdateInIn) {
    super(id, context, "BatchNotifyTypeUpdate");
    batchNotifyTypeUpdateIn = batchNotifyTypeUpdateInIn;
  }

  public void translateToMap() {
    if (batchNotifyTypeUpdateIn != null) {
      batchNotifyTypeUpdateIn.resetFlags(true, true);
      addInput("BatchNotifyType", BatchNotifyTypeObjectHelper.toMap(batchNotifyTypeUpdateIn, new HashMap(), "BatchNotifyType").get("BatchNotifyType"));
    }
  }


/**
 *
 * Sets the BatchNotifyType
 * @param batchNotifyTypeUpdateInIn Value of the batchNotifyTypeUpdateIn
 *
 */

  public void setBatchNotifyType(BatchNotifyTypeObjectData batchNotifyTypeUpdateInIn) {
    batchNotifyTypeUpdateIn = batchNotifyTypeUpdateInIn;
  }

  public void translateFromMap() {
    batchNotifyTypeUpdateIn = BatchNotifyTypeObjectHelper.fromMap(inputMap, "BatchNotifyType");
  }

/**
 *
 * Gets the BatchNotifyType
 * @return Value of the BatchNotifyType
 *
 */

  public BatchNotifyTypeObjectData getBatchNotifyType( ) {
    return batchNotifyTypeUpdateIn;
  }

}
