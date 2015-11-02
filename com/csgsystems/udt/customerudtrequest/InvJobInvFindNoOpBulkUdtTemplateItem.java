/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobInvFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvJobInvFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvJobInvFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvJobInvObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvJobInvFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvJobInvFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobInvObjectDataList noOpInIn) {
    super(id, context, "InvJobInvFind");
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
        mapArray[i] = InvJobInvObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvJobInv", noOpIn);
      }
      addInput("InvJobInv", mapList);
    }
  }
/**
 *
 * Sets the  InvJobInv
 * @param noOpInIn InvJobInvObjectDataList to set
 *
 */
  public void setInvJobInv(InvJobInvObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvJobInv passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobInvObjectDataList getInvJobInv() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvJobInvObjectHelper.fromMapList(inputMap, "InvJobInvList");
  }
}
