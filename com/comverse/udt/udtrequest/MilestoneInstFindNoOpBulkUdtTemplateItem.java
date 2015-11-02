/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a MilestoneInstFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MilestoneInstFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MilestoneInstObjectDataList noOpIn;

/**
 *
 * Constructor to create a   MilestoneInstFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MilestoneInstFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneInstObjectDataList noOpInIn) {
    super(id, context, "MilestoneInstFind");
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
        mapArray[i] = MilestoneInstObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("MilestoneInst", noOpIn);
      }
      addInput("MilestoneInst", mapList);
    }
  }
/**
 *
 * Sets the  MilestoneInst
 * @param noOpInIn MilestoneInstObjectDataList to set
 *
 */
  public void setMilestoneInst(MilestoneInstObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MilestoneInst passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneInstObjectDataList getMilestoneInst() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MilestoneInstObjectHelper.fromMapList(inputMap, "MilestoneInstList");
  }
}
