/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusInfoAssignNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherStatusInfoAssignNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherStatusInfoAssignNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherStatusInfoObjectData noOpIn;

/**
 *
 * Constructor to create a   VoucherStatusInfoAssignNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherStatusInfoAssignNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusInfoObjectData noOpInIn) {
    super(id, context, "VoucherStatusInfoAssign");
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
