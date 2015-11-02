/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalContributionTaxFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HistoricalContributionTaxFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HistoricalContributionTaxFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HistoricalContributionTaxObjectDataList noOpIn;

/**
 *
 * Constructor to create a   HistoricalContributionTaxFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HistoricalContributionTaxFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalContributionTaxObjectDataList noOpInIn) {
    super(id, context, "HistoricalContributionTaxFind");
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
        mapArray[i] = HistoricalContributionTaxObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HistoricalContributionTax", noOpIn);
      }
      addInput("HistoricalContributionTax", mapList);
    }
  }
/**
 *
 * Sets the  HistoricalContributionTax
 * @param noOpInIn HistoricalContributionTaxObjectDataList to set
 *
 */
  public void setHistoricalContributionTax(HistoricalContributionTaxObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HistoricalContributionTax passed into the constructor
 * @return Simulated response
 *
 */
  public HistoricalContributionTaxObjectDataList getHistoricalContributionTax() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HistoricalContributionTaxObjectHelper.fromMapList(inputMap, "HistoricalContributionTaxList");
  }
}
