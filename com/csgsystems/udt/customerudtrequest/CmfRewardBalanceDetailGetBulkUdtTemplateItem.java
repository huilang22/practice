/*
 * Generated code DO NOT EDIT
 * Generated file: CmfRewardBalanceDetailGetBulkUdtTemplateItem.java
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
 * Class used to create a CmfRewardBalanceDetailGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfRewardBalanceDetailGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfRewardBalanceDetailObjectKeyData CRBDGetIn;
/**
 *
 * Constructor to create a  CmfRewardBalanceDetailGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfRewardBalanceDetailGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfRewardBalanceDetailObjectKeyData CRBDGetInIn) {
    super(id, context, "CmfRewardBalanceDetailGet");
    CRBDGetIn = CRBDGetInIn;
  }

  public void translateToMap() {
    if (CRBDGetIn != null) {
      CRBDGetIn.resetFlags(true, true);
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectKeyHelper.toMap(CRBDGetIn, new HashMap(), "CmfRewardBalanceDetailObjectKeyData").get("CmfRewardBalanceDetailObjectKeyData"));
    }
  }


/**
 *
 * Sets the CmfRewardBalanceDetail
 * @param CRBDGetInIn Value of the CRBDGetIn
 *
 */

  public void setCmfRewardBalanceDetail(CmfRewardBalanceDetailObjectKeyData CRBDGetInIn) {
    CRBDGetIn = CRBDGetInIn;
  }

  public void translateFromMap() {
    CRBDGetIn = CmfRewardBalanceDetailObjectKeyHelper.fromMap(inputMap, "CmfRewardBalanceDetail");
  }

/**
 *
 * Gets the CmfRewardBalanceDetail
 * @return Value of the CmfRewardBalanceDetail
 *
 */

  public CmfRewardBalanceDetailObjectKeyData getCmfRewardBalanceDetail( ) {
    return CRBDGetIn;
  }

}
