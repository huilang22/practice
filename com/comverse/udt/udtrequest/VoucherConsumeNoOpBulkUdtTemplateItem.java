/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherConsumeNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherConsumeNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherConsumeNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherStatusInfoObjectData noOpIn;

/**
 *
 * Constructor to create a   VoucherConsumeNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherConsumeNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusInfoObjectData noOpInIn) {
    super(id, context, "VoucherConsume");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("VCOut", VoucherStatusInfoObjectHelper.toMap(noOpIn, new HashMap(), "VCOut").get("VCOut"));
    }
  }
/**
 *
 * Sets the  VCOut
 * @param noOpInIn VoucherStatusInfoObjectData to set
 *
 */
  public void setVCOut(VoucherStatusInfoObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VCOut passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherStatusInfoObjectData getVCOut() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherStatusInfoObjectHelper.fromMap(inputMap, "VCOut");
  }
}
