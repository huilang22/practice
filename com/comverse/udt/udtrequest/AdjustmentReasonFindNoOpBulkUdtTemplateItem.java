/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentReasonFindNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a AdjustmentReasonFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdjustmentReasonFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdjustmentReasonObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AdjustmentReasonFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdjustmentReasonFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentReasonObjectDataList noOpInIn) {
    super(id, context, "AdjustmentReasonFind");
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
        mapArray[i] = AdjustmentReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AdjustmentReason", noOpIn);
      }
      addInput("AdjustmentReason", mapList);
    }
  }
/**
 *
 * Sets the  AdjustmentReason
 * @param noOpInIn AdjustmentReasonObjectDataList to set
 *
 */
  public void setAdjustmentReason(AdjustmentReasonObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AdjustmentReason passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentReasonObjectDataList getAdjustmentReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AdjustmentReasonObjectHelper.fromMapList(inputMap, "AdjustmentReasonList");
  }
}
