/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerInvFindBulkUdtTemplateItem.java
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
 * Class used to create a InvContainerInvFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvContainerInvFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvContainerInvObjectFilter InvContainerInvFindIn;
/**
 *
 * Constructor to create a  InvContainerInvFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvContainerInvFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerInvObjectFilter InvContainerInvFindInIn) {
    super(id, context, "InvContainerInvFind");
    InvContainerInvFindIn = InvContainerInvFindInIn;
  }

  public void translateToMap() {
    if (InvContainerInvFindIn != null) {
      Integer index =  InvContainerInvFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvContainerInv", InvContainerInvObjectHelper.toMap(InvContainerInvFindIn, new HashMap(), "InvContainerInv").get("InvContainerInv"));
    }
  }


/**
 *
 * Sets the InvContainerInv
 * @param InvContainerInvFindInIn Value of the InvContainerInvFindIn
 *
 */

  public void setInvContainerInv(InvContainerInvObjectFilter InvContainerInvFindInIn) {
    InvContainerInvFindIn = InvContainerInvFindInIn;
  }

  public void translateFromMap() {
    InvContainerInvFindIn = InvContainerInvObjectHelper.fromMapFilter(inputMap, "InvContainerInv");
  }

/**
 *
 * Gets the InvContainerInv
 * @return Value of the InvContainerInv
 *
 */

  public InvContainerInvObjectFilter getInvContainerInv( ) {
    return InvContainerInvFindIn;
  }

}
