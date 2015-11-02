/*
 * Generated code DO NOT EDIT
 * Generated file: CtcEventGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcEventGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcEventGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcEventObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcEventGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcEventGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcEventObjectKeyData GetInIn) {
    super(id, context, "CtcEventGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcEvent", CtcEventObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcEventObjectKeyData").get("CtcEventObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcEvent
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcEvent(CtcEventObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcEventObjectKeyHelper.fromMap(inputMap, "CtcEvent");
  }

/**
 *
 * Gets the CtcEvent
 * @return Value of the CtcEvent
 *
 */

  public CtcEventObjectKeyData getCtcEvent( ) {
    return GetIn;
  }

}
