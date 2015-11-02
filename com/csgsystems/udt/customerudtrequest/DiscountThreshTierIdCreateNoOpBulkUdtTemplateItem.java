/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountThreshTierIdCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DiscountThreshTierIdCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscountThreshTierIdCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DTTObjectData noOpIn;

/**
 *
 * Constructor to create a   DiscountThreshTierIdCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscountThreshTierIdCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DTTObjectData noOpInIn) {
    super(id, context, "DiscountThreshTierIdCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("DiscountThreshTierId", DTTObjectHelper.toMap(noOpIn, new HashMap(), "DiscountThreshTierId").get("DiscountThreshTierId"));
    }
  }
/**
 *
 * Sets the  DiscountThreshTierId
 * @param noOpInIn DTTObjectData to set
 *
 */
  public void setDiscountThreshTierId(DTTObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DiscountThreshTierId passed into the constructor
 * @return Simulated response
 *
 */
  public DTTObjectData getDiscountThreshTierId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DTTObjectHelper.fromMap(inputMap, "DiscountThreshTierId");
  }
}
