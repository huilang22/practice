/*
 * Generated code DO NOT EDIT
 * Generated file: InvsThresholdCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsThresholdCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsThresholdCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsThresholdObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsThresholdCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsThresholdCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsThresholdObjectData noOpInIn) {
    super(id, context, "InvsThresholdCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(noOpIn, new HashMap(), "InvsThreshold").get("InvsThreshold"));
    }
  }
/**
 *
 * Sets the  InvsThreshold
 * @param noOpInIn InvsThresholdObjectData to set
 *
 */
  public void setInvsThreshold(InvsThresholdObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsThreshold passed into the constructor
 * @return Simulated response
 *
 */
  public InvsThresholdObjectData getInvsThreshold() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsThresholdObjectHelper.fromMap(inputMap, "InvsThreshold");
  }
}
