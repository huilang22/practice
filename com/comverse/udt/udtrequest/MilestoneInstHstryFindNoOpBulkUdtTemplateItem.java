/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstHstryFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a MilestoneInstHstryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MilestoneInstHstryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MilestoneInstHstryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   MilestoneInstHstryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MilestoneInstHstryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneInstHstryObjectDataList noOpInIn) {
    super(id, context, "MilestoneInstHstryFind");
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
        mapArray[i] = MilestoneInstHstryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("MilestoneInstHstry", noOpIn);
      }
      addInput("MilestoneInstHstry", mapList);
    }
  }
/**
 *
 * Sets the  MilestoneInstHstry
 * @param noOpInIn MilestoneInstHstryObjectDataList to set
 *
 */
  public void setMilestoneInstHstry(MilestoneInstHstryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MilestoneInstHstry passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneInstHstryObjectDataList getMilestoneInstHstry() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MilestoneInstHstryObjectHelper.fromMapList(inputMap, "MilestoneInstHstryList");
  }
}
