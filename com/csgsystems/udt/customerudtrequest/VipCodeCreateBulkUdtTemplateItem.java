/*
 * Generated code DO NOT EDIT
 * Generated file: VipCodeCreateBulkUdtTemplateItem.java
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
 * Class used to create a VipCodeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class VipCodeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VipCodeObjectData VCCreateIn;
/**
 *
 * Constructor to create a  VipCodeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VipCodeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, VipCodeObjectData VCCreateInIn) {
    super(id, context, "VipCodeCreate");
    VCCreateIn = VCCreateInIn;
  }

  public void translateToMap() {
    if (VCCreateIn != null) {
      VCCreateIn.resetFlags(true, true);
      addInput("VipCode", VipCodeObjectHelper.toMap(VCCreateIn, new HashMap(), "VipCode").get("VipCode"));
    }
  }


/**
 *
 * Sets the VipCode
 * @param VCCreateInIn Value of the VCCreateIn
 *
 */

  public void setVipCode(VipCodeObjectData VCCreateInIn) {
    VCCreateIn = VCCreateInIn;
  }

  public void translateFromMap() {
    VCCreateIn = VipCodeObjectHelper.fromMap(inputMap, "VipCode");
  }

/**
 *
 * Gets the VipCode
 * @return Value of the VipCode
 *
 */

  public VipCodeObjectData getVipCode( ) {
    return VCCreateIn;
  }

}
