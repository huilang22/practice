/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementSwapNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvElementSwapNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvElementSwapNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvElementSwapOutputData noOpIn;

/**
 *
 * Constructor to create a   InvElementSwapNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvElementSwapNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementSwapOutputData noOpInIn) {
    super(id, context, "InvElementSwap");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvElementSwapOutputData", InvElementSwapOutputHelper.toMap(noOpIn).get("InvElementSwapOutputData"));
    }
  }
/**
 *
 * Sets the  InvElementSwapOutputData
 * @param noOpInIn InvElementSwapOutputData to set
 *
 */
  public void setInvElementSwapOutputData(InvElementSwapOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvElementSwapOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvElementSwapOutputData getInvElementSwapOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvElementSwapOutputHelper.fromMap(inputMap);
  }
}
