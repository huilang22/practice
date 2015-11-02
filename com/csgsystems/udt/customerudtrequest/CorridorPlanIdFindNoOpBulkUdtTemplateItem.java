/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanIdFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CorridorPlanIdFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CorridorPlanIdFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CPIObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CorridorPlanIdFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CorridorPlanIdFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CPIObjectDataList noOpInIn) {
    super(id, context, "CorridorPlanIdFind");
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
        mapArray[i] = CPIObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CorridorPlanId", noOpIn);
      }
      addInput("CorridorPlanId", mapList);
    }
  }
/**
 *
 * Sets the  CorridorPlanId
 * @param noOpInIn CPIObjectDataList to set
 *
 */
  public void setCorridorPlanId(CPIObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CorridorPlanId passed into the constructor
 * @return Simulated response
 *
 */
  public CPIObjectDataList getCorridorPlanId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CPIObjectHelper.fromMapList(inputMap, "CorridorPlanIdList");
  }
}
