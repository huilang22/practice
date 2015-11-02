/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusFindBulkUdtTemplateItem.java
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
 * Class used to create a VoucherStatusFindBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherStatusFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherStatusObjectFilter VouSFIn;
/**
 *
 * Constructor to create a  VoucherStatusFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherStatusFindBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusObjectFilter VouSFInIn) {
    super(id, context, "VoucherStatusFind");
    VouSFIn = VouSFInIn;
  }

  public void translateToMap() {
    if (VouSFIn != null) {
      Integer index =  VouSFIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VoucherStatus", VoucherStatusObjectHelper.toMap(VouSFIn, new HashMap(), "VoucherStatus").get("VoucherStatus"));
    }
  }


/**
 *
 * Sets the VoucherStatus
 * @param VouSFInIn Value of the VouSFIn
 *
 */

  public void setVoucherStatus(VoucherStatusObjectFilter VouSFInIn) {
    VouSFIn = VouSFInIn;
  }

  public void translateFromMap() {
    VouSFIn = VoucherStatusObjectHelper.fromMapFilter(inputMap, "VoucherStatus");
  }

/**
 *
 * Gets the VoucherStatus
 * @return Value of the VoucherStatus
 *
 */

  public VoucherStatusObjectFilter getVoucherStatus( ) {
    return VouSFIn;
  }

}
