/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherStatusCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherStatusCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherStatusObjectData noOpIn;

/**
 *
 * Constructor to create a   VoucherStatusCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherStatusCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusObjectData noOpInIn) {
    super(id, context, "VoucherStatusCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("VoucherStatus", VoucherStatusObjectHelper.toMap(noOpIn, new HashMap(), "VoucherStatus").get("VoucherStatus"));
    }
  }
/**
 *
 * Sets the  VoucherStatus
 * @param noOpInIn VoucherStatusObjectData to set
 *
 */
  public void setVoucherStatus(VoucherStatusObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VoucherStatus passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherStatusObjectData getVoucherStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherStatusObjectHelper.fromMap(inputMap, "VoucherStatus");
  }
}
