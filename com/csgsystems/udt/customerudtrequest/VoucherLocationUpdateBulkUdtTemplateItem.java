/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherLocationUpdateBulkUdtTemplateItem.java
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
 * Class used to create a VoucherLocationUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherLocationUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherLocationObjectData VouLUIn;
/**
 *
 * Constructor to create a  VoucherLocationUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherLocationUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherLocationObjectData VouLUInIn) {
    super(id, context, "VoucherLocationUpdate");
    VouLUIn = VouLUInIn;
  }

  public void translateToMap() {
    if (VouLUIn != null) {
      VouLUIn.resetFlags(true, true);
      addInput("VoucherLocation", VoucherLocationObjectHelper.toMap(VouLUIn, new HashMap(), "VoucherLocation").get("VoucherLocation"));
    }
  }


/**
 *
 * Sets the VoucherLocation
 * @param VouLUInIn Value of the VouLUIn
 *
 */

  public void setVoucherLocation(VoucherLocationObjectData VouLUInIn) {
    VouLUIn = VouLUInIn;
  }

  public void translateFromMap() {
    VouLUIn = VoucherLocationObjectHelper.fromMap(inputMap, "VoucherLocation");
  }

/**
 *
 * Gets the VoucherLocation
 * @return Value of the VoucherLocation
 *
 */

  public VoucherLocationObjectData getVoucherLocation( ) {
    return VouLUIn;
  }

}
