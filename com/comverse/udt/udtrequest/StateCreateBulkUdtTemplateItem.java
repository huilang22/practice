/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StateCreateBulkUdtTemplateItem.java
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
 * Class used to create a StateCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class StateCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StateObjectData STCreateIn;
/**
 *
 * Constructor to create a  StateCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StateCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, StateObjectData STCreateInIn) {
    super(id, context, "StateCreate");
    STCreateIn = STCreateInIn;
  }

  public void translateToMap() {
    if (STCreateIn != null) {
      STCreateIn.resetFlags(true, true);
      addInput("State", StateObjectHelper.toMap(STCreateIn, new HashMap(), "State").get("State"));
    }
  }


/**
 *
 * Sets the State
 * @param STCreateInIn Value of the STCreateIn
 *
 */

  public void setState(StateObjectData STCreateInIn) {
    STCreateIn = STCreateInIn;
  }

  public void translateFromMap() {
    STCreateIn = StateObjectHelper.fromMap(inputMap, "State");
  }

/**
 *
 * Gets the State
 * @return Value of the State
 *
 */

  public StateObjectData getState( ) {
    return STCreateIn;
  }

}
