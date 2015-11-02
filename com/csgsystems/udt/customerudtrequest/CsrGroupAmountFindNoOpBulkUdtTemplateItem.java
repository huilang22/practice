/*
 * Generated code DO NOT EDIT
 * Generated file: CsrGroupAmountFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a CsrGroupAmountFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CsrGroupAmountFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CsrGroupAmountObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CsrGroupAmountFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CsrGroupAmountFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrGroupAmountObjectDataList noOpInIn) {
    super(id, context, "CsrGroupAmountFind");
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
        mapArray[i] = CsrGroupAmountObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CsrGroupAmount", noOpIn);
      }
      addInput("CsrGroupAmount", mapList);
    }
  }
/**
 *
 * Sets the  CsrGroupAmount
 * @param noOpInIn CsrGroupAmountObjectDataList to set
 *
 */
  public void setCsrGroupAmount(CsrGroupAmountObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CsrGroupAmount passed into the constructor
 * @return Simulated response
 *
 */
  public CsrGroupAmountObjectDataList getCsrGroupAmount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CsrGroupAmountObjectHelper.fromMapList(inputMap, "CsrGroupAmountList");
  }
}
