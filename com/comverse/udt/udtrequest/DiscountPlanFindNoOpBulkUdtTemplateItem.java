/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountPlanFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DiscountPlanFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscountPlanFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DPObjectDataList noOpIn;

/**
 *
 * Constructor to create a   DiscountPlanFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscountPlanFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DPObjectDataList noOpInIn) {
    super(id, context, "DiscountPlanFind");
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
        mapArray[i] = DPObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DiscountPlan", noOpIn);
      }
      addInput("DiscountPlan", mapList);
    }
  }
/**
 *
 * Sets the  DiscountPlan
 * @param noOpInIn DPObjectDataList to set
 *
 */
  public void setDiscountPlan(DPObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DiscountPlan passed into the constructor
 * @return Simulated response
 *
 */
  public DPObjectDataList getDiscountPlan() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DPObjectHelper.fromMapList(inputMap, "DiscountPlanList");
  }
}
