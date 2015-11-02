/*
 * Generated code DO NOT EDIT
 * Generated file: ValidMilestoneStatusFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a ValidMilestoneStatusFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ValidMilestoneStatusFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ValidMilestoneStatusObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ValidMilestoneStatusFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ValidMilestoneStatusFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ValidMilestoneStatusObjectDataList noOpInIn) {
    super(id, context, "ValidMilestoneStatusFind");
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
        mapArray[i] = ValidMilestoneStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ValidMilestoneStatus", noOpIn);
      }
      addInput("ValidMilestoneStatus", mapList);
    }
  }
/**
 *
 * Sets the  ValidMilestoneStatus
 * @param noOpInIn ValidMilestoneStatusObjectDataList to set
 *
 */
  public void setValidMilestoneStatus(ValidMilestoneStatusObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ValidMilestoneStatus passed into the constructor
 * @return Simulated response
 *
 */
  public ValidMilestoneStatusObjectDataList getValidMilestoneStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ValidMilestoneStatusObjectHelper.fromMapList(inputMap, "ValidMilestoneStatusList");
  }
}
