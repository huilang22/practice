/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a BusinessDayFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BusinessDayFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BusinessDayObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BusinessDayFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BusinessDayFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BusinessDayObjectDataList noOpInIn) {
    super(id, context, "BusinessDayFind");
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
        mapArray[i] = BusinessDayObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BusinessDay", noOpIn);
      }
      addInput("BusinessDay", mapList);
    }
  }
/**
 *
 * Sets the  BusinessDay
 * @param noOpInIn BusinessDayObjectDataList to set
 *
 */
  public void setBusinessDay(BusinessDayObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BusinessDay passed into the constructor
 * @return Simulated response
 *
 */
  public BusinessDayObjectDataList getBusinessDay() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BusinessDayObjectHelper.fromMapList(inputMap, "BusinessDayList");
  }
}
