/*
 * Generated code DO NOT EDIT
 * Generated file: InvSimJobInvGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvSimJobInvGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvSimJobInvGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvSimJobInvObjectData noOpIn;

/**
 *
 * Constructor to create a   InvSimJobInvGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvSimJobInvGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSimJobInvObjectData noOpInIn) {
    super(id, context, "InvSimJobInvGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvSimJobInv", InvSimJobInvObjectHelper.toMap(noOpIn, new HashMap(), "InvSimJobInv").get("InvSimJobInv"));
    }
  }
/**
 *
 * Sets the  InvSimJobInv
 * @param noOpInIn InvSimJobInvObjectData to set
 *
 */
  public void setInvSimJobInv(InvSimJobInvObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvSimJobInv passed into the constructor
 * @return Simulated response
 *
 */
  public InvSimJobInvObjectData getInvSimJobInv() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvSimJobInvObjectHelper.fromMap(inputMap, "InvSimJobInv");
  }
}
