/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusInfoConsumedBulkUdtTemplateItem.java
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
 * Class used to create a VoucherStatusInfoConsumedBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherStatusInfoConsumedBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherStatusInfoObjectData VouCoIn;
/**
 *
 * Constructor to create a  VoucherStatusInfoConsumedBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherStatusInfoConsumedBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusInfoObjectData VouCoInIn) {
    super(id, context, "VoucherStatusInfoConsumed");
    VouCoIn = VouCoInIn;
  }

  public void translateToMap() {
    if (VouCoIn != null) {
      VouCoIn.resetFlags(true, true);
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(VouCoIn, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }


/**
 *
 * Sets the VoucherStatusInfo
 * @param VouCoInIn Value of the VouCoIn
 *
 */

  public void setVoucherStatusInfo(VoucherStatusInfoObjectData VouCoInIn) {
    VouCoIn = VouCoInIn;
  }

  public void translateFromMap() {
    VouCoIn = VoucherStatusInfoObjectHelper.fromMap(inputMap, "VoucherStatusInfo");
  }

/**
 *
 * Gets the VoucherStatusInfo
 * @return Value of the VoucherStatusInfo
 *
 */

  public VoucherStatusInfoObjectData getVoucherStatusInfo( ) {
    return VouCoIn;
  }

}
