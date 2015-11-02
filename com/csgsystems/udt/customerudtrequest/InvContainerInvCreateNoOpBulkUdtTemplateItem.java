/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerInvCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvContainerInvCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvContainerInvCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvContainerInvObjectData noOpIn;

/**
 *
 * Constructor to create a   InvContainerInvCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvContainerInvCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerInvObjectData noOpInIn) {
    super(id, context, "InvContainerInvCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvContainerInv", InvContainerInvObjectHelper.toMap(noOpIn, new HashMap(), "InvContainerInv").get("InvContainerInv"));
    }
  }
/**
 *
 * Sets the  InvContainerInv
 * @param noOpInIn InvContainerInvObjectData to set
 *
 */
  public void setInvContainerInv(InvContainerInvObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvContainerInv passed into the constructor
 * @return Simulated response
 *
 */
  public InvContainerInvObjectData getInvContainerInv() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvContainerInvObjectHelper.fromMap(inputMap, "InvContainerInv");
  }
}
