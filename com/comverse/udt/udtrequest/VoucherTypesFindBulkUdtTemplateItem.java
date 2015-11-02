/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherTypesFindBulkUdtTemplateItem.java
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
 * Class used to create a VoucherTypesFindBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherTypesFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherTypesObjectFilter VouTFIn;
/**
 *
 * Constructor to create a  VoucherTypesFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherTypesFindBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherTypesObjectFilter VouTFInIn) {
    super(id, context, "VoucherTypesFind");
    VouTFIn = VouTFInIn;
  }

  public void translateToMap() {
    if (VouTFIn != null) {
      Integer index =  VouTFIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VoucherTypes", VoucherTypesObjectHelper.toMap(VouTFIn, new HashMap(), "VoucherTypes").get("VoucherTypes"));
    }
  }


/**
 *
 * Sets the VoucherTypes
 * @param VouTFInIn Value of the VouTFIn
 *
 */

  public void setVoucherTypes(VoucherTypesObjectFilter VouTFInIn) {
    VouTFIn = VouTFInIn;
  }

  public void translateFromMap() {
    VouTFIn = VoucherTypesObjectHelper.fromMapFilter(inputMap, "VoucherTypes");
  }

/**
 *
 * Gets the VoucherTypes
 * @return Value of the VoucherTypes
 *
 */

  public VoucherTypesObjectFilter getVoucherTypes( ) {
    return VouTFIn;
  }

}
