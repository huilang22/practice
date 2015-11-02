/*
 * Generated code DO NOT EDIT
 * Generated file: CtcEventFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcEventFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcEventFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcEventObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcEventFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcEventFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcEventObjectFilter FindInIn) {
    super(id, context, "CtcEventFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcEvent", CtcEventObjectHelper.toMap(FindIn, new HashMap(), "CtcEvent").get("CtcEvent"));
    }
  }


/**
 *
 * Sets the CtcEvent
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcEvent(CtcEventObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcEventObjectHelper.fromMapFilter(inputMap, "CtcEvent");
  }

/**
 *
 * Gets the CtcEvent
 * @return Value of the CtcEvent
 *
 */

  public CtcEventObjectFilter getCtcEvent( ) {
    return FindIn;
  }

}
