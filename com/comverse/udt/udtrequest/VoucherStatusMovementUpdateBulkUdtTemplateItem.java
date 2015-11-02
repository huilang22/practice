/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusMovementUpdateBulkUdtTemplateItem.java
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
 * Class used to create a VoucherStatusMovementUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherStatusMovementUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherStatusMovementObjectData VouSMUIn;
/**
 *
 * Constructor to create a  VoucherStatusMovementUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherStatusMovementUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusMovementObjectData VouSMUInIn) {
    super(id, context, "VoucherStatusMovementUpdate");
    VouSMUIn = VouSMUInIn;
  }

  public void translateToMap() {
    if (VouSMUIn != null) {
      VouSMUIn.resetFlags(true, true);
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectHelper.toMap(VouSMUIn, new HashMap(), "VoucherStatusMovement").get("VoucherStatusMovement"));
    }
  }


/**
 *
 * Sets the VoucherStatusMovement
 * @param VouSMUInIn Value of the VouSMUIn
 *
 */

  public void setVoucherStatusMovement(VoucherStatusMovementObjectData VouSMUInIn) {
    VouSMUIn = VouSMUInIn;
  }

  public void translateFromMap() {
    VouSMUIn = VoucherStatusMovementObjectHelper.fromMap(inputMap, "VoucherStatusMovement");
  }

/**
 *
 * Gets the VoucherStatusMovement
 * @return Value of the VoucherStatusMovement
 *
 */

  public VoucherStatusMovementObjectData getVoucherStatusMovement( ) {
    return VouSMUIn;
  }

}
