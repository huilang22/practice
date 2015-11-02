/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusUpdateBulkUdtTemplateItem.java
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
 * Class used to create a VoucherStatusUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherStatusUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherStatusObjectData VouSUIn;
/**
 *
 * Constructor to create a  VoucherStatusUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherStatusUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusObjectData VouSUInIn) {
    super(id, context, "VoucherStatusUpdate");
    VouSUIn = VouSUInIn;
  }

  public void translateToMap() {
    if (VouSUIn != null) {
      VouSUIn.resetFlags(true, true);
      addInput("VoucherStatus", VoucherStatusObjectHelper.toMap(VouSUIn, new HashMap(), "VoucherStatus").get("VoucherStatus"));
    }
  }


/**
 *
 * Sets the VoucherStatus
 * @param VouSUInIn Value of the VouSUIn
 *
 */

  public void setVoucherStatus(VoucherStatusObjectData VouSUInIn) {
    VouSUIn = VouSUInIn;
  }

  public void translateFromMap() {
    VouSUIn = VoucherStatusObjectHelper.fromMap(inputMap, "VoucherStatus");
  }

/**
 *
 * Gets the VoucherStatus
 * @return Value of the VoucherStatus
 *
 */

  public VoucherStatusObjectData getVoucherStatus( ) {
    return VouSUIn;
  }

}
