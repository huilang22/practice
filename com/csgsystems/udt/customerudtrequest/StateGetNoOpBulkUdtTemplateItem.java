/*
 * Generated code DO NOT EDIT
 * Generated file: StateGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a StateGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StateGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StateObjectData noOpIn;

/**
 *
 * Constructor to create a   StateGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StateGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StateObjectData noOpInIn) {
    super(id, context, "StateGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("State", StateObjectHelper.toMap(noOpIn, new HashMap(), "State").get("State"));
    }
  }
/**
 *
 * Sets the  State
 * @param noOpInIn StateObjectData to set
 *
 */
  public void setState(StateObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the State passed into the constructor
 * @return Simulated response
 *
 */
  public StateObjectData getState() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = StateObjectHelper.fromMap(inputMap, "State");
  }
}
