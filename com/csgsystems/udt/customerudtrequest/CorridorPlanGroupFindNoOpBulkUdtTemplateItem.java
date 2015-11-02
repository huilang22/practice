/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanGroupFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CorridorPlanGroupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CorridorPlanGroupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CPGObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CorridorPlanGroupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CorridorPlanGroupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CPGObjectDataList noOpInIn) {
    super(id, context, "CorridorPlanGroupFind");
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
        mapArray[i] = CPGObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CorridorPlanGroup", noOpIn);
      }
      addInput("CorridorPlanGroup", mapList);
    }
  }
/**
 *
 * Sets the  CorridorPlanGroup
 * @param noOpInIn CPGObjectDataList to set
 *
 */
  public void setCorridorPlanGroup(CPGObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CorridorPlanGroup passed into the constructor
 * @return Simulated response
 *
 */
  public CPGObjectDataList getCorridorPlanGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CPGObjectHelper.fromMapList(inputMap, "CorridorPlanGroupList");
  }
}
