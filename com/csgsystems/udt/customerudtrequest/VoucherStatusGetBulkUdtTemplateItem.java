/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusGetBulkUdtTemplateItem.java
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
 * Class used to create a VoucherStatusGetBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherStatusGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherStatusObjectKeyData VouSGIn;
/**
 *
 * Constructor to create a  VoucherStatusGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherStatusGetBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusObjectKeyData VouSGInIn) {
    super(id, context, "VoucherStatusGet");
    VouSGIn = VouSGInIn;
  }

  public void translateToMap() {
    if (VouSGIn != null) {
      VouSGIn.resetFlags(true, true);
      addInput("VoucherStatus", VoucherStatusObjectKeyHelper.toMap(VouSGIn, new HashMap(), "VoucherStatusObjectKeyData").get("VoucherStatusObjectKeyData"));
    }
  }


/**
 *
 * Sets the VoucherStatus
 * @param VouSGInIn Value of the VouSGIn
 *
 */

  public void setVoucherStatus(VoucherStatusObjectKeyData VouSGInIn) {
    VouSGIn = VouSGInIn;
  }

  public void translateFromMap() {
    VouSGIn = VoucherStatusObjectKeyHelper.fromMap(inputMap, "VoucherStatus");
  }

/**
 *
 * Gets the VoucherStatus
 * @return Value of the VoucherStatus
 *
 */

  public VoucherStatusObjectKeyData getVoucherStatus( ) {
    return VouSGIn;
  }

}
