/*
 * Generated code DO NOT EDIT
 * Generated file: BatchNotifyTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchNotifyTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchNotifyTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchNotifyTypeObjectKeyData batchNotifyTypeGetIn;
/**
 *
 * Constructor to create a  BatchNotifyTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchNotifyTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchNotifyTypeObjectKeyData batchNotifyTypeGetInIn) {
    super(id, context, "BatchNotifyTypeGet");
    batchNotifyTypeGetIn = batchNotifyTypeGetInIn;
  }

  public void translateToMap() {
    if (batchNotifyTypeGetIn != null) {
      batchNotifyTypeGetIn.resetFlags(true, true);
      addInput("BatchNotifyType", BatchNotifyTypeObjectKeyHelper.toMap(batchNotifyTypeGetIn, new HashMap(), "BatchNotifyTypeObjectKeyData").get("BatchNotifyTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchNotifyType
 * @param batchNotifyTypeGetInIn Value of the batchNotifyTypeGetIn
 *
 */

  public void setBatchNotifyType(BatchNotifyTypeObjectKeyData batchNotifyTypeGetInIn) {
    batchNotifyTypeGetIn = batchNotifyTypeGetInIn;
  }

  public void translateFromMap() {
    batchNotifyTypeGetIn = BatchNotifyTypeObjectKeyHelper.fromMap(inputMap, "BatchNotifyType");
  }

/**
 *
 * Gets the BatchNotifyType
 * @return Value of the BatchNotifyType
 *
 */

  public BatchNotifyTypeObjectKeyData getBatchNotifyType( ) {
    return batchNotifyTypeGetIn;
  }

}
