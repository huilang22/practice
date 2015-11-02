/*
 * Generated code DO NOT EDIT
 * Generated file: InvsMccCodeGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsMccCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsMccCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsMccCodeObjectKeyData InvsMccCodeGetIn;
/**
 *
 * Constructor to create a  InvsMccCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsMccCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsMccCodeObjectKeyData InvsMccCodeGetInIn) {
    super(id, context, "InvsMccCodeGet");
    InvsMccCodeGetIn = InvsMccCodeGetInIn;
  }

  public void translateToMap() {
    if (InvsMccCodeGetIn != null) {
      InvsMccCodeGetIn.resetFlags(true, true);
      addInput("InvsMccCode", InvsMccCodeObjectKeyHelper.toMap(InvsMccCodeGetIn, new HashMap(), "InvsMccCodeObjectKeyData").get("InvsMccCodeObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsMccCode
 * @param InvsMccCodeGetInIn Value of the InvsMccCodeGetIn
 *
 */

  public void setInvsMccCode(InvsMccCodeObjectKeyData InvsMccCodeGetInIn) {
    InvsMccCodeGetIn = InvsMccCodeGetInIn;
  }

  public void translateFromMap() {
    InvsMccCodeGetIn = InvsMccCodeObjectKeyHelper.fromMap(inputMap, "InvsMccCode");
  }

/**
 *
 * Gets the InvsMccCode
 * @return Value of the InvsMccCode
 *
 */

  public InvsMccCodeObjectKeyData getInvsMccCode( ) {
    return InvsMccCodeGetIn;
  }

}
