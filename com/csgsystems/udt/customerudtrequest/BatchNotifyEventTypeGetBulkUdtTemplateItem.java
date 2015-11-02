/*
 * Generated code DO NOT EDIT
 * Generated file: BatchNotifyEventTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchNotifyEventTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchNotifyEventTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchNotifyEventTypeObjectKeyData batchNotifyEventTypeGetIn;
/**
 *
 * Constructor to create a  BatchNotifyEventTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchNotifyEventTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchNotifyEventTypeObjectKeyData batchNotifyEventTypeGetInIn) {
    super(id, context, "BatchNotifyEventTypeGet");
    batchNotifyEventTypeGetIn = batchNotifyEventTypeGetInIn;
  }

  public void translateToMap() {
    if (batchNotifyEventTypeGetIn != null) {
      batchNotifyEventTypeGetIn.resetFlags(true, true);
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectKeyHelper.toMap(batchNotifyEventTypeGetIn, new HashMap(), "BatchNotifyEventTypeObjectKeyData").get("BatchNotifyEventTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchNotifyEventType
 * @param batchNotifyEventTypeGetInIn Value of the batchNotifyEventTypeGetIn
 *
 */

  public void setBatchNotifyEventType(BatchNotifyEventTypeObjectKeyData batchNotifyEventTypeGetInIn) {
    batchNotifyEventTypeGetIn = batchNotifyEventTypeGetInIn;
  }

  public void translateFromMap() {
    batchNotifyEventTypeGetIn = BatchNotifyEventTypeObjectKeyHelper.fromMap(inputMap, "BatchNotifyEventType");
  }

/**
 *
 * Gets the BatchNotifyEventType
 * @return Value of the BatchNotifyEventType
 *
 */

  public BatchNotifyEventTypeObjectKeyData getBatchNotifyEventType( ) {
    return batchNotifyEventTypeGetIn;
  }

}
