/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageByAccountFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BilledUsageByAccountFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BilledUsageByAccountFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BilledUsageObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BilledUsageByAccountFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BilledUsageByAccountFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageObjectDataList noOpInIn) {
    super(id, context, "BilledUsageByAccountFind");
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
        mapArray[i] = BilledUsageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BilledUsage", noOpIn);
      }
      addInput("BilledUsage", mapList);
    }
  }
/**
 *
 * Sets the  BilledUsage
 * @param noOpInIn BilledUsageObjectDataList to set
 *
 */
  public void setBilledUsage(BilledUsageObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BilledUsage passed into the constructor
 * @return Simulated response
 *
 */
  public BilledUsageObjectDataList getBilledUsage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BilledUsageObjectHelper.fromMapList(inputMap, "BilledUsageList");
  }
}
