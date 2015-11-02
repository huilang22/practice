/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentTypeGroupsFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AdjustmentTypeGroupsFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdjustmentTypeGroupsFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdjustmentTypeGroupsObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AdjustmentTypeGroupsFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdjustmentTypeGroupsFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentTypeGroupsObjectDataList noOpInIn) {
    super(id, context, "AdjustmentTypeGroupsFind");
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
        mapArray[i] = AdjustmentTypeGroupsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AdjustmentTypeGroups", noOpIn);
      }
      addInput("AdjustmentTypeGroups", mapList);
    }
  }
/**
 *
 * Sets the  AdjustmentTypeGroups
 * @param noOpInIn AdjustmentTypeGroupsObjectDataList to set
 *
 */
  public void setAdjustmentTypeGroups(AdjustmentTypeGroupsObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AdjustmentTypeGroups passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentTypeGroupsObjectDataList getAdjustmentTypeGroups() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AdjustmentTypeGroupsObjectHelper.fromMapList(inputMap, "AdjustmentTypeGroupsList");
  }
}
