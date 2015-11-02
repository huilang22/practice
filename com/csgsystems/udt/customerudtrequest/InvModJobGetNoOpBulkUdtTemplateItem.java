/*
 * Generated code DO NOT EDIT
 * Generated file: InvModJobGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvModJobGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvModJobGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvModJobObjectData noOpIn;

/**
 *
 * Constructor to create a   InvModJobGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvModJobGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvModJobObjectData noOpInIn) {
    super(id, context, "InvModJobGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvModJob", InvModJobObjectHelper.toMap(noOpIn, new HashMap(), "InvModJob").get("InvModJob"));
    }
  }
/**
 *
 * Sets the  InvModJob
 * @param noOpInIn InvModJobObjectData to set
 *
 */
  public void setInvModJob(InvModJobObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvModJob passed into the constructor
 * @return Simulated response
 *
 */
  public InvModJobObjectData getInvModJob() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvModJobObjectHelper.fromMap(inputMap, "InvModJob");
  }
}
