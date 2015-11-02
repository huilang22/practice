/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherLocationGetBulkUdtTemplateItem.java
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
 * Class used to create a VoucherLocationGetBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherLocationGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherLocationObjectKeyData VouLGIn;
/**
 *
 * Constructor to create a  VoucherLocationGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherLocationGetBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherLocationObjectKeyData VouLGInIn) {
    super(id, context, "VoucherLocationGet");
    VouLGIn = VouLGInIn;
  }

  public void translateToMap() {
    if (VouLGIn != null) {
      VouLGIn.resetFlags(true, true);
      addInput("VoucherLocation", VoucherLocationObjectKeyHelper.toMap(VouLGIn, new HashMap(), "VoucherLocationObjectKeyData").get("VoucherLocationObjectKeyData"));
    }
  }


/**
 *
 * Sets the VoucherLocation
 * @param VouLGInIn Value of the VouLGIn
 *
 */

  public void setVoucherLocation(VoucherLocationObjectKeyData VouLGInIn) {
    VouLGIn = VouLGInIn;
  }

  public void translateFromMap() {
    VouLGIn = VoucherLocationObjectKeyHelper.fromMap(inputMap, "VoucherLocation");
  }

/**
 *
 * Gets the VoucherLocation
 * @return Value of the VoucherLocation
 *
 */

  public VoucherLocationObjectKeyData getVoucherLocation( ) {
    return VouLGIn;
  }

}
