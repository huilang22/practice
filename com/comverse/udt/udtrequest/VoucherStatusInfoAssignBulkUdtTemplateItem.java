/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusInfoAssignBulkUdtTemplateItem.java
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
 * Class used to create a VoucherStatusInfoAssignBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherStatusInfoAssignBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherStatusInfoObjectData VouAsIn;
/**
 *
 * Constructor to create a  VoucherStatusInfoAssignBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherStatusInfoAssignBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusInfoObjectData VouAsInIn) {
    super(id, context, "VoucherStatusInfoAssign");
    VouAsIn = VouAsInIn;
  }

  public void translateToMap() {
    if (VouAsIn != null) {
      VouAsIn.resetFlags(true, true);
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(VouAsIn, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }


/**
 *
 * Sets the VoucherStatusInfo
 * @param VouAsInIn Value of the VouAsIn
 *
 */

  public void setVoucherStatusInfo(VoucherStatusInfoObjectData VouAsInIn) {
    VouAsIn = VouAsInIn;
  }

  public void translateFromMap() {
    VouAsIn = VoucherStatusInfoObjectHelper.fromMap(inputMap, "VoucherStatusInfo");
  }

/**
 *
 * Gets the VoucherStatusInfo
 * @return Value of the VoucherStatusInfo
 *
 */

  public VoucherStatusInfoObjectData getVoucherStatusInfo( ) {
    return VouAsIn;
  }

}
