/*
 * Generated code DO NOT EDIT
 * Generated file: CmfRewardBalanceDetailGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CmfRewardBalanceDetailGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CmfRewardBalanceDetailGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CmfRewardBalanceDetailObjectData noOpIn;

/**
 *
 * Constructor to create a   CmfRewardBalanceDetailGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CmfRewardBalanceDetailGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfRewardBalanceDetailObjectData noOpInIn) {
    super(id, context, "CmfRewardBalanceDetailGet");
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
