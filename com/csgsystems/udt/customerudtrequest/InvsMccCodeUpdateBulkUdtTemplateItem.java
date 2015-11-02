/*
 * Generated code DO NOT EDIT
 * Generated file: InvsMccCodeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsMccCodeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsMccCodeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsMccCodeObjectData InvsMccCodeUpdateIn;
/**
 *
 * Constructor to create a  InvsMccCodeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsMccCodeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsMccCodeObjectData InvsMccCodeUpdateInIn) {
    super(id, context, "InvsMccCodeUpdate");
    InvsMccCodeUpdateIn = InvsMccCodeUpdateInIn;
  }

  public void translateToMap() {
    if (InvsMccCodeUpdateIn != null) {
      InvsMccCodeUpdateIn.resetFlags(true, true);
      addInput("InvsMccCode", InvsMccCodeObjectHelper.toMap(InvsMccCodeUpdateIn, new HashMap(), "InvsMccCode").get("InvsMccCode"));
    }
  }


/**
 *
 * Sets the InvsMccCode
 * @param InvsMccCodeUpdateInIn Value of the InvsMccCodeUpdateIn
 *
 */

  public void setInvsMccCode(InvsMccCodeObjectData InvsMccCodeUpdateInIn) {
    InvsMccCodeUpdateIn = InvsMccCodeUpdateInIn;
  }

  public void translateFromMap() {
    InvsMccCodeUpdateIn = InvsMccCodeObjectHelper.fromMap(inputMap, "InvsMccCode");
  }

/**
 *
 * Gets the InvsMccCode
 * @return Value of the InvsMccCode
 *
 */

  public InvsMccCodeObjectData getInvsMccCode( ) {
    return InvsMccCodeUpdateIn;
  }

}
