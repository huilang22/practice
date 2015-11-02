/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerInvCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvContainerInvCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvContainerInvCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvContainerInvObjectData InvContainerInvCreateIn;
/**
 *
 * Constructor to create a  InvContainerInvCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvContainerInvCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerInvObjectData InvContainerInvCreateInIn) {
    super(id, context, "InvContainerInvCreate");
    InvContainerInvCreateIn = InvContainerInvCreateInIn;
  }

  public void translateToMap() {
    if (InvContainerInvCreateIn != null) {
      InvContainerInvCreateIn.resetFlags(true, true);
      addInput("InvContainerInv", InvContainerInvObjectHelper.toMap(InvContainerInvCreateIn, new HashMap(), "InvContainerInv").get("InvContainerInv"));
    }
  }


/**
 *
 * Sets the InvContainerInv
 * @param InvContainerInvCreateInIn Value of the InvContainerInvCreateIn
 *
 */

  public void setInvContainerInv(InvContainerInvObjectData InvContainerInvCreateInIn) {
    InvContainerInvCreateIn = InvContainerInvCreateInIn;
  }

  public void translateFromMap() {
    InvContainerInvCreateIn = InvContainerInvObjectHelper.fromMap(inputMap, "InvContainerInv");
  }

/**
 *
 * Gets the InvContainerInv
 * @return Value of the InvContainerInv
 *
 */

  public InvContainerInvObjectData getInvContainerInv( ) {
    return InvContainerInvCreateIn;
  }

}
