/*
 * Generated code DO NOT EDIT
 * Generated file: CtcEventCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcEventCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcEventCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcEventObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcEventCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcEventCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcEventObjectData CreateInIn) {
    super(id, context, "CtcEventCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcEvent", CtcEventObjectHelper.toMap(CreateIn, new HashMap(), "CtcEvent").get("CtcEvent"));
    }
  }


/**
 *
 * Sets the CtcEvent
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcEvent(CtcEventObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcEventObjectHelper.fromMap(inputMap, "CtcEvent");
  }

/**
 *
 * Gets the CtcEvent
 * @return Value of the CtcEvent
 *
 */

  public CtcEventObjectData getCtcEvent( ) {
    return CreateIn;
  }

}
