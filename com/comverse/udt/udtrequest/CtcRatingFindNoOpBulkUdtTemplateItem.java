/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcRatingFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcRatingFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcRatingObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcRatingFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcRatingFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingObjectDataList noOpInIn) {
    super(id, context, "CtcRatingFind");
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
        mapArray[i] = CtcRatingObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcRating", noOpIn);
      }
      addInput("CtcRating", mapList);
    }
  }
/**
 *
 * Sets the  CtcRating
 * @param noOpInIn CtcRatingObjectDataList to set
 *
 */
  public void setCtcRating(CtcRatingObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcRating passed into the constructor
 * @return Simulated response
 *
 */
  public CtcRatingObjectDataList getCtcRating() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcRatingObjectHelper.fromMapList(inputMap, "CtcRatingList");
  }
}
