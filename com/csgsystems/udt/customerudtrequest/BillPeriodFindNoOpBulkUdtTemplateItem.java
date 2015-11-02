/*
 * Generated code DO NOT EDIT
 * Generated file: BillPeriodFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillPeriodFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillPeriodFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BPObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BillPeriodFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillPeriodFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BPObjectDataList noOpInIn) {
    super(id, context, "BillPeriodFind");
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
        mapArray[i] = BPObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillPeriod", noOpIn);
      }
      addInput("BillPeriod", mapList);
    }
  }
/**
 *
 * Sets the  BillPeriod
 * @param noOpInIn BPObjectDataList to set
 *
 */
  public void setBillPeriod(BPObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillPeriod passed into the constructor
 * @return Simulated response
 *
 */
  public BPObjectDataList getBillPeriod() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BPObjectHelper.fromMapList(inputMap, "BillPeriodList");
  }
}
