/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalContributionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HistoricalContributionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HistoricalContributionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HistoricalContributionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   HistoricalContributionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HistoricalContributionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalContributionObjectDataList noOpInIn) {
    super(id, context, "HistoricalContributionFind");
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
        mapArray[i] = HistoricalContributionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HistoricalContribution", noOpIn);
      }
      addInput("HistoricalContribution", mapList);
    }
  }
/**
 *
 * Sets the  HistoricalContribution
 * @param noOpInIn HistoricalContributionObjectDataList to set
 *
 */
  public void setHistoricalContribution(HistoricalContributionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HistoricalContribution passed into the constructor
 * @return Simulated response
 *
 */
  public HistoricalContributionObjectDataList getHistoricalContribution() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HistoricalContributionObjectHelper.fromMapList(inputMap, "HistoricalContributionList");
  }
}
