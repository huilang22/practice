/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceEntityMappingFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RewardBalanceEntityMappingFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RewardBalanceEntityMappingFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RewardBalanceEntityMappingObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RewardBalanceEntityMappingFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RewardBalanceEntityMappingFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RewardBalanceEntityMappingObjectDataList noOpInIn) {
    super(id, context, "RewardBalanceEntityMappingFind");
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
        mapArray[i] = RewardBalanceEntityMappingObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RewardBalanceEntityMapping", noOpIn);
      }
      addInput("RewardBalanceEntityMapping", mapList);
    }
  }
/**
 *
 * Sets the  RewardBalanceEntityMapping
 * @param noOpInIn RewardBalanceEntityMappingObjectDataList to set
 *
 */
  public void setRewardBalanceEntityMapping(RewardBalanceEntityMappingObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RewardBalanceEntityMapping passed into the constructor
 * @return Simulated response
 *
 */
  public RewardBalanceEntityMappingObjectDataList getRewardBalanceEntityMapping() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RewardBalanceEntityMappingObjectHelper.fromMapList(inputMap, "RewardBalanceEntityMappingList");
  }
}
