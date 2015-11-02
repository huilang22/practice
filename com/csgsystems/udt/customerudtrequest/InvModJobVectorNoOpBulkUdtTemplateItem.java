/*
 * Generated code DO NOT EDIT
 * Generated file: InvModJobVectorNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvModJobVectorNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvModJobVectorNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvModJobVectorOutputData noOpIn;

/**
 *
 * Constructor to create a   InvModJobVectorNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvModJobVectorNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvModJobVectorOutputData noOpInIn) {
    super(id, context, "InvModJobVector");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvModJobVectorOutputData", InvModJobVectorOutputHelper.toMap(noOpIn).get("InvModJobVectorOutputData"));
    }
  }
/**
 *
 * Sets the  InvModJobVectorOutputData
 * @param noOpInIn InvModJobVectorOutputData to set
 *
 */
  public void setInvModJobVectorOutputData(InvModJobVectorOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvModJobVectorOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvModJobVectorOutputData getInvModJobVectorOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvModJobVectorOutputHelper.fromMap(inputMap);
  }
}
