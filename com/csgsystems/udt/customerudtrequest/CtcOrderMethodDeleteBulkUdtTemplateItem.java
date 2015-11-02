/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOrderMethodDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcOrderMethodDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOrderMethodDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOrderMethodObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcOrderMethodDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOrderMethodDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOrderMethodObjectKeyData DeleteInIn) {
    super(id, context, "CtcOrderMethodDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcOrderMethod", CtcOrderMethodObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcOrderMethodObjectKeyData").get("CtcOrderMethodObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcOrderMethod
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcOrderMethod(CtcOrderMethodObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcOrderMethodObjectKeyHelper.fromMap(inputMap, "CtcOrderMethod");
  }

/**
 *
 * Gets the CtcOrderMethod
 * @return Value of the CtcOrderMethod
 *
 */

  public CtcOrderMethodObjectKeyData getCtcOrderMethod( ) {
    return DeleteIn;
  }

}
