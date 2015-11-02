/*
 * Generated code DO NOT EDIT
 * Generated file: InvsHlrGetBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsHlrGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsHlrGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsHlrObjectKeyData InvsHlrGetIn;
/**
 *
 * Constructor to create a  InvsHlrGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsHlrGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsHlrObjectKeyData InvsHlrGetInIn) {
    super(id, context, "InvsHlrGet");
    InvsHlrGetIn = InvsHlrGetInIn;
  }

  public void translateToMap() {
    if (InvsHlrGetIn != null) {
      InvsHlrGetIn.resetFlags(true, true);
      addInput("InvsHlr", InvsHlrObjectKeyHelper.toMap(InvsHlrGetIn, new HashMap(), "InvsHlrObjectKeyData").get("InvsHlrObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsHlr
 * @param InvsHlrGetInIn Value of the InvsHlrGetIn
 *
 */

  public void setInvsHlr(InvsHlrObjectKeyData InvsHlrGetInIn) {
    InvsHlrGetIn = InvsHlrGetInIn;
  }

  public void translateFromMap() {
    InvsHlrGetIn = InvsHlrObjectKeyHelper.fromMap(inputMap, "InvsHlr");
  }

/**
 *
 * Gets the InvsHlr
 * @return Value of the InvsHlr
 *
 */

  public InvsHlrObjectKeyData getInvsHlr( ) {
    return InvsHlrGetIn;
  }

}
