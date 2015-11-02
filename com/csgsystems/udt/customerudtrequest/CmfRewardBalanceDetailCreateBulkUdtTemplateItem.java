/*
 * Generated code DO NOT EDIT
 * Generated file: CmfRewardBalanceDetailCreateBulkUdtTemplateItem.java
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
 * Class used to create a CmfRewardBalanceDetailCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfRewardBalanceDetailCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfRewardBalanceDetailObjectData CRBDCreateIn;
/**
 *
 * Constructor to create a  CmfRewardBalanceDetailCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfRewardBalanceDetailCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfRewardBalanceDetailObjectData CRBDCreateInIn) {
    super(id, context, "CmfRewardBalanceDetailCreate");
    CRBDCreateIn = CRBDCreateInIn;
  }

  public void translateToMap() {
    if (CRBDCreateIn != null) {
      CRBDCreateIn.resetFlags(true, true);
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectHelper.toMap(CRBDCreateIn, new HashMap(), "CmfRewardBalanceDetail").get("CmfRewardBalanceDetail"));
    }
  }


/**
 *
 * Sets the CmfRewardBalanceDetail
 * @param CRBDCreateInIn Value of the CRBDCreateIn
 *
 */

  public void setCmfRewardBalanceDetail(CmfRewardBalanceDetailObjectData CRBDCreateInIn) {
    CRBDCreateIn = CRBDCreateInIn;
  }

  public void translateFromMap() {
    CRBDCreateIn = CmfRewardBalanceDetailObjectHelper.fromMap(inputMap, "CmfRewardBalanceDetail");
  }

/**
 *
 * Gets the CmfRewardBalanceDetail
 * @return Value of the CmfRewardBalanceDetail
 *
 */

  public CmfRewardBalanceDetailObjectData getCmfRewardBalanceDetail( ) {
    return CRBDCreateIn;
  }

}
