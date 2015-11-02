/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeUnitFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageTypeUnitFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageTypeUnitFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageTypeUnitObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UsageTypeUnitFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageTypeUnitFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeUnitObjectDataList noOpInIn) {
    super(id, context, "UsageTypeUnitFind");
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
        mapArray[i] = UsageTypeUnitObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageTypeUnit", noOpIn);
      }
      addInput("UsageTypeUnit", mapList);
    }
  }
/**
 *
 * Sets the  UsageTypeUnit
 * @param noOpInIn UsageTypeUnitObjectDataList to set
 *
 */
  public void setUsageTypeUnit(UsageTypeUnitObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageTypeUnit passed into the constructor
 * @return Simulated response
 *
 */
  public UsageTypeUnitObjectDataList getUsageTypeUnit() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageTypeUnitObjectHelper.fromMapList(inputMap, "UsageTypeUnitList");
  }
}
