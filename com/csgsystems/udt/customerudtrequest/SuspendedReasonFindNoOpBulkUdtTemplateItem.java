/*
 * Generated code DO NOT EDIT
 * Generated file: SuspendedReasonFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ar.data.*;

/**
 *
 * NoOp class used to simulate a SuspendedReasonFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SuspendedReasonFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SuspendedReasonObjectDataList noOpIn;

/**
 *
 * Constructor to create a   SuspendedReasonFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SuspendedReasonFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SuspendedReasonObjectDataList noOpInIn) {
    super(id, context, "SuspendedReasonFind");
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
        mapArray[i] = SuspendedReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SuspendedReason", noOpIn);
      }
      addInput("SuspendedReason", mapList);
    }
  }
/**
 *
 * Sets the  SuspendedReason
 * @param noOpInIn SuspendedReasonObjectDataList to set
 *
 */
  public void setSuspendedReason(SuspendedReasonObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SuspendedReason passed into the constructor
 * @return Simulated response
 *
 */
  public SuspendedReasonObjectDataList getSuspendedReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SuspendedReasonObjectHelper.fromMapList(inputMap, "SuspendedReasonList");
  }
}
