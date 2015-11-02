/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOrderMethodUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtcOrderMethodUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOrderMethodUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOrderMethodObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcOrderMethodUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOrderMethodUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOrderMethodObjectData UpdateInIn) {
    super(id, context, "CtcOrderMethodUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcOrderMethod", CtcOrderMethodObjectHelper.toMap(UpdateIn, new HashMap(), "CtcOrderMethod").get("CtcOrderMethod"));
    }
  }


/**
 *
 * Sets the CtcOrderMethod
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcOrderMethod(CtcOrderMethodObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcOrderMethodObjectHelper.fromMap(inputMap, "CtcOrderMethod");
  }

/**
 *
 * Gets the CtcOrderMethod
 * @return Value of the CtcOrderMethod
 *
 */

  public CtcOrderMethodObjectData getCtcOrderMethod( ) {
    return UpdateIn;
  }

}
