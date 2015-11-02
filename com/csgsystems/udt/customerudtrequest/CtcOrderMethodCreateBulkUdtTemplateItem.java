/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOrderMethodCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcOrderMethodCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOrderMethodCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOrderMethodObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcOrderMethodCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOrderMethodCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOrderMethodObjectData CreateInIn) {
    super(id, context, "CtcOrderMethodCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcOrderMethod", CtcOrderMethodObjectHelper.toMap(CreateIn, new HashMap(), "CtcOrderMethod").get("CtcOrderMethod"));
    }
  }


/**
 *
 * Sets the CtcOrderMethod
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcOrderMethod(CtcOrderMethodObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcOrderMethodObjectHelper.fromMap(inputMap, "CtcOrderMethod");
  }

/**
 *
 * Gets the CtcOrderMethod
 * @return Value of the CtcOrderMethod
 *
 */

  public CtcOrderMethodObjectData getCtcOrderMethod( ) {
    return CreateIn;
  }

}
