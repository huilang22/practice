/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerInvDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvContainerInvDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvContainerInvDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvContainerInvObjectData InvContainerInvDeleteIn;
/**
 *
 * Constructor to create a  InvContainerInvDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvContainerInvDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerInvObjectData InvContainerInvDeleteInIn) {
    super(id, context, "InvContainerInvDelete");
    InvContainerInvDeleteIn = InvContainerInvDeleteInIn;
  }

  public void translateToMap() {
    if (InvContainerInvDeleteIn != null) {
      InvContainerInvDeleteIn.resetFlags(true, true);
      addInput("InvContainerInv", InvContainerInvObjectHelper.toMap(InvContainerInvDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the InvContainerInv
 * @param InvContainerInvDeleteInIn Value of the InvContainerInvDeleteIn
 *
 */

  public void setInvContainerInv(InvContainerInvObjectData InvContainerInvDeleteInIn) {
    InvContainerInvDeleteIn = InvContainerInvDeleteInIn;
  }

  public void translateFromMap() {
    InvContainerInvDeleteIn = InvContainerInvObjectHelper.fromMap(inputMap, "InvContainerInv");
  }

/**
 *
 * Gets the InvContainerInv
 * @return Value of the InvContainerInv
 *
 */

  public InvContainerInvObjectData getInvContainerInv( ) {
    return InvContainerInvDeleteIn;
  }

}
