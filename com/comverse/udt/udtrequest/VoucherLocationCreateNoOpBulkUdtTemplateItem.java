/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherLocationCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherLocationCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherLocationCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherLocationObjectData noOpIn;

/**
 *
 * Constructor to create a   VoucherLocationCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherLocationCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherLocationObjectData noOpInIn) {
    super(id, context, "VoucherLocationCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("VoucherLocation", VoucherLocationObjectHelper.toMap(noOpIn, new HashMap(), "VoucherLocation").get("VoucherLocation"));
    }
  }
/**
 *
 * Sets the  VoucherLocation
 * @param noOpInIn VoucherLocationObjectData to set
 *
 */
  public void setVoucherLocation(VoucherLocationObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VoucherLocation passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherLocationObjectData getVoucherLocation() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherLocationObjectHelper.fromMap(inputMap, "VoucherLocation");
  }
}
