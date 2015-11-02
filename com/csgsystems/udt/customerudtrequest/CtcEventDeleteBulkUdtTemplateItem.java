/*
 * Generated code DO NOT EDIT
 * Generated file: CtcEventDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcEventDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcEventDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcEventObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcEventDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcEventDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcEventObjectKeyData DeleteInIn) {
    super(id, context, "CtcEventDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcEvent", CtcEventObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcEventObjectKeyData").get("CtcEventObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcEvent
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcEvent(CtcEventObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcEventObjectKeyHelper.fromMap(inputMap, "CtcEvent");
  }

/**
 *
 * Gets the CtcEvent
 * @return Value of the CtcEvent
 *
 */

  public CtcEventObjectKeyData getCtcEvent( ) {
    return DeleteIn;
  }

}
