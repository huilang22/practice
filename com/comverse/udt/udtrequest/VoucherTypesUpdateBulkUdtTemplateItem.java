/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherTypesUpdateBulkUdtTemplateItem.java
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
 * Class used to create a VoucherTypesUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherTypesUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherTypesObjectData VouTUIn;
/**
 *
 * Constructor to create a  VoucherTypesUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherTypesUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherTypesObjectData VouTUInIn) {
    super(id, context, "VoucherTypesUpdate");
    VouTUIn = VouTUInIn;
  }

  public void translateToMap() {
    if (VouTUIn != null) {
      VouTUIn.resetFlags(true, true);
      addInput("VoucherTypes", VoucherTypesObjectHelper.toMap(VouTUIn, new HashMap(), "VoucherTypes").get("VoucherTypes"));
    }
  }


/**
 *
 * Sets the VoucherTypes
 * @param VouTUInIn Value of the VouTUIn
 *
 */

  public void setVoucherTypes(VoucherTypesObjectData VouTUInIn) {
    VouTUIn = VouTUInIn;
  }

  public void translateFromMap() {
    VouTUIn = VoucherTypesObjectHelper.fromMap(inputMap, "VoucherTypes");
  }

/**
 *
 * Gets the VoucherTypes
 * @return Value of the VoucherTypes
 *
 */

  public VoucherTypesObjectData getVoucherTypes( ) {
    return VouTUIn;
  }

}
