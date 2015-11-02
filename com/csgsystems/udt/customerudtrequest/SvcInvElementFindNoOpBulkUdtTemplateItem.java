/*
 * Generated code DO NOT EDIT
 * Generated file: SvcInvElementFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SvcInvElementFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SvcInvElementFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SvcInvElementObjectDataList noOpIn;

/**
 *
 * Constructor to create a   SvcInvElementFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SvcInvElementFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SvcInvElementObjectDataList noOpInIn) {
    super(id, context, "SvcInvElementFind");
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
        mapArray[i] = SvcInvElementObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SvcInventory", noOpIn);
      }
      addInput("SvcInventory", mapList);
    }
  }
/**
 *
 * Sets the  SvcInventory
 * @param noOpInIn SvcInvElementObjectDataList to set
 *
 */
  public void setSvcInventory(SvcInvElementObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SvcInventory passed into the constructor
 * @return Simulated response
 *
 */
  public SvcInvElementObjectDataList getSvcInventory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SvcInvElementObjectHelper.fromMapList(inputMap, "SvcInventoryList");
  }
}
