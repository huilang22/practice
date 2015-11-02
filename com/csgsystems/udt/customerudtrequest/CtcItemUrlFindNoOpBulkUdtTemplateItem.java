/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemUrlFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcItemUrlFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcItemUrlFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcItemUrlObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcItemUrlFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcItemUrlFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemUrlObjectDataList noOpInIn) {
    super(id, context, "CtcItemUrlFind");
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
        mapArray[i] = CtcItemUrlObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcItemUrl", noOpIn);
      }
      addInput("CtcItemUrl", mapList);
    }
  }
/**
 *
 * Sets the  CtcItemUrl
 * @param noOpInIn CtcItemUrlObjectDataList to set
 *
 */
  public void setCtcItemUrl(CtcItemUrlObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcItemUrl passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemUrlObjectDataList getCtcItemUrl() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcItemUrlObjectHelper.fromMapList(inputMap, "CtcItemUrlList");
  }
}
