/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingReasonFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcRatingReasonFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcRatingReasonFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcRatingReasonObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcRatingReasonFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcRatingReasonFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingReasonObjectDataList noOpInIn) {
    super(id, context, "CtcRatingReasonFind");
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
        mapArray[i] = CtcRatingReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcRatingReason", noOpIn);
      }
      addInput("CtcRatingReason", mapList);
    }
  }
/**
 *
 * Sets the  CtcRatingReason
 * @param noOpInIn CtcRatingReasonObjectDataList to set
 *
 */
  public void setCtcRatingReason(CtcRatingReasonObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcRatingReason passed into the constructor
 * @return Simulated response
 *
 */
  public CtcRatingReasonObjectDataList getCtcRatingReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcRatingReasonObjectHelper.fromMapList(inputMap, "CtcRatingReasonList");
  }
}
