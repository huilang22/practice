/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsLocationUpdateBulkUdtTemplateItem.java
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
 * Class used to create a VoucherDefinitionsLocationUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherDefinitionsLocationUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherDefinitionsObjectData VouULIn;
/**
 *
 * Constructor to create a  VoucherDefinitionsLocationUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherDefinitionsLocationUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherDefinitionsObjectData VouULInIn) {
    super(id, context, "VoucherDefinitionsLocationUpdate");
    VouULIn = VouULInIn;
  }

  public void translateToMap() {
    if (VouULIn != null) {
      VouULIn.resetFlags(true, true);
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(VouULIn, new HashMap(), "VoucherDefinitions").get("VoucherDefinitions"));
    }
  }


/**
 *
 * Sets the VoucherDefinitions
 * @param VouULInIn Value of the VouULIn
 *
 */

  public void setVoucherDefinitions(VoucherDefinitionsObjectData VouULInIn) {
    VouULIn = VouULInIn;
  }

  public void translateFromMap() {
    VouULIn = VoucherDefinitionsObjectHelper.fromMap(inputMap, "VoucherDefinitions");
  }

/**
 *
 * Gets the VoucherDefinitions
 * @return Value of the VoucherDefinitions
 *
 */

  public VoucherDefinitionsObjectData getVoucherDefinitions( ) {
    return VouULIn;
  }

}
