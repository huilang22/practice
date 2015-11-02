/*
 * Generated code DO NOT EDIT
 * Generated file: CmfRewardBalanceDetailDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CmfRewardBalanceDetailDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfRewardBalanceDetailDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfRewardBalanceDetailObjectKeyData CRBDDeleteIn;
/**
 *
 * Constructor to create a  CmfRewardBalanceDetailDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfRewardBalanceDetailDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfRewardBalanceDetailObjectKeyData CRBDDeleteInIn) {
    super(id, context, "CmfRewardBalanceDetailDelete");
    CRBDDeleteIn = CRBDDeleteInIn;
  }

  public void translateToMap() {
    if (CRBDDeleteIn != null) {
      CRBDDeleteIn.resetFlags(true, true);
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectKeyHelper.toMap(CRBDDeleteIn, new HashMap(), "CmfRewardBalanceDetailObjectKeyData").get("CmfRewardBalanceDetailObjectKeyData"));
    }
  }


/**
 *
 * Sets the CmfRewardBalanceDetail
 * @param CRBDDeleteInIn Value of the CRBDDeleteIn
 *
 */

  public void setCmfRewardBalanceDetail(CmfRewardBalanceDetailObjectKeyData CRBDDeleteInIn) {
    CRBDDeleteIn = CRBDDeleteInIn;
  }

  public void translateFromMap() {
    CRBDDeleteIn = CmfRewardBalanceDetailObjectKeyHelper.fromMap(inputMap, "CmfRewardBalanceDetail");
  }

/**
 *
 * Gets the CmfRewardBalanceDetail
 * @return Value of the CmfRewardBalanceDetail
 *
 */

  public CmfRewardBalanceDetailObjectKeyData getCmfRewardBalanceDetail( ) {
    return CRBDDeleteIn;
  }

}
