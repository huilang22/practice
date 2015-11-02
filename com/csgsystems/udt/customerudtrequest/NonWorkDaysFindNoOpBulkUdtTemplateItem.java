/*
 * Generated code DO NOT EDIT
 * Generated file: NonWorkDaysFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a NonWorkDaysFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NonWorkDaysFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NonWorkDaysObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NonWorkDaysFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NonWorkDaysFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NonWorkDaysObjectDataList noOpInIn) {
    super(id, context, "NonWorkDaysFind");
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
        mapArray[i] = NonWorkDaysObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NonWorkDays", noOpIn);
      }
      addInput("NonWorkDays", mapList);
    }
  }
/**
 *
 * Sets the  NonWorkDays
 * @param noOpInIn NonWorkDaysObjectDataList to set
 *
 */
  public void setNonWorkDays(NonWorkDaysObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NonWorkDays passed into the constructor
 * @return Simulated response
 *
 */
  public NonWorkDaysObjectDataList getNonWorkDays() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NonWorkDaysObjectHelper.fromMapList(inputMap, "NonWorkDaysList");
  }
}
