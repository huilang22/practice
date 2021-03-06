/*
 * Generated code DO NOT EDIT
 * Generated file: InvModJobCountNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvModJobCountNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvModJobCountNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvModJobCountOutputData noOpIn;

/**
 *
 * Constructor to create a   InvModJobCountNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvModJobCountNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvModJobCountOutputData noOpInIn) {
    super(id, context, "InvModJobCount");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvModJobCountOutputData", InvModJobCountOutputHelper.toMap(noOpIn).get("InvModJobCountOutputData"));
    }
  }
/**
 *
 * Sets the  InvModJobCountOutputData
 * @param noOpInIn InvModJobCountOutputData to set
 *
 */
  public void setInvModJobCountOutputData(InvModJobCountOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvModJobCountOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvModJobCountOutputData getInvModJobCountOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvModJobCountOutputHelper.fromMap(inputMap);
  }
}
