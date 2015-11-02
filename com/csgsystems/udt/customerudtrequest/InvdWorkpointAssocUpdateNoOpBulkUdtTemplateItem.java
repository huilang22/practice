/*
 * Generated code DO NOT EDIT
 * Generated file: InvdWorkpointAssocUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvdWorkpointAssocUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdWorkpointAssocUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdWorkpointAssocObjectData noOpIn;

/**
 *
 * Constructor to create a   InvdWorkpointAssocUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdWorkpointAssocUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdWorkpointAssocObjectData noOpInIn) {
    super(id, context, "InvdWorkpointAssocUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectHelper.toMap(noOpIn, new HashMap(), "InvdWorkpointAssoc").get("InvdWorkpointAssoc"));
    }
  }
/**
 *
 * Sets the  InvdWorkpointAssoc
 * @param noOpInIn InvdWorkpointAssocObjectData to set
 *
 */
  public void setInvdWorkpointAssoc(InvdWorkpointAssocObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdWorkpointAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public InvdWorkpointAssocObjectData getInvdWorkpointAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdWorkpointAssocObjectHelper.fromMap(inputMap, "InvdWorkpointAssoc");
  }
}
