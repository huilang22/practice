/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfRewardBalanceDetailFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CmfRewardBalanceDetailFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CmfRewardBalanceDetailFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CmfRewardBalanceDetailObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CmfRewardBalanceDetailFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CmfRewardBalanceDetailFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfRewardBalanceDetailObjectDataList noOpInIn) {
    super(id, context, "CmfRewardBalanceDetailFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = CmfRewardBalanceDetailObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CmfRewardBalanceDetail", noOpIn);
      }
      addInput("CmfRewardBalanceDetail", mapList);
    }
  }
/**
 *
 * Sets the  CmfRewardBalanceDetail
 * @param noOpInIn CmfRewardBalanceDetailObjectDataList to set
 *
 */
  public void setCmfRewardBalanceDetail(CmfRewardBalanceDetailObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CmfRewardBalanceDetail passed into the constructor
 * @return Simulated response
 *
 */
  public CmfRewardBalanceDetailObjectDataList getCmfRewardBalanceDetail() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CmfRewardBalanceDetailObjectHelper.fromMapList(inputMap, "CmfRewardBalanceDetailList");
  }
}
