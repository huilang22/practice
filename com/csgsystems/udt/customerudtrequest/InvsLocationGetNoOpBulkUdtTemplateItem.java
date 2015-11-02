/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsLocationGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLocationGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLocationObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsLocationGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLocationGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationObjectData noOpInIn) {
    super(id, context, "InvsLocationGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsLocation", InvsLocationObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocation").get("InvsLocation"));
    }
  }
/**
 *
 * Sets the  InvsLocation
 * @param noOpInIn InvsLocationObjectData to set
 *
 */
  public void setInvsLocation(InvsLocationObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLocation passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationObjectData getInvsLocation() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLocationObjectHelper.fromMap(inputMap, "InvsLocation");
  }
}
