/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvContainerGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvContainerGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvContainerObjectData noOpIn;

/**
 *
 * Constructor to create a   InvContainerGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvContainerGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerObjectData noOpInIn) {
    super(id, context, "InvContainerGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvContainer", InvContainerObjectHelper.toMap(noOpIn, new HashMap(), "InvContainer").get("InvContainer"));
    }
  }
/**
 *
 * Sets the  InvContainer
 * @param noOpInIn InvContainerObjectData to set
 *
 */
  public void setInvContainer(InvContainerObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvContainer passed into the constructor
 * @return Simulated response
 *
 */
  public InvContainerObjectData getInvContainer() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvContainerObjectHelper.fromMap(inputMap, "InvContainer");
  }
}
