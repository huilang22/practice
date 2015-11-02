/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StateCreateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a StateCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StateCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StateObjectData noOpIn;

/**
 *
 * Constructor to create a   StateCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StateCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StateObjectData noOpInIn) {
    super(id, context, "StateCreate");
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
