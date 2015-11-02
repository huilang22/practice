/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneStatusFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a MilestoneStatusFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MilestoneStatusFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MilestoneStatusObjectDataList noOpIn;

/**
 *
 * Constructor to create a   MilestoneStatusFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MilestoneStatusFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneStatusObjectDataList noOpInIn) {
    super(id, context, "MilestoneStatusFind");
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
        mapArray[i] = MilestoneStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("MilestoneStatus", noOpIn);
      }
      addInput("MilestoneStatus", mapList);
    }
  }
/**
 *
 * Sets the  MilestoneStatus
 * @param noOpInIn MilestoneStatusObjectDataList to set
 *
 */
  public void setMilestoneStatus(MilestoneStatusObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MilestoneStatus passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneStatusObjectDataList getMilestoneStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MilestoneStatusObjectHelper.fromMapList(inputMap, "MilestoneStatusList");
  }
}
