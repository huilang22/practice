/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherDefinitionsPinGetBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a VoucherDefinitionsPinGetBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherDefinitionsPinGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherDefinitionsObjectKeyData VouVGIn;
/**
 *
 * Constructor to create a  VoucherDefinitionsPinGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherDefinitionsPinGetBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherDefinitionsObjectKeyData VouVGInIn) {
    super(id, context, "VoucherDefinitionsPinGet");
    VouVGIn = VouVGInIn;
  }

  public void translateToMap() {
    if (VouVGIn != null) {
      VouVGIn.resetFlags(true, true);
      addInput("VoucherDefinitions", VoucherDefinitionsObjectKeyHelper.toMap(VouVGIn, new HashMap(), "VoucherDefinitionsObjectKeyData").get("VoucherDefinitionsObjectKeyData"));
    }
  }


/**
 *
 * Sets the VoucherDefinitions
 * @param VouVGInIn Value of the VouVGIn
 *
 */

  public void setVoucherDefinitions(VoucherDefinitionsObjectKeyData VouVGInIn) {
    VouVGIn = VouVGInIn;
  }

  public void translateFromMap() {
    VouVGIn = VoucherDefinitionsObjectKeyHelper.fromMap(inputMap, "VoucherDefinitions");
  }

/**
 *
 * Gets the VoucherDefinitions
 * @return Value of the VoucherDefinitions
 *
 */

  public VoucherDefinitionsObjectKeyData getVoucherDefinitions( ) {
    return VouVGIn;
  }

}
