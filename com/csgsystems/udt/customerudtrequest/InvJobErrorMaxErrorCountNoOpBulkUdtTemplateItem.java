/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobErrorMaxErrorCountNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvJobErrorMaxErrorCountNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvJobErrorMaxErrorCountNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvJobErrorObjectData noOpIn;

/**
 *
 * Constructor to create a   InvJobErrorMaxErrorCountNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvJobErrorMaxErrorCountNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobErrorObjectData noOpInIn) {
    super(id, context, "InvJobErrorMaxErrorCount");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvJobError", InvJobErrorObjectHelper.toMap(noOpIn, new HashMap(), "InvJobError").get("InvJobError"));
    }
  }
/**
 *
 * Sets the  InvJobError
 * @param noOpInIn InvJobErrorObjectData to set
 *
 */
  public void setInvJobError(InvJobErrorObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvJobError passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobErrorObjectData getInvJobError() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvJobErrorObjectHelper.fromMap(inputMap, "InvJobError");
  }
}
