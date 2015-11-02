/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobSubstateCompleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvJobSubstateCompleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvJobSubstateCompleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvJobObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvJobSubstateCompleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvJobSubstateCompleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobObjectDataList noOpInIn) {
    super(id, context, "InvJobSubstateComplete");
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
        mapArray[i] = InvJobObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvJob", noOpIn);
      }
      addInput("InvJob", mapList);
    }
  }
/**
 *
 * Sets the  InvJob
 * @param noOpInIn InvJobObjectDataList to set
 *
 */
  public void setInvJob(InvJobObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvJob passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobObjectDataList getInvJob() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvJobObjectHelper.fromMapList(inputMap, "InvJobList");
  }
}
