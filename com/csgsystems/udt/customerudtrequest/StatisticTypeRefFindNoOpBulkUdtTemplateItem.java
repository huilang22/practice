/*
 * Generated code DO NOT EDIT
 * Generated file: StatisticTypeRefFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a StatisticTypeRefFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StatisticTypeRefFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StatisticTypeRefObjectDataList noOpIn;

/**
 *
 * Constructor to create a   StatisticTypeRefFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StatisticTypeRefFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StatisticTypeRefObjectDataList noOpInIn) {
    super(id, context, "StatisticTypeRefFind");
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
        mapArray[i] = StatisticTypeRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("StatisticTypeRef", noOpIn);
      }
      addInput("StatisticTypeRef", mapList);
    }
  }
/**
 *
 * Sets the  StatisticTypeRef
 * @param noOpInIn StatisticTypeRefObjectDataList to set
 *
 */
  public void setStatisticTypeRef(StatisticTypeRefObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the StatisticTypeRef passed into the constructor
 * @return Simulated response
 *
 */
  public StatisticTypeRefObjectDataList getStatisticTypeRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = StatisticTypeRefObjectHelper.fromMapList(inputMap, "StatisticTypeRefList");
  }
}
