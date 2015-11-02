/*
 * Generated code DO NOT EDIT
 * Generated file: BatchInvSourceDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchInvSourceDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchInvSourceDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BISObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchInvSourceDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchInvSourceDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BISObjectData noOpInIn) {
    super(id, context, "BatchInvSourceDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchInvSource", BISObjectHelper.toMap(noOpIn, new HashMap(), "BatchInvSource").get("BatchInvSource"));
    }
  }
/**
 *
 * Sets the  BatchInvSource
 * @param noOpInIn BISObjectData to set
 *
 */
  public void setBatchInvSource(BISObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchInvSource passed into the constructor
 * @return Simulated response
 *
 */
  public BISObjectData getBatchInvSource() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BISObjectHelper.fromMap(inputMap, "BatchInvSource");
  }
}
