/*
 * Generated code DO NOT EDIT
 * Generated file: CitImportanceFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitImportanceFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitImportanceFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitImportanceObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CitImportanceFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitImportanceFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitImportanceObjectDataList noOpInIn) {
    super(id, context, "CitImportanceFind");
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
        mapArray[i] = CitImportanceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CitImportance", noOpIn);
      }
      addInput("CitImportance", mapList);
    }
  }
/**
 *
 * Sets the  CitImportance
 * @param noOpInIn CitImportanceObjectDataList to set
 *
 */
  public void setCitImportance(CitImportanceObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitImportance passed into the constructor
 * @return Simulated response
 *
 */
  public CitImportanceObjectDataList getCitImportance() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitImportanceObjectHelper.fromMapList(inputMap, "CitImportanceList");
  }
}
