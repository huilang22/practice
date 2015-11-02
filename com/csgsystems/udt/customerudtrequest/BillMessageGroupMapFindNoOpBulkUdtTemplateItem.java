/*
 * Generated code DO NOT EDIT
 * Generated file: BillMessageGroupMapFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillMessageGroupMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillMessageGroupMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillMessageGroupMapObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BillMessageGroupMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillMessageGroupMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillMessageGroupMapObjectDataList noOpInIn) {
    super(id, context, "BillMessageGroupMapFind");
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
        mapArray[i] = BillMessageGroupMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillMessageGroupMap", noOpIn);
      }
      addInput("BillMessageGroupMap", mapList);
    }
  }
/**
 *
 * Sets the  BillMessageGroupMap
 * @param noOpInIn BillMessageGroupMapObjectDataList to set
 *
 */
  public void setBillMessageGroupMap(BillMessageGroupMapObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillMessageGroupMap passed into the constructor
 * @return Simulated response
 *
 */
  public BillMessageGroupMapObjectDataList getBillMessageGroupMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillMessageGroupMapObjectHelper.fromMapList(inputMap, "BillMessageGroupMapList");
  }
}
