/*
 * Generated code DO NOT EDIT
 * Generated file: VipCodeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a VipCodeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class VipCodeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VipCodeObjectData VCUpdateIn;
/**
 *
 * Constructor to create a  VipCodeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VipCodeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, VipCodeObjectData VCUpdateInIn) {
    super(id, context, "VipCodeUpdate");
    VCUpdateIn = VCUpdateInIn;
  }

  public void translateToMap() {
    if (VCUpdateIn != null) {
      VCUpdateIn.resetFlags(true, true);
      addInput("VipCode", VipCodeObjectHelper.toMap(VCUpdateIn, new HashMap(), "VipCode").get("VipCode"));
    }
  }


/**
 *
 * Sets the VipCode
 * @param VCUpdateInIn Value of the VCUpdateIn
 *
 */

  public void setVipCode(VipCodeObjectData VCUpdateInIn) {
    VCUpdateIn = VCUpdateInIn;
  }

  public void translateFromMap() {
    VCUpdateIn = VipCodeObjectHelper.fromMap(inputMap, "VipCode");
  }

/**
 *
 * Gets the VipCode
 * @return Value of the VipCode
 *
 */

  public VipCodeObjectData getVipCode( ) {
    return VCUpdateIn;
  }

}
