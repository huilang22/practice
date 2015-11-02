/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRateLimitKeyCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UnitCrRateLimitKeyCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnitCrRateLimitKeyCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnitCrRateLimitKeysObjectData noOpIn;

/**
 *
 * Constructor to create a   UnitCrRateLimitKeyCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnitCrRateLimitKeyCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRateLimitKeysObjectData noOpInIn) {
    super(id, context, "UnitCrRateLimitKeyCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectHelper.toMap(noOpIn, new HashMap(), "UnitCrRateLimitKey").get("UnitCrRateLimitKey"));
    }
  }
/**
 *
 * Sets the  UnitCrRateLimitKey
 * @param noOpInIn UnitCrRateLimitKeysObjectData to set
 *
 */
  public void setUnitCrRateLimitKey(UnitCrRateLimitKeysObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnitCrRateLimitKey passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrRateLimitKeysObjectData getUnitCrRateLimitKey() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnitCrRateLimitKeysObjectHelper.fromMap(inputMap, "UnitCrRateLimitKey");
  }
}
