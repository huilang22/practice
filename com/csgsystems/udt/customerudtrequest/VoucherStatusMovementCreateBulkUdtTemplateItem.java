/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusMovementCreateBulkUdtTemplateItem.java
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
 * Class used to create a VoucherStatusMovementCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherStatusMovementCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherStatusMovementObjectData VouSMCIn;
/**
 *
 * Constructor to create a  VoucherStatusMovementCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherStatusMovementCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusMovementObjectData VouSMCInIn) {
    super(id, context, "VoucherStatusMovementCreate");
    VouSMCIn = VouSMCInIn;
  }

  public void translateToMap() {
    if (VouSMCIn != null) {
      VouSMCIn.resetFlags(true, true);
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectHelper.toMap(VouSMCIn, new HashMap(), "VoucherStatusMovement").get("VoucherStatusMovement"));
    }
  }


/**
 *
 * Sets the VoucherStatusMovement
 * @param VouSMCInIn Value of the VouSMCIn
 *
 */

  public void setVoucherStatusMovement(VoucherStatusMovementObjectData VouSMCInIn) {
    VouSMCIn = VouSMCInIn;
  }

  public void translateFromMap() {
    VouSMCIn = VoucherStatusMovementObjectHelper.fromMap(inputMap, "VoucherStatusMovement");
  }

/**
 *
 * Gets the VoucherStatusMovement
 * @return Value of the VoucherStatusMovement
 *
 */

  public VoucherStatusMovementObjectData getVoucherStatusMovement( ) {
    return VouSMCIn;
  }

}
