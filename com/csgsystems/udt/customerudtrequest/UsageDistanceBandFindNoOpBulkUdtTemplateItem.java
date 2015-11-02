/*
 * Generated code DO NOT EDIT
 * Generated file: UsageDistanceBandFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageDistanceBandFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageDistanceBandFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageDistBandObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UsageDistanceBandFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageDistanceBandFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageDistBandObjectDataList noOpInIn) {
    super(id, context, "UsageDistanceBandFind");
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
        mapArray[i] = UsageDistBandObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageDistanceBand", noOpIn);
      }
      addInput("UsageDistanceBand", mapList);
    }
  }
/**
 *
 * Sets the  UsageDistanceBand
 * @param noOpInIn UsageDistBandObjectDataList to set
 *
 */
  public void setUsageDistanceBand(UsageDistBandObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageDistanceBand passed into the constructor
 * @return Simulated response
 *
 */
  public UsageDistBandObjectDataList getUsageDistanceBand() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageDistBandObjectHelper.fromMapList(inputMap, "UsageDistanceBandList");
  }
}
