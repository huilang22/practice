/*
 * Generated code DO NOT EDIT
 * Generated file: PlanIdCreditFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PlanIdCreditFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PlanIdCreditFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PlanIdCreditObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PlanIdCreditFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PlanIdCreditFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PlanIdCreditObjectDataList noOpInIn) {
    super(id, context, "PlanIdCreditFind");
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
        mapArray[i] = PlanIdCreditObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PlanIdCredit", noOpIn);
      }
      addInput("PlanIdCredit", mapList);
    }
  }
/**
 *
 * Sets the  PlanIdCredit
 * @param noOpInIn PlanIdCreditObjectDataList to set
 *
 */
  public void setPlanIdCredit(PlanIdCreditObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PlanIdCredit passed into the constructor
 * @return Simulated response
 *
 */
  public PlanIdCreditObjectDataList getPlanIdCredit() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PlanIdCreditObjectHelper.fromMapList(inputMap, "PlanIdCreditList");
  }
}
