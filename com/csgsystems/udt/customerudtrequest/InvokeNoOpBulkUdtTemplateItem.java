/*
 * Generated code DO NOT EDIT
 * Generated file: InvokeNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ai.data.*;

/**
 *
 * NoOp class used to simulate a InvokeNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvokeNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvokeOutputData noOpIn;

/**
 *
 * Constructor to create a   InvokeNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvokeNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvokeOutputData noOpInIn) {
    super(id, context, "Invoke");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvokeOutputData", InvokeOutputHelper.toMap(noOpIn).get("InvokeOutputData"));
    }
  }
/**
 *
 * Sets the  InvokeOutputData
 * @param noOpInIn InvokeOutputData to set
 *
 */
  public void setInvokeOutputData(InvokeOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvokeOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvokeOutputData getInvokeOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvokeOutputHelper.fromMap(inputMap);
  }
}
