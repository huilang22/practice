/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimResellerCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSimResellerCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimResellerCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimResellerObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsSimResellerCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimResellerCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimResellerObjectData noOpInIn) {
    super(id, context, "InvsSimResellerCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsSimReseller", InvsSimResellerObjectHelper.toMap(noOpIn, new HashMap(), "InvsSimReseller").get("InvsSimReseller"));
    }
  }
/**
 *
 * Sets the  InvsSimReseller
 * @param noOpInIn InvsSimResellerObjectData to set
 *
 */
  public void setInvsSimReseller(InvsSimResellerObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSimReseller passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimResellerObjectData getInvsSimReseller() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSimResellerObjectHelper.fromMap(inputMap, "InvsSimReseller");
  }
}
