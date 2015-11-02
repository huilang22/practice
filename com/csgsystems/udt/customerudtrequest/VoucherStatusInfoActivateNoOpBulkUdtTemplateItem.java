/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusInfoActivateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherStatusInfoActivateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherStatusInfoActivateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherStatusInfoObjectData noOpIn;

/**
 *
 * Constructor to create a   VoucherStatusInfoActivateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherStatusInfoActivateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusInfoObjectData noOpInIn) {
    super(id, context, "VoucherStatusInfoActivate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(noOpIn, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }
/**
 *
 * Sets the  VoucherStatusInfo
 * @param noOpInIn VoucherStatusInfoObjectData to set
 *
 */
  public void setVoucherStatusInfo(VoucherStatusInfoObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VoucherStatusInfo passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherStatusInfoObjectData getVoucherStatusInfo() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherStatusInfoObjectHelper.fromMap(inputMap, "VoucherStatusInfo");
  }
}
