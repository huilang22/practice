/*
 * Generated code DO NOT EDIT
 * Generated file: RbrSymbolFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a RbrSymbolFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrSymbolFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrSymbolObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RbrSymbolFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrSymbolFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrSymbolObjectDataList noOpInIn) {
    super(id, context, "RbrSymbolFind");
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
        mapArray[i] = RbrSymbolObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrSymbol", noOpIn);
      }
      addInput("RbrSymbol", mapList);
    }
  }
/**
 *
 * Sets the  RbrSymbol
 * @param noOpInIn RbrSymbolObjectDataList to set
 *
 */
  public void setRbrSymbol(RbrSymbolObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrSymbol passed into the constructor
 * @return Simulated response
 *
 */
  public RbrSymbolObjectDataList getRbrSymbol() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrSymbolObjectHelper.fromMapList(inputMap, "RbrSymbolList");
  }
}
