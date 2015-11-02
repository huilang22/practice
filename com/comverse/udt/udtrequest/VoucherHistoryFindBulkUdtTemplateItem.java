/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherHistoryFindBulkUdtTemplateItem.java
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
 * Class used to create a VoucherHistoryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherHistoryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherHistoryObjectFilter VouFIn;
/**
 *
 * Constructor to create a  VoucherHistoryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherHistoryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherHistoryObjectFilter VouFInIn) {
    super(id, context, "VoucherHistoryFind");
    VouFIn = VouFInIn;
  }

  public void translateToMap() {
    if (VouFIn != null) {
      Integer index =  VouFIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VoucherHistory", VoucherHistoryObjectHelper.toMap(VouFIn, new HashMap(), "VoucherHistory").get("VoucherHistory"));
    }
  }


/**
 *
 * Sets the VoucherHistory
 * @param VouFInIn Value of the VouFIn
 *
 */

  public void setVoucherHistory(VoucherHistoryObjectFilter VouFInIn) {
    VouFIn = VouFInIn;
  }

  public void translateFromMap() {
    VouFIn = VoucherHistoryObjectHelper.fromMapFilter(inputMap, "VoucherHistory");
  }

/**
 *
 * Gets the VoucherHistory
 * @return Value of the VoucherHistory
 *
 */

  public VoucherHistoryObjectFilter getVoucherHistory( ) {
    return VouFIn;
  }

}
