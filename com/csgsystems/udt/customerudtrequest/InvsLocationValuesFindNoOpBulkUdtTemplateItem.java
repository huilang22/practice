/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationValuesFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsLocationValuesFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLocationValuesFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLocationValuesObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsLocationValuesFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLocationValuesFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationValuesObjectDataList noOpInIn) {
    super(id, context, "InvsLocationValuesFind");
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
        mapArray[i] = InvsLocationValuesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLocationValues", noOpIn);
      }
      addInput("InvsLocationValues", mapList);
    }
  }
/**
 *
 * Sets the  InvsLocationValues
 * @param noOpInIn InvsLocationValuesObjectDataList to set
 *
 */
  public void setInvsLocationValues(InvsLocationValuesObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLocationValues passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationValuesObjectDataList getInvsLocationValues() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLocationValuesObjectHelper.fromMapList(inputMap, "InvsLocationValuesList");
  }
}
