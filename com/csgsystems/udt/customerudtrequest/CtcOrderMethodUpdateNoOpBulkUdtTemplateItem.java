/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOrderMethodUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcOrderMethodUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOrderMethodUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOrderMethodObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcOrderMethodUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOrderMethodUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOrderMethodObjectData noOpInIn) {
    super(id, context, "CtcOrderMethodUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcOrderMethod", CtcOrderMethodObjectHelper.toMap(noOpIn, new HashMap(), "CtcOrderMethod").get("CtcOrderMethod"));
    }
  }
/**
 *
 * Sets the  CtcOrderMethod
 * @param noOpInIn CtcOrderMethodObjectData to set
 *
 */
  public void setCtcOrderMethod(CtcOrderMethodObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOrderMethod passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOrderMethodObjectData getCtcOrderMethod() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOrderMethodObjectHelper.fromMap(inputMap, "CtcOrderMethod");
  }
}
