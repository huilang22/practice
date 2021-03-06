/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountTargetGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a DiscountTargetGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscountTargetGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DTObjectData noOpIn;

/**
 *
 * Constructor to create a   DiscountTargetGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscountTargetGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DTObjectData noOpInIn) {
    super(id, context, "DiscountTargetGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("DiscountTarget", DTObjectHelper.toMap(noOpIn, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
  }
/**
 *
 * Sets the  DiscountTarget
 * @param noOpInIn DTObjectData to set
 *
 */
  public void setDiscountTarget(DTObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DiscountTarget passed into the constructor
 * @return Simulated response
 *
 */
  public DTObjectData getDiscountTarget() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DTObjectHelper.fromMap(inputMap, "DiscountTarget");
  }
}
