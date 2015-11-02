/*
 * Generated code DO NOT EDIT
 * Generated file: CtcEventUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtcEventUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcEventUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcEventObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcEventUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcEventUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcEventObjectData UpdateInIn) {
    super(id, context, "CtcEventUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcEvent", CtcEventObjectHelper.toMap(UpdateIn, new HashMap(), "CtcEvent").get("CtcEvent"));
    }
  }


/**
 *
 * Sets the CtcEvent
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcEvent(CtcEventObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcEventObjectHelper.fromMap(inputMap, "CtcEvent");
  }

/**
 *
 * Gets the CtcEvent
 * @return Value of the CtcEvent
 *
 */

  public CtcEventObjectData getCtcEvent( ) {
    return UpdateIn;
  }

}
