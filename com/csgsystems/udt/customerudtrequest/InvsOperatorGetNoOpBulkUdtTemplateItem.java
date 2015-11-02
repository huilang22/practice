/*
 * Generated code DO NOT EDIT
 * Generated file: InvsOperatorGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsOperatorGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsOperatorGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsOperatorObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsOperatorGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsOperatorGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsOperatorObjectData noOpInIn) {
    super(id, context, "InvsOperatorGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsOperator", InvsOperatorObjectHelper.toMap(noOpIn, new HashMap(), "InvsOperator").get("InvsOperator"));
    }
  }
/**
 *
 * Sets the  InvsOperator
 * @param noOpInIn InvsOperatorObjectData to set
 *
 */
  public void setInvsOperator(InvsOperatorObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsOperator passed into the constructor
 * @return Simulated response
 *
 */
  public InvsOperatorObjectData getInvsOperator() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsOperatorObjectHelper.fromMap(inputMap, "InvsOperator");
  }
}
