/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupUsageRedirectGroupFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a HqGroupUsageRedirectGroupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupUsageRedirectGroupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupUsageRedirectGroupObjectDataList noOpIn;

/**
 *
 * Constructor to create a   HqGroupUsageRedirectGroupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupUsageRedirectGroupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectGroupObjectDataList noOpInIn) {
    super(id, context, "HqGroupUsageRedirectGroupFind");
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
        mapArray[i] = HqGroupUsageRedirectGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HqGroupUsageRedirectGroup", noOpIn);
      }
      addInput("HqGroupUsageRedirectGroup", mapList);
    }
  }
/**
 *
 * Sets the  HqGroupUsageRedirectGroup
 * @param noOpInIn HqGroupUsageRedirectGroupObjectDataList to set
 *
 */
  public void setHqGroupUsageRedirectGroup(HqGroupUsageRedirectGroupObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqGroupUsageRedirectGroup passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupUsageRedirectGroupObjectDataList getHqGroupUsageRedirectGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupUsageRedirectGroupObjectHelper.fromMapList(inputMap, "HqGroupUsageRedirectGroupList");
  }
}
