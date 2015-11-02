/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobInvGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvJobInvGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvJobInvGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvJobInvObjectData noOpIn;

/**
 *
 * Constructor to create a   InvJobInvGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvJobInvGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobInvObjectData noOpInIn) {
    super(id, context, "InvJobInvGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvJobInv", InvJobInvObjectHelper.toMap(noOpIn, new HashMap(), "InvJobInv").get("InvJobInv"));
    }
  }
/**
 *
 * Sets the  InvJobInv
 * @param noOpInIn InvJobInvObjectData to set
 *
 */
  public void setInvJobInv(InvJobInvObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvJobInv passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobInvObjectData getInvJobInv() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvJobInvObjectHelper.fromMap(inputMap, "InvJobInv");
  }
}
