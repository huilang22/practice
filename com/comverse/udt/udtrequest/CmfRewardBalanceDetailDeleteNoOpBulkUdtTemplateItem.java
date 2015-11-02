/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfRewardBalanceDetailDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CmfRewardBalanceDetailDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CmfRewardBalanceDetailDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CmfRewardBalanceDetailObjectData noOpIn;

/**
 *
 * Constructor to create a   CmfRewardBalanceDetailDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CmfRewardBalanceDetailDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfRewardBalanceDetailObjectData noOpInIn) {
    super(id, context, "CmfRewardBalanceDetailDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectHelper.toMap(noOpIn, new HashMap(), "CmfRewardBalanceDetail").get("CmfRewardBalanceDetail"));
    }
  }
/**
 *
 * Sets the  CmfRewardBalanceDetail
 * @param noOpInIn CmfRewardBalanceDetailObjectData to set
 *
 */
  public void setCmfRewardBalanceDetail(CmfRewardBalanceDetailObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CmfRewardBalanceDetail passed into the constructor
 * @return Simulated response
 *
 */
  public CmfRewardBalanceDetailObjectData getCmfRewardBalanceDetail() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CmfRewardBalanceDetailObjectHelper.fromMap(inputMap, "CmfRewardBalanceDetail");
  }
}
