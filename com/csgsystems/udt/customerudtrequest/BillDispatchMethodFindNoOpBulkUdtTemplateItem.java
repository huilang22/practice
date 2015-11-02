/*
 * Generated code DO NOT EDIT
 * Generated file: BillDispatchMethodFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillDispatchMethodFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillDispatchMethodFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillDispatchMethodObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BillDispatchMethodFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillDispatchMethodFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillDispatchMethodObjectDataList noOpInIn) {
    super(id, context, "BillDispatchMethodFind");
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
        mapArray[i] = BillDispatchMethodObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillDispatchMethod", noOpIn);
      }
      addInput("BillDispatchMethod", mapList);
    }
  }
/**
 *
 * Sets the  BillDispatchMethod
 * @param noOpInIn BillDispatchMethodObjectDataList to set
 *
 */
  public void setBillDispatchMethod(BillDispatchMethodObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillDispatchMethod passed into the constructor
 * @return Simulated response
 *
 */
  public BillDispatchMethodObjectDataList getBillDispatchMethod() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillDispatchMethodObjectHelper.fromMapList(inputMap, "BillDispatchMethodList");
  }
}
