/*
 * Generated code DO NOT EDIT
 * Generated file: InvsOperatorFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsOperatorFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsOperatorFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsOperatorObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsOperatorFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsOperatorFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsOperatorObjectDataList noOpInIn) {
    super(id, context, "InvsOperatorFind");
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
        mapArray[i] = InvsOperatorObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsOperator", noOpIn);
      }
      addInput("InvsOperator", mapList);
    }
  }
/**
 *
 * Sets the  InvsOperator
 * @param noOpInIn InvsOperatorObjectDataList to set
 *
 */
  public void setInvsOperator(InvsOperatorObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsOperator passed into the constructor
 * @return Simulated response
 *
 */
  public InvsOperatorObjectDataList getInvsOperator() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsOperatorObjectHelper.fromMapList(inputMap, "InvsOperatorList");
  }
}
