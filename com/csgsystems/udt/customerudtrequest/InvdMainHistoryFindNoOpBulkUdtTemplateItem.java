/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainHistoryFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvdMainHistoryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdMainHistoryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdMainHistoryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvdMainHistoryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdMainHistoryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainHistoryObjectDataList noOpInIn) {
    super(id, context, "InvdMainHistoryFind");
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
        mapArray[i] = InvdMainHistoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvdMainHistory", noOpIn);
      }
      addInput("InvdMainHistory", mapList);
    }
  }
/**
 *
 * Sets the  InvdMainHistory
 * @param noOpInIn InvdMainHistoryObjectDataList to set
 *
 */
  public void setInvdMainHistory(InvdMainHistoryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdMainHistory passed into the constructor
 * @return Simulated response
 *
 */
  public InvdMainHistoryObjectDataList getInvdMainHistory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdMainHistoryObjectHelper.fromMapList(inputMap, "InvdMainHistoryList");
  }
}
