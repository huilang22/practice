/*
 * Generated code DO NOT EDIT
 * Generated file: BatchNotifyEventTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchNotifyEventTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchNotifyEventTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchNotifyEventTypeObjectData BatchNotifyEventTypeCreateIn;
/**
 *
 * Constructor to create a  BatchNotifyEventTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchNotifyEventTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchNotifyEventTypeObjectData BatchNotifyEventTypeCreateInIn) {
    super(id, context, "BatchNotifyEventTypeCreate");
    BatchNotifyEventTypeCreateIn = BatchNotifyEventTypeCreateInIn;
  }

  public void translateToMap() {
    if (BatchNotifyEventTypeCreateIn != null) {
      BatchNotifyEventTypeCreateIn.resetFlags(true, true);
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectHelper.toMap(BatchNotifyEventTypeCreateIn, new HashMap(), "BatchNotifyEventType").get("BatchNotifyEventType"));
    }
  }


/**
 *
 * Sets the BatchNotifyEventType
 * @param BatchNotifyEventTypeCreateInIn Value of the BatchNotifyEventTypeCreateIn
 *
 */

  public void setBatchNotifyEventType(BatchNotifyEventTypeObjectData BatchNotifyEventTypeCreateInIn) {
    BatchNotifyEventTypeCreateIn = BatchNotifyEventTypeCreateInIn;
  }

  public void translateFromMap() {
    BatchNotifyEventTypeCreateIn = BatchNotifyEventTypeObjectHelper.fromMap(inputMap, "BatchNotifyEventType");
  }

/**
 *
 * Gets the BatchNotifyEventType
 * @return Value of the BatchNotifyEventType
 *
 */

  public BatchNotifyEventTypeObjectData getBatchNotifyEventType( ) {
    return BatchNotifyEventTypeCreateIn;
  }

}
