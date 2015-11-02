/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSubjMatterRatingFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSubjMatterRatingFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSubjMatterRatingFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSubjMatterRatingObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsSubjMatterRatingFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSubjMatterRatingFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSubjMatterRatingObjectDataList noOpInIn) {
    super(id, context, "InvsSubjMatterRatingFind");
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
        mapArray[i] = InvsSubjMatterRatingObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSubjMatterRating", noOpIn);
      }
      addInput("InvsSubjMatterRating", mapList);
    }
  }
/**
 *
 * Sets the  InvsSubjMatterRating
 * @param noOpInIn InvsSubjMatterRatingObjectDataList to set
 *
 */
  public void setInvsSubjMatterRating(InvsSubjMatterRatingObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSubjMatterRating passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSubjMatterRatingObjectDataList getInvsSubjMatterRating() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSubjMatterRatingObjectHelper.fromMapList(inputMap, "InvsSubjMatterRatingList");
  }
}
