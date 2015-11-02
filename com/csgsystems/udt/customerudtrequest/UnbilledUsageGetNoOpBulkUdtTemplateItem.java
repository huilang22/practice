/*
 * Generated code DO NOT EDIT
 * Generated file: UnbilledUsageGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a UnbilledUsageGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnbilledUsageGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnbilledUsageObjectData noOpIn;

/**
 *
 * Constructor to create a   UnbilledUsageGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnbilledUsageGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageObjectData noOpInIn) {
    super(id, context, "UnbilledUsageGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(noOpIn, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
/**
 *
 * Sets the  UnbilledUsage
 * @param noOpInIn UnbilledUsageObjectData to set
 *
 */
  public void setUnbilledUsage(UnbilledUsageObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnbilledUsage passed into the constructor
 * @return Simulated response
 *
 */
  public UnbilledUsageObjectData getUnbilledUsage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnbilledUsageObjectHelper.fromMap(inputMap, "UnbilledUsage");
  }
}
