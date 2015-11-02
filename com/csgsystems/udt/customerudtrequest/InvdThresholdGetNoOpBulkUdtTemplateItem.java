/*
 * Generated code DO NOT EDIT
 * Generated file: InvdThresholdGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvdThresholdGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdThresholdGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdThresholdObjectData noOpIn;

/**
 *
 * Constructor to create a   InvdThresholdGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdThresholdGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdThresholdObjectData noOpInIn) {
    super(id, context, "InvdThresholdGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvdThreshold", InvdThresholdObjectHelper.toMap(noOpIn, new HashMap(), "InvdThreshold").get("InvdThreshold"));
    }
  }
/**
 *
 * Sets the  InvdThreshold
 * @param noOpInIn InvdThresholdObjectData to set
 *
 */
  public void setInvdThreshold(InvdThresholdObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdThreshold passed into the constructor
 * @return Simulated response
 *
 */
  public InvdThresholdObjectData getInvdThreshold() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdThresholdObjectHelper.fromMap(inputMap, "InvdThreshold");
  }
}
