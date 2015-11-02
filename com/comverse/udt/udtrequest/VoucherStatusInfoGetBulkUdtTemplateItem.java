/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusInfoGetBulkUdtTemplateItem.java
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
 * Class used to create a VoucherStatusInfoGetBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherStatusInfoGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherStatusInfoObjectKeyData VouGIn;
/**
 *
 * Constructor to create a  VoucherStatusInfoGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherStatusInfoGetBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusInfoObjectKeyData VouGInIn) {
    super(id, context, "VoucherStatusInfoGet");
    VouGIn = VouGInIn;
  }

  public void translateToMap() {
    if (VouGIn != null) {
      VouGIn.resetFlags(true, true);
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectKeyHelper.toMap(VouGIn, new HashMap(), "VoucherStatusInfoObjectKeyData").get("VoucherStatusInfoObjectKeyData"));
    }
  }


/**
 *
 * Sets the VoucherStatusInfo
 * @param VouGInIn Value of the VouGIn
 *
 */

  public void setVoucherStatusInfo(VoucherStatusInfoObjectKeyData VouGInIn) {
    VouGIn = VouGInIn;
  }

  public void translateFromMap() {
    VouGIn = VoucherStatusInfoObjectKeyHelper.fromMap(inputMap, "VoucherStatusInfo");
  }

/**
 *
 * Gets the VoucherStatusInfo
 * @return Value of the VoucherStatusInfo
 *
 */

  public VoucherStatusInfoObjectKeyData getVoucherStatusInfo( ) {
    return VouGIn;
  }

}
