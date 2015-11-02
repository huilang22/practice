/*
 * Generated code DO NOT EDIT
 * Generated file: UsageUnitsConvertFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageUnitsConvertFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageUnitsConvertFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageUnitsConvertObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UsageUnitsConvertFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageUnitsConvertFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageUnitsConvertObjectDataList noOpInIn) {
    super(id, context, "UsageUnitsConvertFind");
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
        mapArray[i] = UsageUnitsConvertObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageUnitsConvert", noOpIn);
      }
      addInput("UsageUnitsConvert", mapList);
    }
  }
/**
 *
 * Sets the  UsageUnitsConvert
 * @param noOpInIn UsageUnitsConvertObjectDataList to set
 *
 */
  public void setUsageUnitsConvert(UsageUnitsConvertObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageUnitsConvert passed into the constructor
 * @return Simulated response
 *
 */
  public UsageUnitsConvertObjectDataList getUsageUnitsConvert() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageUnitsConvertObjectHelper.fromMapList(inputMap, "UsageUnitsConvertList");
  }
}
