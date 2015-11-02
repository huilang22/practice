/*
 * Generated code DO NOT EDIT
 * Generated file: InvSimVectorCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvSimVectorCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvSimVectorCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvSimVectorCreateOutputData noOpIn;

/**
 *
 * Constructor to create a   InvSimVectorCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvSimVectorCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSimVectorCreateOutputData noOpInIn) {
    super(id, context, "InvSimVectorCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvSimVectorCreateOutputData", InvSimVectorCreateOutputHelper.toMap(noOpIn).get("InvSimVectorCreateOutputData"));
    }
  }
/**
 *
 * Sets the  InvSimVectorCreateOutputData
 * @param noOpInIn InvSimVectorCreateOutputData to set
 *
 */
  public void setInvSimVectorCreateOutputData(InvSimVectorCreateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvSimVectorCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvSimVectorCreateOutputData getInvSimVectorCreateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvSimVectorCreateOutputHelper.fromMap(inputMap);
  }
}
