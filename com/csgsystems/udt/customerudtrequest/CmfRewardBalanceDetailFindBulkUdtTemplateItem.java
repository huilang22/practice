/*
 * Generated code DO NOT EDIT
 * Generated file: CmfRewardBalanceDetailFindBulkUdtTemplateItem.java
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
 * Class used to create a CmfRewardBalanceDetailFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfRewardBalanceDetailFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfRewardBalanceDetailObjectFilter CRBDFindIn;
/**
 *
 * Constructor to create a  CmfRewardBalanceDetailFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfRewardBalanceDetailFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfRewardBalanceDetailObjectFilter CRBDFindInIn) {
    super(id, context, "CmfRewardBalanceDetailFind");
    CRBDFindIn = CRBDFindInIn;
  }

  public void translateToMap() {
    if (CRBDFindIn != null) {
      Integer index =  CRBDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectHelper.toMap(CRBDFindIn, new HashMap(), "CmfRewardBalanceDetail").get("CmfRewardBalanceDetail"));
    }
  }


/**
 *
 * Sets the CmfRewardBalanceDetail
 * @param CRBDFindInIn Value of the CRBDFindIn
 *
 */

  public void setCmfRewardBalanceDetail(CmfRewardBalanceDetailObjectFilter CRBDFindInIn) {
    CRBDFindIn = CRBDFindInIn;
  }

  public void translateFromMap() {
    CRBDFindIn = CmfRewardBalanceDetailObjectHelper.fromMapFilter(inputMap, "CmfRewardBalanceDetail");
  }

/**
 *
 * Gets the CmfRewardBalanceDetail
 * @return Value of the CmfRewardBalanceDetail
 *
 */

  public CmfRewardBalanceDetailObjectFilter getCmfRewardBalanceDetail( ) {
    return CRBDFindIn;
  }

}
