/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusInfoUpdateBulkUdtTemplateItem.java
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
 * Class used to create a VoucherStatusInfoUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherStatusInfoUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherStatusInfoObjectData VouUIn;
/**
 *
 * Constructor to create a  VoucherStatusInfoUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherStatusInfoUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusInfoObjectData VouUInIn) {
    super(id, context, "VoucherStatusInfoUpdate");
    VouUIn = VouUInIn;
  }

  public void translateToMap() {
    if (VouUIn != null) {
      VouUIn.resetFlags(true, true);
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(VouUIn, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }


/**
 *
 * Sets the VoucherStatusInfo
 * @param VouUInIn Value of the VouUIn
 *
 */

  public void setVoucherStatusInfo(VoucherStatusInfoObjectData VouUInIn) {
    VouUIn = VouUInIn;
  }

  public void translateFromMap() {
    VouUIn = VoucherStatusInfoObjectHelper.fromMap(inputMap, "VoucherStatusInfo");
  }

/**
 *
 * Gets the VoucherStatusInfo
 * @return Value of the VoucherStatusInfo
 *
 */

  public VoucherStatusInfoObjectData getVoucherStatusInfo( ) {
    return VouUIn;
  }

}
