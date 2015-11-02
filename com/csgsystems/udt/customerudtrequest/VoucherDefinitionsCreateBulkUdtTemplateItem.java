/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherDefinitionsCreateBulkUdtTemplateItem.java
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
 * Class used to create a VoucherDefinitionsCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherDefinitionsCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherDefinitionsObjectData VouCIn;
/**
 *
 * Constructor to create a  VoucherDefinitionsCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherDefinitionsCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherDefinitionsObjectData VouCInIn) {
    super(id, context, "VoucherDefinitionsCreate");
    VouCIn = VouCInIn;
  }

  public void translateToMap() {
    if (VouCIn != null) {
      VouCIn.resetFlags(true, true);
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(VouCIn, new HashMap(), "VoucherDefinitions").get("VoucherDefinitions"));
    }
  }


/**
 *
 * Sets the VoucherDefinitions
 * @param VouCInIn Value of the VouCIn
 *
 */

  public void setVoucherDefinitions(VoucherDefinitionsObjectData VouCInIn) {
    VouCIn = VouCInIn;
  }

  public void translateFromMap() {
    VouCIn = VoucherDefinitionsObjectHelper.fromMap(inputMap, "VoucherDefinitions");
  }

/**
 *
 * Gets the VoucherDefinitions
 * @return Value of the VoucherDefinitions
 *
 */

  public VoucherDefinitionsObjectData getVoucherDefinitions( ) {
    return VouCIn;
  }

}
