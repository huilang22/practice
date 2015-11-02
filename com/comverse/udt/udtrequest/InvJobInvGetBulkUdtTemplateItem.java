/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobInvGetBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a InvJobInvGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvJobInvGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvJobInvObjectKeyData InvJobInvGetIn;
/**
 *
 * Constructor to create a  InvJobInvGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvJobInvGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobInvObjectKeyData InvJobInvGetInIn) {
    super(id, context, "InvJobInvGet");
    InvJobInvGetIn = InvJobInvGetInIn;
  }

  public void translateToMap() {
    if (InvJobInvGetIn != null) {
      InvJobInvGetIn.resetFlags(true, true);
      addInput("InvJobInv", InvJobInvObjectKeyHelper.toMap(InvJobInvGetIn, new HashMap(), "InvJobInvObjectKeyData").get("InvJobInvObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvJobInv
 * @param InvJobInvGetInIn Value of the InvJobInvGetIn
 *
 */

  public void setInvJobInv(InvJobInvObjectKeyData InvJobInvGetInIn) {
    InvJobInvGetIn = InvJobInvGetInIn;
  }

  public void translateFromMap() {
    InvJobInvGetIn = InvJobInvObjectKeyHelper.fromMap(inputMap, "InvJobInv");
  }

/**
 *
 * Gets the InvJobInv
 * @return Value of the InvJobInv
 *
 */

  public InvJobInvObjectKeyData getInvJobInv( ) {
    return InvJobInvGetIn;
  }

}
