/*
 * Generated code DO NOT EDIT
 * Generated file: BatchNotifyEventTypeCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchNotifyEventTypeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchNotifyEventTypeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchNotifyEventTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchNotifyEventTypeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchNotifyEventTypeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchNotifyEventTypeObjectData noOpInIn) {
    super(id, context, "BatchNotifyEventTypeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectHelper.toMap(noOpIn, new HashMap(), "BatchNotifyEventType").get("BatchNotifyEventType"));
    }
  }
/**
 *
 * Sets the  BatchNotifyEventType
 * @param noOpInIn BatchNotifyEventTypeObjectData to set
 *
 */
  public void setBatchNotifyEventType(BatchNotifyEventTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchNotifyEventType passed into the constructor
 * @return Simulated response
 *
 */
  public BatchNotifyEventTypeObjectData getBatchNotifyEventType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchNotifyEventTypeObjectHelper.fromMap(inputMap, "BatchNotifyEventType");
  }
}
