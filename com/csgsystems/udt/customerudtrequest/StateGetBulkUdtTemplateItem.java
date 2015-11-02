/*
 * Generated code DO NOT EDIT
 * Generated file: StateGetBulkUdtTemplateItem.java
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
 * Class used to create a StateGetBulkUdtTemplateItem Bulk Template
 *
 */

public class StateGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StateObjectKeyData STGetIn;
/**
 *
 * Constructor to create a  StateGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StateGetBulkUdtTemplateItem(String id, BSDMSessionContext context, StateObjectKeyData STGetInIn) {
    super(id, context, "StateGet");
    STGetIn = STGetInIn;
  }

  public void translateToMap() {
    if (STGetIn != null) {
      STGetIn.resetFlags(true, true);
      addInput("State", StateObjectKeyHelper.toMap(STGetIn, new HashMap(), "StateObjectKeyData").get("StateObjectKeyData"));
    }
  }


/**
 *
 * Sets the State
 * @param STGetInIn Value of the STGetIn
 *
 */

  public void setState(StateObjectKeyData STGetInIn) {
    STGetIn = STGetInIn;
  }

  public void translateFromMap() {
    STGetIn = StateObjectKeyHelper.fromMap(inputMap, "State");
  }

/**
 *
 * Gets the State
 * @return Value of the State
 *
 */

  public StateObjectKeyData getState( ) {
    return STGetIn;
  }

}
