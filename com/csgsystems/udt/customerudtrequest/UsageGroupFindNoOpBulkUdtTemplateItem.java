/*
 * Generated code DO NOT EDIT
 * Generated file: UsageGroupFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageGroupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageGroupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageGroupObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UsageGroupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageGroupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageGroupObjectDataList noOpInIn) {
    super(id, context, "UsageGroupFind");
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
        mapArray[i] = UsageGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageGroup", noOpIn);
      }
      addInput("UsageGroup", mapList);
    }
  }
/**
 *
 * Sets the  UsageGroup
 * @param noOpInIn UsageGroupObjectDataList to set
 *
 */
  public void setUsageGroup(UsageGroupObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageGroup passed into the constructor
 * @return Simulated response
 *
 */
  public UsageGroupObjectDataList getUsageGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageGroupObjectHelper.fromMapList(inputMap, "UsageGroupList");
  }
}
