/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobInvFindBulkUdtTemplateItem.java
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
 * Class used to create a InvJobInvFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvJobInvFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvJobInvObjectFilter InvJobInvFindIn;
/**
 *
 * Constructor to create a  InvJobInvFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvJobInvFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobInvObjectFilter InvJobInvFindInIn) {
    super(id, context, "InvJobInvFind");
    InvJobInvFindIn = InvJobInvFindInIn;
  }

  public void translateToMap() {
    if (InvJobInvFindIn != null) {
      Integer index =  InvJobInvFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvJobInv", InvJobInvObjectHelper.toMap(InvJobInvFindIn, new HashMap(), "InvJobInv").get("InvJobInv"));
    }
  }


/**
 *
 * Sets the InvJobInv
 * @param InvJobInvFindInIn Value of the InvJobInvFindIn
 *
 */

  public void setInvJobInv(InvJobInvObjectFilter InvJobInvFindInIn) {
    InvJobInvFindIn = InvJobInvFindInIn;
  }

  public void translateFromMap() {
    InvJobInvFindIn = InvJobInvObjectHelper.fromMapFilter(inputMap, "InvJobInv");
  }

/**
 *
 * Gets the InvJobInv
 * @return Value of the InvJobInv
 *
 */

  public InvJobInvObjectFilter getInvJobInv( ) {
    return InvJobInvFindIn;
  }

}
