/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusMovementGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherStatusMovementGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherStatusMovementGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherStatusMovementObjectData noOpIn;

/**
 *
 * Constructor to create a   VoucherStatusMovementGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherStatusMovementGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusMovementObjectData noOpInIn) {
    super(id, context, "VoucherStatusMovementGet");
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
