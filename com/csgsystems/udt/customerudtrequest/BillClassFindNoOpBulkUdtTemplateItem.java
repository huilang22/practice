/*
 * Generated code DO NOT EDIT
 * Generated file: BillClassFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillClassFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillClassFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BCObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BillClassFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillClassFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BCObjectDataList noOpInIn) {
    super(id, context, "BillClassFind");
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
        mapArray[i] = BCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillClass", noOpIn);
      }
      addInput("BillClass", mapList);
    }
  }
/**
 *
 * Sets the  BillClass
 * @param noOpInIn BCObjectDataList to set
 *
 */
  public void setBillClass(BCObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillClass passed into the constructor
 * @return Simulated response
 *
 */
  public BCObjectDataList getBillClass() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BCObjectHelper.fromMapList(inputMap, "BillClassList");
  }
}
