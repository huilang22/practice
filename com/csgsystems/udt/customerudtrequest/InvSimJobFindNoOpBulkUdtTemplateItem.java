/*
 * Generated code DO NOT EDIT
 * Generated file: InvSimJobFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvSimJobFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvSimJobFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvSimJobObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvSimJobFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvSimJobFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSimJobObjectDataList noOpInIn) {
    super(id, context, "InvSimJobFind");
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
        mapArray[i] = InvSimJobObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvSimJob", noOpIn);
      }
      addInput("InvSimJob", mapList);
    }
  }
/**
 *
 * Sets the  InvSimJob
 * @param noOpInIn InvSimJobObjectDataList to set
 *
 */
  public void setInvSimJob(InvSimJobObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvSimJob passed into the constructor
 * @return Simulated response
 *
 */
  public InvSimJobObjectDataList getInvSimJob() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvSimJobObjectHelper.fromMapList(inputMap, "InvSimJobList");
  }
}
