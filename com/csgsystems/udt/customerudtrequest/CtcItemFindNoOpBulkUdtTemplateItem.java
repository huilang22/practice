/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcItemFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcItemFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcItemObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcItemFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcItemFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemObjectDataList noOpInIn) {
    super(id, context, "CtcItemFind");
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
        mapArray[i] = CtcItemObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcItem", noOpIn);
      }
      addInput("CtcItem", mapList);
    }
  }
/**
 *
 * Sets the  CtcItem
 * @param noOpInIn CtcItemObjectDataList to set
 *
 */
  public void setCtcItem(CtcItemObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcItem passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemObjectDataList getCtcItem() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcItemObjectHelper.fromMapList(inputMap, "CtcItemList");
  }
}
