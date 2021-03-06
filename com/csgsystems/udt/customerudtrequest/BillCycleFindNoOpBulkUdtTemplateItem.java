/*
 * Generated code DO NOT EDIT
 * Generated file: BillCycleFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillCycleFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillCycleFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillCycleObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BillCycleFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillCycleFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillCycleObjectDataList noOpInIn) {
    super(id, context, "BillCycleFind");
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
        mapArray[i] = BillCycleObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillCycle", noOpIn);
      }
      addInput("BillCycle", mapList);
    }
  }
/**
 *
 * Sets the  BillCycle
 * @param noOpInIn BillCycleObjectDataList to set
 *
 */
  public void setBillCycle(BillCycleObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillCycle passed into the constructor
 * @return Simulated response
 *
 */
  public BillCycleObjectDataList getBillCycle() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillCycleObjectHelper.fromMapList(inputMap, "BillCycleList");
  }
}
