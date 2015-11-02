/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerInvFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvContainerInvFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvContainerInvFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvContainerInvObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvContainerInvFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvContainerInvFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerInvObjectDataList noOpInIn) {
    super(id, context, "InvContainerInvFind");
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
        mapArray[i] = InvContainerInvObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvContainerInv", noOpIn);
      }
      addInput("InvContainerInv", mapList);
    }
  }
/**
 *
 * Sets the  InvContainerInv
 * @param noOpInIn InvContainerInvObjectDataList to set
 *
 */
  public void setInvContainerInv(InvContainerInvObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvContainerInv passed into the constructor
 * @return Simulated response
 *
 */
  public InvContainerInvObjectDataList getInvContainerInv() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvContainerInvObjectHelper.fromMapList(inputMap, "InvContainerInvList");
  }
}
