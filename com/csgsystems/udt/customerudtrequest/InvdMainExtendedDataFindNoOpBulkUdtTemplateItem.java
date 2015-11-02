/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainExtendedDataFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvdMainExtendedDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdMainExtendedDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdMainEDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvdMainExtendedDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdMainExtendedDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainEDObjectDataList noOpInIn) {
    super(id, context, "InvdMainExtendedDataFind");
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
        mapArray[i] = InvdMainEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvdMain", noOpIn);
      }
      addInput("InvdMain", mapList);
    }
  }
/**
 *
 * Sets the  InvdMain
 * @param noOpInIn InvdMainEDObjectDataList to set
 *
 */
  public void setInvdMain(InvdMainEDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdMain passed into the constructor
 * @return Simulated response
 *
 */
  public InvdMainEDObjectDataList getInvdMain() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdMainEDObjectHelper.fromMapList(inputMap, "InvdMainList");
  }
}
