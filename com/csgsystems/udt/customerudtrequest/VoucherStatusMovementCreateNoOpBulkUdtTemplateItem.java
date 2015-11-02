/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusMovementCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherStatusMovementCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherStatusMovementCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherStatusMovementObjectData noOpIn;

/**
 *
 * Constructor to create a   VoucherStatusMovementCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherStatusMovementCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusMovementObjectData noOpInIn) {
    super(id, context, "VoucherStatusMovementCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectHelper.toMap(noOpIn, new HashMap(), "VoucherStatusMovement").get("VoucherStatusMovement"));
    }
  }
/**
 *
 * Sets the  VoucherStatusMovement
 * @param noOpInIn VoucherStatusMovementObjectData to set
 *
 */
  public void setVoucherStatusMovement(VoucherStatusMovementObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VoucherStatusMovement passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherStatusMovementObjectData getVoucherStatusMovement() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherStatusMovementObjectHelper.fromMap(inputMap, "VoucherStatusMovement");
  }
}
