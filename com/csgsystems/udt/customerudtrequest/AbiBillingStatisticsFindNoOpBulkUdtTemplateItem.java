/*
 * Generated code DO NOT EDIT
 * Generated file: AbiBillingStatisticsFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a AbiBillingStatisticsFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AbiBillingStatisticsFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AbiBillingStatisticsObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AbiBillingStatisticsFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AbiBillingStatisticsFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiBillingStatisticsObjectDataList noOpInIn) {
    super(id, context, "AbiBillingStatisticsFind");
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
        mapArray[i] = AbiBillingStatisticsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AbiBillingStatistics", noOpIn);
      }
      addInput("AbiBillingStatistics", mapList);
    }
  }
/**
 *
 * Sets the  AbiBillingStatistics
 * @param noOpInIn AbiBillingStatisticsObjectDataList to set
 *
 */
  public void setAbiBillingStatistics(AbiBillingStatisticsObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AbiBillingStatistics passed into the constructor
 * @return Simulated response
 *
 */
  public AbiBillingStatisticsObjectDataList getAbiBillingStatistics() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AbiBillingStatisticsObjectHelper.fromMapList(inputMap, "AbiBillingStatisticsList");
  }
}
