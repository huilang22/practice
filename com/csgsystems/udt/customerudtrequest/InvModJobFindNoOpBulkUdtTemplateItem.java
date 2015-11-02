/*
 * Generated code DO NOT EDIT
 * Generated file: InvModJobFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvModJobFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvModJobFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvModJobObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvModJobFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvModJobFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvModJobObjectDataList noOpInIn) {
    super(id, context, "InvModJobFind");
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
        mapArray[i] = InvModJobObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvModJob", noOpIn);
      }
      addInput("InvModJob", mapList);
    }
  }
/**
 *
 * Sets the  InvModJob
 * @param noOpInIn InvModJobObjectDataList to set
 *
 */
  public void setInvModJob(InvModJobObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvModJob passed into the constructor
 * @return Simulated response
 *
 */
  public InvModJobObjectDataList getInvModJob() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvModJobObjectHelper.fromMapList(inputMap, "InvModJobList");
  }
}
