/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTypeParameterFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchTypeParameterFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchTypeParameterFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchTypeParameterObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchTypeParameterFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchTypeParameterFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeParameterObjectDataList noOpInIn) {
    super(id, context, "BatchTypeParameterFind");
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
        mapArray[i] = BatchTypeParameterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchTypeParameter", noOpIn);
      }
      addInput("BatchTypeParameter", mapList);
    }
  }
/**
 *
 * Sets the  BatchTypeParameter
 * @param noOpInIn BatchTypeParameterObjectDataList to set
 *
 */
  public void setBatchTypeParameter(BatchTypeParameterObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchTypeParameter passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeParameterObjectDataList getBatchTypeParameter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchTypeParameterObjectHelper.fromMapList(inputMap, "BatchTypeParameterList");
  }
}
