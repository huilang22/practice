/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherDefinitionsCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherDefinitionsCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherDefinitionsCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherDefinitionsObjectData noOpIn;

/**
 *
 * Constructor to create a   VoucherDefinitionsCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherDefinitionsCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherDefinitionsObjectData noOpInIn) {
    super(id, context, "VoucherDefinitionsCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(noOpIn, new HashMap(), "VoucherDefinitions").get("VoucherDefinitions"));
    }
  }
/**
 *
 * Sets the  VoucherDefinitions
 * @param noOpInIn VoucherDefinitionsObjectData to set
 *
 */
  public void setVoucherDefinitions(VoucherDefinitionsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VoucherDefinitions passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherDefinitionsObjectData getVoucherDefinitions() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherDefinitionsObjectHelper.fromMap(inputMap, "VoucherDefinitions");
  }
}
