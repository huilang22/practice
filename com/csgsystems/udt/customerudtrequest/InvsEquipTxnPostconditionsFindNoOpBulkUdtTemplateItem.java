/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipTxnPostconditionsFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsEquipTxnPostconditionsFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsEquipTxnPostconditionsFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsEquipTxnPostconditionsObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsEquipTxnPostconditionsFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsEquipTxnPostconditionsFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipTxnPostconditionsObjectDataList noOpInIn) {
    super(id, context, "InvsEquipTxnPostconditionsFind");
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
        mapArray[i] = InvsEquipTxnPostconditionsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsEquipTxnPostconditions", noOpIn);
      }
      addInput("InvsEquipTxnPostconditions", mapList);
    }
  }
/**
 *
 * Sets the  InvsEquipTxnPostconditions
 * @param noOpInIn InvsEquipTxnPostconditionsObjectDataList to set
 *
 */
  public void setInvsEquipTxnPostconditions(InvsEquipTxnPostconditionsObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsEquipTxnPostconditions passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipTxnPostconditionsObjectDataList getInvsEquipTxnPostconditions() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsEquipTxnPostconditionsObjectHelper.fromMapList(inputMap, "InvsEquipTxnPostconditionsList");
  }
}
