/*
 * Generated code DO NOT EDIT
 * Generated file: DiscReasonFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a DiscReasonFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscReasonFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DiscReasonObjectDataList noOpIn;

/**
 *
 * Constructor to create a   DiscReasonFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscReasonFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DiscReasonObjectDataList noOpInIn) {
    super(id, context, "DiscReasonFind");
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
        mapArray[i] = DiscReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DiscReason", noOpIn);
      }
      addInput("DiscReason", mapList);
    }
  }
/**
 *
 * Sets the  DiscReason
 * @param noOpInIn DiscReasonObjectDataList to set
 *
 */
  public void setDiscReason(DiscReasonObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DiscReason passed into the constructor
 * @return Simulated response
 *
 */
  public DiscReasonObjectDataList getDiscReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DiscReasonObjectHelper.fromMapList(inputMap, "DiscReasonList");
  }
}
