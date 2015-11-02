/*
 * Generated code DO NOT EDIT
 * Generated file: InvsStockPropConfigFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsStockPropConfigFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsStockPropConfigFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsStockPropConfigObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsStockPropConfigFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsStockPropConfigFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStockPropConfigObjectDataList noOpInIn) {
    super(id, context, "InvsStockPropConfigFind");
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
        mapArray[i] = InvsStockPropConfigObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsStockPropConfig", noOpIn);
      }
      addInput("InvsStockPropConfig", mapList);
    }
  }
/**
 *
 * Sets the  InvsStockPropConfig
 * @param noOpInIn InvsStockPropConfigObjectDataList to set
 *
 */
  public void setInvsStockPropConfig(InvsStockPropConfigObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsStockPropConfig passed into the constructor
 * @return Simulated response
 *
 */
  public InvsStockPropConfigObjectDataList getInvsStockPropConfig() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsStockPropConfigObjectHelper.fromMapList(inputMap, "InvsStockPropConfigList");
  }
}
