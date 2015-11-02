/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusMovementGetBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a VoucherStatusMovementGetBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherStatusMovementGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherStatusMovementObjectKeyData VouSMGIn;
/**
 *
 * Constructor to create a  VoucherStatusMovementGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherStatusMovementGetBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusMovementObjectKeyData VouSMGInIn) {
    super(id, context, "VoucherStatusMovementGet");
    VouSMGIn = VouSMGInIn;
  }

  public void translateToMap() {
    if (VouSMGIn != null) {
      VouSMGIn.resetFlags(true, true);
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectKeyHelper.toMap(VouSMGIn, new HashMap(), "VoucherStatusMovementObjectKeyData").get("VoucherStatusMovementObjectKeyData"));
    }
  }


/**
 *
 * Sets the VoucherStatusMovement
 * @param VouSMGInIn Value of the VouSMGIn
 *
 */

  public void setVoucherStatusMovement(VoucherStatusMovementObjectKeyData VouSMGInIn) {
    VouSMGIn = VouSMGInIn;
  }

  public void translateFromMap() {
    VouSMGIn = VoucherStatusMovementObjectKeyHelper.fromMap(inputMap, "VoucherStatusMovement");
  }

/**
 *
 * Gets the VoucherStatusMovement
 * @return Value of the VoucherStatusMovement
 *
 */

  public VoucherStatusMovementObjectKeyData getVoucherStatusMovement( ) {
    return VouSMGIn;
  }

}
