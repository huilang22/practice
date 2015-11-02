/*
 * Generated code DO NOT EDIT
 * Generated file: VipCodeFindBulkUdtTemplateItem.java
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
 * Class used to create a VipCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class VipCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VipCodeObjectFilter VCFindIn;
/**
 *
 * Constructor to create a  VipCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VipCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, VipCodeObjectFilter VCFindInIn) {
    super(id, context, "VipCodeFind");
    VCFindIn = VCFindInIn;
  }

  public void translateToMap() {
    if (VCFindIn != null) {
      Integer index =  VCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VipCode", VipCodeObjectHelper.toMap(VCFindIn, new HashMap(), "VipCode").get("VipCode"));
    }
  }


/**
 *
 * Sets the VipCode
 * @param VCFindInIn Value of the VCFindIn
 *
 */

  public void setVipCode(VipCodeObjectFilter VCFindInIn) {
    VCFindIn = VCFindInIn;
  }

  public void translateFromMap() {
    VCFindIn = VipCodeObjectHelper.fromMapFilter(inputMap, "VipCode");
  }

/**
 *
 * Gets the VipCode
 * @return Value of the VipCode
 *
 */

  public VipCodeObjectFilter getVipCode( ) {
    return VCFindIn;
  }

}
