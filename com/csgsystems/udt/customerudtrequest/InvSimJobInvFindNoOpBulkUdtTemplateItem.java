/*
 * Generated code DO NOT EDIT
 * Generated file: InvSimJobInvFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvSimJobInvFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvSimJobInvFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvSimJobInvObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvSimJobInvFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvSimJobInvFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSimJobInvObjectDataList noOpInIn) {
    super(id, context, "InvSimJobInvFind");
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
        mapArray[i] = InvSimJobInvObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvSimJobInv", noOpIn);
      }
      addInput("InvSimJobInv", mapList);
    }
  }
/**
 *
 * Sets the  InvSimJobInv
 * @param noOpInIn InvSimJobInvObjectDataList to set
 *
 */
  public void setInvSimJobInv(InvSimJobInvObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvSimJobInv passed into the constructor
 * @return Simulated response
 *
 */
  public InvSimJobInvObjectDataList getInvSimJobInv() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvSimJobInvObjectHelper.fromMapList(inputMap, "InvSimJobInvList");
  }
}
