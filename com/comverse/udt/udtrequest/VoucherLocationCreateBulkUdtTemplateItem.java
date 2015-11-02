/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherLocationCreateBulkUdtTemplateItem.java
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
 * Class used to create a VoucherLocationCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherLocationCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherLocationObjectData VouLCIn;
/**
 *
 * Constructor to create a  VoucherLocationCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherLocationCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherLocationObjectData VouLCInIn) {
    super(id, context, "VoucherLocationCreate");
    VouLCIn = VouLCInIn;
  }

  public void translateToMap() {
    if (VouLCIn != null) {
      VouLCIn.resetFlags(true, true);
      addInput("VoucherLocation", VoucherLocationObjectHelper.toMap(VouLCIn, new HashMap(), "VoucherLocation").get("VoucherLocation"));
    }
  }


/**
 *
 * Sets the VoucherLocation
 * @param VouLCInIn Value of the VouLCIn
 *
 */

  public void setVoucherLocation(VoucherLocationObjectData VouLCInIn) {
    VouLCIn = VouLCInIn;
  }

  public void translateFromMap() {
    VouLCIn = VoucherLocationObjectHelper.fromMap(inputMap, "VoucherLocation");
  }

/**
 *
 * Gets the VoucherLocation
 * @return Value of the VoucherLocation
 *
 */

  public VoucherLocationObjectData getVoucherLocation( ) {
    return VouLCIn;
  }

}
