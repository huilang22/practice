/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherTypesCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherTypesCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherTypesCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherTypesObjectData noOpIn;

/**
 *
 * Constructor to create a   VoucherTypesCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherTypesCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherTypesObjectData noOpInIn) {
    super(id, context, "VoucherTypesCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("VoucherTypes", VoucherTypesObjectHelper.toMap(noOpIn, new HashMap(), "VoucherTypes").get("VoucherTypes"));
    }
  }
/**
 *
 * Sets the  VoucherTypes
 * @param noOpInIn VoucherTypesObjectData to set
 *
 */
  public void setVoucherTypes(VoucherTypesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VoucherTypes passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherTypesObjectData getVoucherTypes() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherTypesObjectHelper.fromMap(inputMap, "VoucherTypes");
  }
}
