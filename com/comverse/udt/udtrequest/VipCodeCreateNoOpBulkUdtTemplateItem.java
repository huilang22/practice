/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VipCodeCreateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a VipCodeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VipCodeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VipCodeObjectData noOpIn;

/**
 *
 * Constructor to create a   VipCodeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VipCodeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VipCodeObjectData noOpInIn) {
    super(id, context, "VipCodeCreate");
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
