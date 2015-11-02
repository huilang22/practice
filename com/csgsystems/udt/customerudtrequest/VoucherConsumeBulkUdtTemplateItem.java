/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherConsumeBulkUdtTemplateItem.java
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
 * Class used to create a VoucherConsumeBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherConsumeBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherDefinitionsObjectData VC_In;
/**
 *
 * Constructor to create a  VoucherConsumeBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherConsumeBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherDefinitionsObjectData VC_InIn) {
    super(id, context, "VoucherConsume");
    VC_In = VC_InIn;
  }

  public void translateToMap() {
    if (VC_In != null) {
      VC_In.resetFlags(true, true);
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(VC_In, new HashMap(), "VCOut").get("VCOut"));
    }
  }


/**
 *
 * Sets the VoucherDefinitions
 * @param VC_InIn Value of the VC_In
 *
 */

  public void setVoucherDefinitions(VoucherDefinitionsObjectData VC_InIn) {
    VC_In = VC_InIn;
  }

  public void translateFromMap() {
    VC_In = VoucherDefinitionsObjectHelper.fromMap(inputMap, "VoucherDefinitions");
  }

/**
 *
 * Gets the VoucherDefinitions
 * @return Value of the VoucherDefinitions
 *
 */

  public VoucherDefinitionsObjectData getVoucherDefinitions( ) {
    return VC_In;
  }

}
