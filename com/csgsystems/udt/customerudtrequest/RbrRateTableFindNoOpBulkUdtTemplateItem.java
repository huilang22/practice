/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateTableFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrRateTableFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrRateTableFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrRateTableObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RbrRateTableFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrRateTableFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRateTableObjectDataList noOpInIn) {
    super(id, context, "RbrRateTableFind");
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
        mapArray[i] = RbrRateTableObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrRateTable", noOpIn);
      }
      addInput("RbrRateTable", mapList);
    }
  }
/**
 *
 * Sets the  RbrRateTable
 * @param noOpInIn RbrRateTableObjectDataList to set
 *
 */
  public void setRbrRateTable(RbrRateTableObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrRateTable passed into the constructor
 * @return Simulated response
 *
 */
  public RbrRateTableObjectDataList getRbrRateTable() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrRateTableObjectHelper.fromMapList(inputMap, "RbrRateTableList");
  }
}
