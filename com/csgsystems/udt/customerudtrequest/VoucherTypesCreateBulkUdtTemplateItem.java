/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherTypesCreateBulkUdtTemplateItem.java
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
 * Class used to create a VoucherTypesCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherTypesCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherTypesObjectData VouTCIn;
/**
 *
 * Constructor to create a  VoucherTypesCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherTypesCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherTypesObjectData VouTCInIn) {
    super(id, context, "VoucherTypesCreate");
    VouTCIn = VouTCInIn;
  }

  public void translateToMap() {
    if (VouTCIn != null) {
      VouTCIn.resetFlags(true, true);
      addInput("VoucherTypes", VoucherTypesObjectHelper.toMap(VouTCIn, new HashMap(), "VoucherTypes").get("VoucherTypes"));
    }
  }


/**
 *
 * Sets the VoucherTypes
 * @param VouTCInIn Value of the VouTCIn
 *
 */

  public void setVoucherTypes(VoucherTypesObjectData VouTCInIn) {
    VouTCIn = VouTCInIn;
  }

  public void translateFromMap() {
    VouTCIn = VoucherTypesObjectHelper.fromMap(inputMap, "VoucherTypes");
  }

/**
 *
 * Gets the VoucherTypes
 * @return Value of the VoucherTypes
 *
 */

  public VoucherTypesObjectData getVoucherTypes( ) {
    return VouTCIn;
  }

}
