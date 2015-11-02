/*
 * Generated code DO NOT EDIT
 * Generated file: PlanIdDiscountFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PlanIdDiscountFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PlanIdDiscountFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PIDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PlanIdDiscountFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PlanIdDiscountFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PIDObjectDataList noOpInIn) {
    super(id, context, "PlanIdDiscountFind");
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
        mapArray[i] = PIDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PlanIdDiscount", noOpIn);
      }
      addInput("PlanIdDiscount", mapList);
    }
  }
/**
 *
 * Sets the  PlanIdDiscount
 * @param noOpInIn PIDObjectDataList to set
 *
 */
  public void setPlanIdDiscount(PIDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PlanIdDiscount passed into the constructor
 * @return Simulated response
 *
 */
  public PIDObjectDataList getPlanIdDiscount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PIDObjectHelper.fromMapList(inputMap, "PlanIdDiscountList");
  }
}
