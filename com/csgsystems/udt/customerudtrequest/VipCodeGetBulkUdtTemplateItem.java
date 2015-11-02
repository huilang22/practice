/*
 * Generated code DO NOT EDIT
 * Generated file: VipCodeGetBulkUdtTemplateItem.java
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
 * Class used to create a VipCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class VipCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VipCodeObjectKeyData VCGetIn;
/**
 *
 * Constructor to create a  VipCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VipCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, VipCodeObjectKeyData VCGetInIn) {
    super(id, context, "VipCodeGet");
    VCGetIn = VCGetInIn;
  }

  public void translateToMap() {
    if (VCGetIn != null) {
      VCGetIn.resetFlags(true, true);
      addInput("VipCode", VipCodeObjectKeyHelper.toMap(VCGetIn, new HashMap(), "VipCodeObjectKeyData").get("VipCodeObjectKeyData"));
    }
  }


/**
 *
 * Sets the VipCode
 * @param VCGetInIn Value of the VCGetIn
 *
 */

  public void setVipCode(VipCodeObjectKeyData VCGetInIn) {
    VCGetIn = VCGetInIn;
  }

  public void translateFromMap() {
    VCGetIn = VipCodeObjectKeyHelper.fromMap(inputMap, "VipCode");
  }

/**
 *
 * Gets the VipCode
 * @return Value of the VipCode
 *
 */

  public VipCodeObjectKeyData getVipCode( ) {
    return VCGetIn;
  }

}
