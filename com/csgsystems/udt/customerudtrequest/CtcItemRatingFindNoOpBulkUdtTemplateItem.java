/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemRatingFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcItemRatingFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcItemRatingFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcItemRatingObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcItemRatingFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcItemRatingFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemRatingObjectDataList noOpInIn) {
    super(id, context, "CtcItemRatingFind");
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
        mapArray[i] = CtcItemRatingObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcItemRating", noOpIn);
      }
      addInput("CtcItemRating", mapList);
    }
  }
/**
 *
 * Sets the  CtcItemRating
 * @param noOpInIn CtcItemRatingObjectDataList to set
 *
 */
  public void setCtcItemRating(CtcItemRatingObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcItemRating passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemRatingObjectDataList getCtcItemRating() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcItemRatingObjectHelper.fromMapList(inputMap, "CtcItemRatingList");
  }
}
