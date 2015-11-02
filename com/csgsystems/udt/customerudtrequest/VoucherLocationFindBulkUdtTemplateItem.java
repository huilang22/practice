/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherLocationFindBulkUdtTemplateItem.java
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
 * Class used to create a VoucherLocationFindBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherLocationFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherLocationObjectFilter VouLFIn;
/**
 *
 * Constructor to create a  VoucherLocationFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherLocationFindBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherLocationObjectFilter VouLFInIn) {
    super(id, context, "VoucherLocationFind");
    VouLFIn = VouLFInIn;
  }

  public void translateToMap() {
    if (VouLFIn != null) {
      Integer index =  VouLFIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VoucherLocation", VoucherLocationObjectHelper.toMap(VouLFIn, new HashMap(), "VoucherLocation").get("VoucherLocation"));
    }
  }


/**
 *
 * Sets the VoucherLocation
 * @param VouLFInIn Value of the VouLFIn
 *
 */

  public void setVoucherLocation(VoucherLocationObjectFilter VouLFInIn) {
    VouLFIn = VouLFInIn;
  }

  public void translateFromMap() {
    VouLFIn = VoucherLocationObjectHelper.fromMapFilter(inputMap, "VoucherLocation");
  }

/**
 *
 * Gets the VoucherLocation
 * @return Value of the VoucherLocation
 *
 */

  public VoucherLocationObjectFilter getVoucherLocation( ) {
    return VouLFIn;
  }

}
