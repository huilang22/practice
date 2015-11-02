/*
 * Generated code DO NOT EDIT
 * Generated file: InvsJobsubstateGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsJobsubstateGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsJobsubstateGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsJobsubstateObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsJobsubstateGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsJobsubstateGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobsubstateObjectData noOpInIn) {
    super(id, context, "InvsJobsubstateGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsJobsubstate", InvsJobsubstateObjectHelper.toMap(noOpIn, new HashMap(), "InvsJobsubstate").get("InvsJobsubstate"));
    }
  }
/**
 *
 * Sets the  InvsJobsubstate
 * @param noOpInIn InvsJobsubstateObjectData to set
 *
 */
  public void setInvsJobsubstate(InvsJobsubstateObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsJobsubstate passed into the constructor
 * @return Simulated response
 *
 */
  public InvsJobsubstateObjectData getInvsJobsubstate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsJobsubstateObjectHelper.fromMap(inputMap, "InvsJobsubstate");
  }
}
