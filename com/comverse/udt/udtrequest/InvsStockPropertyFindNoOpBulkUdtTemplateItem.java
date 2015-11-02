/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropertyFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsStockPropertyFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsStockPropertyFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsStockPropertyObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsStockPropertyFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsStockPropertyFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStockPropertyObjectDataList noOpInIn) {
    super(id, context, "InvsStockPropertyFind");
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
        mapArray[i] = InvsStockPropertyObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsStockProperty", noOpIn);
      }
      addInput("InvsStockProperty", mapList);
    }
  }
/**
 *
 * Sets the  InvsStockProperty
 * @param noOpInIn InvsStockPropertyObjectDataList to set
 *
 */
  public void setInvsStockProperty(InvsStockPropertyObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsStockProperty passed into the constructor
 * @return Simulated response
 *
 */
  public InvsStockPropertyObjectDataList getInvsStockProperty() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsStockPropertyObjectHelper.fromMapList(inputMap, "InvsStockPropertyList");
  }
}
