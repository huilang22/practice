/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherTypesGetBulkUdtTemplateItem.java
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
 * Class used to create a VoucherTypesGetBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherTypesGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherTypesObjectKeyData VouTGIn;
/**
 *
 * Constructor to create a  VoucherTypesGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherTypesGetBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherTypesObjectKeyData VouTGInIn) {
    super(id, context, "VoucherTypesGet");
    VouTGIn = VouTGInIn;
  }

  public void translateToMap() {
    if (VouTGIn != null) {
      VouTGIn.resetFlags(true, true);
      addInput("VoucherTypes", VoucherTypesObjectKeyHelper.toMap(VouTGIn, new HashMap(), "VoucherTypesObjectKeyData").get("VoucherTypesObjectKeyData"));
    }
  }


/**
 *
 * Sets the VoucherTypes
 * @param VouTGInIn Value of the VouTGIn
 *
 */

  public void setVoucherTypes(VoucherTypesObjectKeyData VouTGInIn) {
    VouTGIn = VouTGInIn;
  }

  public void translateFromMap() {
    VouTGIn = VoucherTypesObjectKeyHelper.fromMap(inputMap, "VoucherTypes");
  }

/**
 *
 * Gets the VoucherTypes
 * @return Value of the VoucherTypes
 *
 */

  public VoucherTypesObjectKeyData getVoucherTypes( ) {
    return VouTGIn;
  }

}
