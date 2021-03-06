/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExchangeRateClassFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ExchangeRateClassFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExchangeRateClassFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExchangeRateClassObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ExchangeRateClassFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExchangeRateClassFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExchangeRateClassObjectDataList noOpInIn) {
    super(id, context, "ExchangeRateClassFind");
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
        mapArray[i] = ExchangeRateClassObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExchangeRateClass", noOpIn);
      }
      addInput("ExchangeRateClass", mapList);
    }
  }
/**
 *
 * Sets the  ExchangeRateClass
 * @param noOpInIn ExchangeRateClassObjectDataList to set
 *
 */
  public void setExchangeRateClass(ExchangeRateClassObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExchangeRateClass passed into the constructor
 * @return Simulated response
 *
 */
  public ExchangeRateClassObjectDataList getExchangeRateClass() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ExchangeRateClassObjectHelper.fromMapList(inputMap, "ExchangeRateClassList");
  }
}
