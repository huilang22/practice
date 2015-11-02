/*
 * Generated code DO NOT EDIT
 * Generated file: InvdReserveEndFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvdReserveEndFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdReserveEndFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdReserveEndObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvdReserveEndFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdReserveEndFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdReserveEndObjectDataList noOpInIn) {
    super(id, context, "InvdReserveEndFind");
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
        mapArray[i] = InvdReserveEndObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvdReserveEnd", noOpIn);
      }
      addInput("InvdReserveEnd", mapList);
    }
  }
/**
 *
 * Sets the  InvdReserveEnd
 * @param noOpInIn InvdReserveEndObjectDataList to set
 *
 */
  public void setInvdReserveEnd(InvdReserveEndObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdReserveEnd passed into the constructor
 * @return Simulated response
 *
 */
  public InvdReserveEndObjectDataList getInvdReserveEnd() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdReserveEndObjectHelper.fromMapList(inputMap, "InvdReserveEndList");
  }
}
