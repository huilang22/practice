/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusMovementFindBulkUdtTemplateItem.java
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
 * Class used to create a VoucherStatusMovementFindBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherStatusMovementFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherStatusMovementObjectFilter VouSMFIn;
/**
 *
 * Constructor to create a  VoucherStatusMovementFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherStatusMovementFindBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusMovementObjectFilter VouSMFInIn) {
    super(id, context, "VoucherStatusMovementFind");
    VouSMFIn = VouSMFInIn;
  }

  public void translateToMap() {
    if (VouSMFIn != null) {
      Integer index =  VouSMFIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectHelper.toMap(VouSMFIn, new HashMap(), "VoucherStatusMovement").get("VoucherStatusMovement"));
    }
  }


/**
 *
 * Sets the VoucherStatusMovement
 * @param VouSMFInIn Value of the VouSMFIn
 *
 */

  public void setVoucherStatusMovement(VoucherStatusMovementObjectFilter VouSMFInIn) {
    VouSMFIn = VouSMFInIn;
  }

  public void translateFromMap() {
    VouSMFIn = VoucherStatusMovementObjectHelper.fromMapFilter(inputMap, "VoucherStatusMovement");
  }

/**
 *
 * Gets the VoucherStatusMovement
 * @return Value of the VoucherStatusMovement
 *
 */

  public VoucherStatusMovementObjectFilter getVoucherStatusMovement( ) {
    return VouSMFIn;
  }

}
