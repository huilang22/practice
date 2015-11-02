/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusInfoActivateBulkUdtTemplateItem.java
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
 * Class used to create a VoucherStatusInfoActivateBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherStatusInfoActivateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherStatusInfoObjectData VouAcIn;
/**
 *
 * Constructor to create a  VoucherStatusInfoActivateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherStatusInfoActivateBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusInfoObjectData VouAcInIn) {
    super(id, context, "VoucherStatusInfoActivate");
    VouAcIn = VouAcInIn;
  }

  public void translateToMap() {
    if (VouAcIn != null) {
      VouAcIn.resetFlags(true, true);
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(VouAcIn, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }


/**
 *
 * Sets the VoucherStatusInfo
 * @param VouAcInIn Value of the VouAcIn
 *
 */

  public void setVoucherStatusInfo(VoucherStatusInfoObjectData VouAcInIn) {
    VouAcIn = VouAcInIn;
  }

  public void translateFromMap() {
    VouAcIn = VoucherStatusInfoObjectHelper.fromMap(inputMap, "VoucherStatusInfo");
  }

/**
 *
 * Gets the VoucherStatusInfo
 * @return Value of the VoucherStatusInfo
 *
 */

  public VoucherStatusInfoObjectData getVoucherStatusInfo( ) {
    return VouAcIn;
  }

}
