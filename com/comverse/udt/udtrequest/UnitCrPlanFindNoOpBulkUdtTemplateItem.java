/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrPlanFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a UnitCrPlanFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnitCrPlanFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnitCrPlanObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UnitCrPlanFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnitCrPlanFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrPlanObjectDataList noOpInIn) {
    super(id, context, "UnitCrPlanFind");
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
        mapArray[i] = UnitCrPlanObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UnitCrPlan", noOpIn);
      }
      addInput("UnitCrPlan", mapList);
    }
  }
/**
 *
 * Sets the  UnitCrPlan
 * @param noOpInIn UnitCrPlanObjectDataList to set
 *
 */
  public void setUnitCrPlan(UnitCrPlanObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnitCrPlan passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrPlanObjectDataList getUnitCrPlan() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnitCrPlanObjectHelper.fromMapList(inputMap, "UnitCrPlanList");
  }
}
