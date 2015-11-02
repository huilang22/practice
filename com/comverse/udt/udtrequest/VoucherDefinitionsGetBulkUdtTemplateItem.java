/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsGetBulkUdtTemplateItem.java
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
 * Class used to create a VoucherDefinitionsGetBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherDefinitionsGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherDefinitionsObjectKeyData VouGIn;
/**
 *
 * Constructor to create a  VoucherDefinitionsGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherDefinitionsGetBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherDefinitionsObjectKeyData VouGInIn) {
    super(id, context, "VoucherDefinitionsGet");
    VouGIn = VouGInIn;
  }

  public void translateToMap() {
    if (VouGIn != null) {
      VouGIn.resetFlags(true, true);
      addInput("VoucherDefinitions", VoucherDefinitionsObjectKeyHelper.toMap(VouGIn, new HashMap(), "VoucherDefinitionsObjectKeyData").get("VoucherDefinitionsObjectKeyData"));
    }
  }


/**
 *
 * Sets the VoucherDefinitions
 * @param VouGInIn Value of the VouGIn
 *
 */

  public void setVoucherDefinitions(VoucherDefinitionsObjectKeyData VouGInIn) {
    VouGIn = VouGInIn;
  }

  public void translateFromMap() {
    VouGIn = VoucherDefinitionsObjectKeyHelper.fromMap(inputMap, "VoucherDefinitions");
  }

/**
 *
 * Gets the VoucherDefinitions
 * @return Value of the VoucherDefinitions
 *
 */

  public VoucherDefinitionsObjectKeyData getVoucherDefinitions( ) {
    return VouGIn;
  }

}
