/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcRatingTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcRatingTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcRatingTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcRatingTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcRatingTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingTypeObjectDataList noOpInIn) {
    super(id, context, "CtcRatingTypeFind");
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
        mapArray[i] = CtcRatingTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcRatingType", noOpIn);
      }
      addInput("CtcRatingType", mapList);
    }
  }
/**
 *
 * Sets the  CtcRatingType
 * @param noOpInIn CtcRatingTypeObjectDataList to set
 *
 */
  public void setCtcRatingType(CtcRatingTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcRatingType passed into the constructor
 * @return Simulated response
 *
 */
  public CtcRatingTypeObjectDataList getCtcRatingType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcRatingTypeObjectHelper.fromMapList(inputMap, "CtcRatingTypeList");
  }
}
