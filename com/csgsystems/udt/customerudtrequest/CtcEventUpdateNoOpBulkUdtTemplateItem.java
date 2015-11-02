/*
 * Generated code DO NOT EDIT
 * Generated file: CtcEventUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcEventUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcEventUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcEventObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcEventUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcEventUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcEventObjectData noOpInIn) {
    super(id, context, "CtcEventUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcEvent", CtcEventObjectHelper.toMap(noOpIn, new HashMap(), "CtcEvent").get("CtcEvent"));
    }
  }
/**
 *
 * Sets the  CtcEvent
 * @param noOpInIn CtcEventObjectData to set
 *
 */
  public void setCtcEvent(CtcEventObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcEvent passed into the constructor
 * @return Simulated response
 *
 */
  public CtcEventObjectData getCtcEvent() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcEventObjectHelper.fromMap(inputMap, "CtcEvent");
  }
}
