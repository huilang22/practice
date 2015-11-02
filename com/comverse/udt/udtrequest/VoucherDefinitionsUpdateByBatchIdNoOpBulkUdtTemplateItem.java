/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsUpdateByBatchIdNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherDefinitionsUpdateByBatchIdNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherDefinitionsUpdateByBatchIdNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Integer noOpIn;

/**
 *
 * Constructor to create a   VoucherDefinitionsUpdateByBatchIdNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherDefinitionsUpdateByBatchIdNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer noOpInIn) {
    super(id, context, "VoucherDefinitionsUpdateByBatchId");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("VDUBUpdateCountOut", noOpIn);
    }
  }
/**
 *
 * Sets the  VDUBUpdateCountOut
 * @param noOpInIn Integer to set
 *
 */
  public void setVDUBUpdateCountOut(Integer noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VDUBUpdateCountOut passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getVDUBUpdateCountOut() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Integer)inputMap.get("VDUBUpdateCountOut");
  }
}
