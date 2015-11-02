/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingReasonFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcItemRatingReasonFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcItemRatingReasonFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcItemRatingReasonObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcItemRatingReasonFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcItemRatingReasonFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemRatingReasonObjectDataList noOpInIn) {
    super(id, context, "CtcItemRatingReasonFind");
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
        mapArray[i] = CtcItemRatingReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcItemRatingReason", noOpIn);
      }
      addInput("CtcItemRatingReason", mapList);
    }
  }
/**
 *
 * Sets the  CtcItemRatingReason
 * @param noOpInIn CtcItemRatingReasonObjectDataList to set
 *
 */
  public void setCtcItemRatingReason(CtcItemRatingReasonObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcItemRatingReason passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemRatingReasonObjectDataList getCtcItemRatingReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcItemRatingReasonObjectHelper.fromMapList(inputMap, "CtcItemRatingReasonList");
  }
}
