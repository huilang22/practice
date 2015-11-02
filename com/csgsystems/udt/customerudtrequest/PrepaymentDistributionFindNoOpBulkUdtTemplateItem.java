/*
 * Generated code DO NOT EDIT
 * Generated file: PrepaymentDistributionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PrepaymentDistributionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PrepaymentDistributionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PrepaymentDistributionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PrepaymentDistributionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PrepaymentDistributionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PrepaymentDistributionObjectDataList noOpInIn) {
    super(id, context, "PrepaymentDistributionFind");
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
        mapArray[i] = PrepaymentDistributionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PrepaymentDistribution", noOpIn);
      }
      addInput("PrepaymentDistribution", mapList);
    }
  }
/**
 *
 * Sets the  PrepaymentDistribution
 * @param noOpInIn PrepaymentDistributionObjectDataList to set
 *
 */
  public void setPrepaymentDistribution(PrepaymentDistributionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PrepaymentDistribution passed into the constructor
 * @return Simulated response
 *
 */
  public PrepaymentDistributionObjectDataList getPrepaymentDistribution() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PrepaymentDistributionObjectHelper.fromMapList(inputMap, "PrepaymentDistributionList");
  }
}
