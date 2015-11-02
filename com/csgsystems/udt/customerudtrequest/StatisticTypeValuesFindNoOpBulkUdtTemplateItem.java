/*
 * Generated code DO NOT EDIT
 * Generated file: StatisticTypeValuesFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a StatisticTypeValuesFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StatisticTypeValuesFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StatisticTypeValuesObjectDataList noOpIn;

/**
 *
 * Constructor to create a   StatisticTypeValuesFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StatisticTypeValuesFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StatisticTypeValuesObjectDataList noOpInIn) {
    super(id, context, "StatisticTypeValuesFind");
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
        mapArray[i] = StatisticTypeValuesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("StatisticTypeValues", noOpIn);
      }
      addInput("StatisticTypeValues", mapList);
    }
  }
/**
 *
 * Sets the  StatisticTypeValues
 * @param noOpInIn StatisticTypeValuesObjectDataList to set
 *
 */
  public void setStatisticTypeValues(StatisticTypeValuesObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the StatisticTypeValues passed into the constructor
 * @return Simulated response
 *
 */
  public StatisticTypeValuesObjectDataList getStatisticTypeValues() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = StatisticTypeValuesObjectHelper.fromMapList(inputMap, "StatisticTypeValuesList");
  }
}
