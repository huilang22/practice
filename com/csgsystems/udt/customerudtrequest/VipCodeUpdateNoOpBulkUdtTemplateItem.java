/*
 * Generated code DO NOT EDIT
 * Generated file: VipCodeUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a VipCodeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VipCodeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VipCodeObjectData noOpIn;

/**
 *
 * Constructor to create a   VipCodeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VipCodeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VipCodeObjectData noOpInIn) {
    super(id, context, "VipCodeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("VipCode", VipCodeObjectHelper.toMap(noOpIn, new HashMap(), "VipCode").get("VipCode"));
    }
  }
/**
 *
 * Sets the  VipCode
 * @param noOpInIn VipCodeObjectData to set
 *
 */
  public void setVipCode(VipCodeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VipCode passed into the constructor
 * @return Simulated response
 *
 */
  public VipCodeObjectData getVipCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VipCodeObjectHelper.fromMap(inputMap, "VipCode");
  }
}
