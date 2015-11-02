/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOrderMethodGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcOrderMethodGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOrderMethodGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOrderMethodObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcOrderMethodGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOrderMethodGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOrderMethodObjectKeyData GetInIn) {
    super(id, context, "CtcOrderMethodGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcOrderMethod", CtcOrderMethodObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcOrderMethodObjectKeyData").get("CtcOrderMethodObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcOrderMethod
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcOrderMethod(CtcOrderMethodObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcOrderMethodObjectKeyHelper.fromMap(inputMap, "CtcOrderMethod");
  }

/**
 *
 * Gets the CtcOrderMethod
 * @return Value of the CtcOrderMethod
 *
 */

  public CtcOrderMethodObjectKeyData getCtcOrderMethod( ) {
    return GetIn;
  }

}
