/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusCreateBulkUdtTemplateItem.java
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
 * Class used to create a VoucherStatusCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherStatusCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherStatusObjectData VouSCIn;
/**
 *
 * Constructor to create a  VoucherStatusCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherStatusCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusObjectData VouSCInIn) {
    super(id, context, "VoucherStatusCreate");
    VouSCIn = VouSCInIn;
  }

  public void translateToMap() {
    if (VouSCIn != null) {
      VouSCIn.resetFlags(true, true);
      addInput("VoucherStatus", VoucherStatusObjectHelper.toMap(VouSCIn, new HashMap(), "VoucherStatus").get("VoucherStatus"));
    }
  }


/**
 *
 * Sets the VoucherStatus
 * @param VouSCInIn Value of the VouSCIn
 *
 */

  public void setVoucherStatus(VoucherStatusObjectData VouSCInIn) {
    VouSCIn = VouSCInIn;
  }

  public void translateFromMap() {
    VouSCIn = VoucherStatusObjectHelper.fromMap(inputMap, "VoucherStatus");
  }

/**
 *
 * Gets the VoucherStatus
 * @return Value of the VoucherStatus
 *
 */

  public VoucherStatusObjectData getVoucherStatus( ) {
    return VouSCIn;
  }

}
