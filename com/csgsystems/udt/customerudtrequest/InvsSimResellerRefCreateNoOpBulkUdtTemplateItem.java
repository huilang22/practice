/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimResellerRefCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSimResellerRefCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimResellerRefCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimResellerRefObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsSimResellerRefCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimResellerRefCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimResellerRefObjectData noOpInIn) {
    super(id, context, "InvsSimResellerRefCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsSimResellerRef").get("InvsSimResellerRef"));
    }
  }
/**
 *
 * Sets the  InvsSimResellerRef
 * @param noOpInIn InvsSimResellerRefObjectData to set
 *
 */
  public void setInvsSimResellerRef(InvsSimResellerRefObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSimResellerRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimResellerRefObjectData getInvsSimResellerRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSimResellerRefObjectHelper.fromMap(inputMap, "InvsSimResellerRef");
  }
}
