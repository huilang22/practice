/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimJobInvFindBulkUdtTemplateItem.java
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
 * Class used to create a InvSimJobInvFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvSimJobInvFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvSimJobInvObjectFilter InvSimJobInvFindIn;
/**
 *
 * Constructor to create a  InvSimJobInvFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvSimJobInvFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSimJobInvObjectFilter InvSimJobInvFindInIn) {
    super(id, context, "InvSimJobInvFind");
    InvSimJobInvFindIn = InvSimJobInvFindInIn;
  }

  public void translateToMap() {
    if (InvSimJobInvFindIn != null) {
      Integer index =  InvSimJobInvFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvSimJobInv", InvSimJobInvObjectHelper.toMap(InvSimJobInvFindIn, new HashMap(), "InvSimJobInv").get("InvSimJobInv"));
    }
  }


/**
 *
 * Sets the InvSimJobInv
 * @param InvSimJobInvFindInIn Value of the InvSimJobInvFindIn
 *
 */

  public void setInvSimJobInv(InvSimJobInvObjectFilter InvSimJobInvFindInIn) {
    InvSimJobInvFindIn = InvSimJobInvFindInIn;
  }

  public void translateFromMap() {
    InvSimJobInvFindIn = InvSimJobInvObjectHelper.fromMapFilter(inputMap, "InvSimJobInv");
  }

/**
 *
 * Gets the InvSimJobInv
 * @return Value of the InvSimJobInv
 *
 */

  public InvSimJobInvObjectFilter getInvSimJobInv( ) {
    return InvSimJobInvFindIn;
  }

}
