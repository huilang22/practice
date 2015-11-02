/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvContainerDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvContainerDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvContainerObjectData InvContainerDeleteIn;
/**
 *
 * Constructor to create a  InvContainerDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvContainerDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerObjectData InvContainerDeleteInIn) {
    super(id, context, "InvContainerDelete");
    InvContainerDeleteIn = InvContainerDeleteInIn;
  }

  public void translateToMap() {
    if (InvContainerDeleteIn != null) {
      InvContainerDeleteIn.resetFlags(true, true);
      addInput("InvContainer", InvContainerObjectHelper.toMap(InvContainerDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the InvContainer
 * @param InvContainerDeleteInIn Value of the InvContainerDeleteIn
 *
 */

  public void setInvContainer(InvContainerObjectData InvContainerDeleteInIn) {
    InvContainerDeleteIn = InvContainerDeleteInIn;
  }

  public void translateFromMap() {
    InvContainerDeleteIn = InvContainerObjectHelper.fromMap(inputMap, "InvContainer");
  }

/**
 *
 * Gets the InvContainer
 * @return Value of the InvContainer
 *
 */

  public InvContainerObjectData getInvContainer( ) {
    return InvContainerDeleteIn;
  }

}
