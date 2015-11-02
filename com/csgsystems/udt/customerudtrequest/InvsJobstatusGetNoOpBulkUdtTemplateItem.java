/*
 * Generated code DO NOT EDIT
 * Generated file: InvsJobstatusGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsJobstatusGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsJobstatusGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsJobstatusObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsJobstatusGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsJobstatusGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobstatusObjectData noOpInIn) {
    super(id, context, "InvsJobstatusGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsJobstatus", InvsJobstatusObjectHelper.toMap(noOpIn, new HashMap(), "InvsJobstatus").get("InvsJobstatus"));
    }
  }
/**
 *
 * Sets the  InvsJobstatus
 * @param noOpInIn InvsJobstatusObjectData to set
 *
 */
  public void setInvsJobstatus(InvsJobstatusObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsJobstatus passed into the constructor
 * @return Simulated response
 *
 */
  public InvsJobstatusObjectData getInvsJobstatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsJobstatusObjectHelper.fromMap(inputMap, "InvsJobstatus");
  }
}
