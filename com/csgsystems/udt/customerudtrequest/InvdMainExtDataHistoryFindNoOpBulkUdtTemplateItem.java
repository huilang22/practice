/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainExtDataHistoryFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvdMainExtDataHistoryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdMainExtDataHistoryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdMainExtDataHistoryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvdMainExtDataHistoryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdMainExtDataHistoryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainExtDataHistoryObjectDataList noOpInIn) {
    super(id, context, "InvdMainExtDataHistoryFind");
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
        mapArray[i] = InvdMainExtDataHistoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvdMainExtDataHistory", noOpIn);
      }
      addInput("InvdMainExtDataHistory", mapList);
    }
  }
/**
 *
 * Sets the  InvdMainExtDataHistory
 * @param noOpInIn InvdMainExtDataHistoryObjectDataList to set
 *
 */
  public void setInvdMainExtDataHistory(InvdMainExtDataHistoryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdMainExtDataHistory passed into the constructor
 * @return Simulated response
 *
 */
  public InvdMainExtDataHistoryObjectDataList getInvdMainExtDataHistory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdMainExtDataHistoryObjectHelper.fromMapList(inputMap, "InvdMainExtDataHistoryList");
  }
}
