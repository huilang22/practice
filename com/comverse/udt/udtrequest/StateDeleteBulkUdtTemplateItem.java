/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StateDeleteBulkUdtTemplateItem.java
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
 * Class used to create a StateDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class StateDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StateObjectKeyData STDeleteIn;
/**
 *
 * Constructor to create a  StateDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StateDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, StateObjectKeyData STDeleteInIn) {
    super(id, context, "StateDelete");
    STDeleteIn = STDeleteInIn;
  }

  public void translateToMap() {
    if (STDeleteIn != null) {
      STDeleteIn.resetFlags(true, true);
      addInput("State", StateObjectKeyHelper.toMap(STDeleteIn, new HashMap(), "StateObjectKeyData").get("StateObjectKeyData"));
    }
  }


/**
 *
 * Sets the State
 * @param STDeleteInIn Value of the STDeleteIn
 *
 */

  public void setState(StateObjectKeyData STDeleteInIn) {
    STDeleteIn = STDeleteInIn;
  }

  public void translateFromMap() {
    STDeleteIn = StateObjectKeyHelper.fromMap(inputMap, "State");
  }

/**
 *
 * Gets the State
 * @return Value of the State
 *
 */

  public StateObjectKeyData getState( ) {
    return STDeleteIn;
  }

}
