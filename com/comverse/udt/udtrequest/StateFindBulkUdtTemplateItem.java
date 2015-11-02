/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StateFindBulkUdtTemplateItem.java
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
 * Class used to create a StateFindBulkUdtTemplateItem Bulk Template
 *
 */

public class StateFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StateObjectFilter STFindIn;
/**
 *
 * Constructor to create a  StateFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StateFindBulkUdtTemplateItem(String id, BSDMSessionContext context, StateObjectFilter STFindInIn) {
    super(id, context, "StateFind");
    STFindIn = STFindInIn;
  }

  public void translateToMap() {
    if (STFindIn != null) {
      Integer index =  STFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("State", StateObjectHelper.toMap(STFindIn, new HashMap(), "State").get("State"));
    }
  }


/**
 *
 * Sets the State
 * @param STFindInIn Value of the STFindIn
 *
 */

  public void setState(StateObjectFilter STFindInIn) {
    STFindIn = STFindInIn;
  }

  public void translateFromMap() {
    STFindIn = StateObjectHelper.fromMapFilter(inputMap, "State");
  }

/**
 *
 * Gets the State
 * @return Value of the State
 *
 */

  public StateObjectFilter getState( ) {
    return STFindIn;
  }

}
