/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a MilestoneFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MilestoneFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MilestoneObjectDataList noOpIn;

/**
 *
 * Constructor to create a   MilestoneFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MilestoneFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneObjectDataList noOpInIn) {
    super(id, context, "MilestoneFind");
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
        mapArray[i] = MilestoneObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Milestone", noOpIn);
      }
      addInput("Milestone", mapList);
    }
  }
/**
 *
 * Sets the  Milestone
 * @param noOpInIn MilestoneObjectDataList to set
 *
 */
  public void setMilestone(MilestoneObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Milestone passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneObjectDataList getMilestone() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MilestoneObjectHelper.fromMapList(inputMap, "MilestoneList");
  }
}
