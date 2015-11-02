/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferCategoryFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferCategoryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferCategoryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferCategoryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcOfferCategoryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferCategoryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferCategoryObjectDataList noOpInIn) {
    super(id, context, "CtcOfferCategoryFind");
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
        mapArray[i] = CtcOfferCategoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcOfferCategory", noOpIn);
      }
      addInput("CtcOfferCategory", mapList);
    }
  }
/**
 *
 * Sets the  CtcOfferCategory
 * @param noOpInIn CtcOfferCategoryObjectDataList to set
 *
 */
  public void setCtcOfferCategory(CtcOfferCategoryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOfferCategory passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferCategoryObjectDataList getCtcOfferCategory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferCategoryObjectHelper.fromMapList(inputMap, "CtcOfferCategoryList");
  }
}
