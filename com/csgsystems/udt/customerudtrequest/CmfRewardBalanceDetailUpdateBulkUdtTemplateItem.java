/*
 * Generated code DO NOT EDIT
 * Generated file: CmfRewardBalanceDetailUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CmfRewardBalanceDetailUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfRewardBalanceDetailUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfRewardBalanceDetailObjectData CRBDUpdateIn;
/**
 *
 * Constructor to create a  CmfRewardBalanceDetailUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfRewardBalanceDetailUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfRewardBalanceDetailObjectData CRBDUpdateInIn) {
    super(id, context, "CmfRewardBalanceDetailUpdate");
    CRBDUpdateIn = CRBDUpdateInIn;
  }

  public void translateToMap() {
    if (CRBDUpdateIn != null) {
      CRBDUpdateIn.resetFlags(true, true);
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectHelper.toMap(CRBDUpdateIn, new HashMap(), "CmfRewardBalanceDetail").get("CmfRewardBalanceDetail"));
    }
  }


/**
 *
 * Sets the CmfRewardBalanceDetail
 * @param CRBDUpdateInIn Value of the CRBDUpdateIn
 *
 */

  public void setCmfRewardBalanceDetail(CmfRewardBalanceDetailObjectData CRBDUpdateInIn) {
    CRBDUpdateIn = CRBDUpdateInIn;
  }

  public void translateFromMap() {
    CRBDUpdateIn = CmfRewardBalanceDetailObjectHelper.fromMap(inputMap, "CmfRewardBalanceDetail");
  }

/**
 *
 * Gets the CmfRewardBalanceDetail
 * @return Value of the CmfRewardBalanceDetail
 *
 */

  public CmfRewardBalanceDetailObjectData getCmfRewardBalanceDetail( ) {
    return CRBDUpdateIn;
  }

}
