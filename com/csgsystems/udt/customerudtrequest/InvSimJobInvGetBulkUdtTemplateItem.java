/*
 * Generated code DO NOT EDIT
 * Generated file: InvSimJobInvGetBulkUdtTemplateItem.java
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
 * Class used to create a InvSimJobInvGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvSimJobInvGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvSimJobInvObjectKeyData InvSimJobInvGetIn;
/**
 *
 * Constructor to create a  InvSimJobInvGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvSimJobInvGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSimJobInvObjectKeyData InvSimJobInvGetInIn) {
    super(id, context, "InvSimJobInvGet");
    InvSimJobInvGetIn = InvSimJobInvGetInIn;
  }

  public void translateToMap() {
    if (InvSimJobInvGetIn != null) {
      InvSimJobInvGetIn.resetFlags(true, true);
      addInput("InvSimJobInv", InvSimJobInvObjectKeyHelper.toMap(InvSimJobInvGetIn, new HashMap(), "InvSimJobInvObjectKeyData").get("InvSimJobInvObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvSimJobInv
 * @param InvSimJobInvGetInIn Value of the InvSimJobInvGetIn
 *
 */

  public void setInvSimJobInv(InvSimJobInvObjectKeyData InvSimJobInvGetInIn) {
    InvSimJobInvGetIn = InvSimJobInvGetInIn;
  }

  public void translateFromMap() {
    InvSimJobInvGetIn = InvSimJobInvObjectKeyHelper.fromMap(inputMap, "InvSimJobInv");
  }

/**
 *
 * Gets the InvSimJobInv
 * @return Value of the InvSimJobInv
 *
 */

  public InvSimJobInvObjectKeyData getInvSimJobInv( ) {
    return InvSimJobInvGetIn;
  }

}
