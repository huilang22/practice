/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsPinVerifyBulkUdtTemplateItem.java
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
 * Class used to create a VoucherDefinitionsPinVerifyBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherDefinitionsPinVerifyBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherDefinitionsObjectData VouVIn;
/**
 *
 * Constructor to create a  VoucherDefinitionsPinVerifyBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherDefinitionsPinVerifyBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherDefinitionsObjectData VouVInIn) {
    super(id, context, "VoucherDefinitionsPinVerify");
    VouVIn = VouVInIn;
  }

  public void translateToMap() {
    if (VouVIn != null) {
      VouVIn.resetFlags(true, true);
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(VouVIn, new HashMap(), "Ret").get("Ret"));
    }
  }


/**
 *
 * Sets the VoucherDefinitions
 * @param VouVInIn Value of the VouVIn
 *
 */

  public void setVoucherDefinitions(VoucherDefinitionsObjectData VouVInIn) {
    VouVIn = VouVInIn;
  }

  public void translateFromMap() {
    VouVIn = VoucherDefinitionsObjectHelper.fromMap(inputMap, "VoucherDefinitions");
  }

/**
 *
 * Gets the VoucherDefinitions
 * @return Value of the VoucherDefinitions
 *
 */

  public VoucherDefinitionsObjectData getVoucherDefinitions( ) {
    return VouVIn;
  }

}
