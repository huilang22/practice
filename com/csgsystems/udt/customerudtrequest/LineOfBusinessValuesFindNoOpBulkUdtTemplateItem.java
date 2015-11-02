/*
 * Generated code DO NOT EDIT
 * Generated file: LineOfBusinessValuesFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LineOfBusinessValuesFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LineOfBusinessValuesFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LineOfBusinessValuesObjectDataList noOpIn;

/**
 *
 * Constructor to create a   LineOfBusinessValuesFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LineOfBusinessValuesFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LineOfBusinessValuesObjectDataList noOpInIn) {
    super(id, context, "LineOfBusinessValuesFind");
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
        mapArray[i] = LineOfBusinessValuesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("LineOfBusinessValues", noOpIn);
      }
      addInput("LineOfBusinessValues", mapList);
    }
  }
/**
 *
 * Sets the  LineOfBusinessValues
 * @param noOpInIn LineOfBusinessValuesObjectDataList to set
 *
 */
  public void setLineOfBusinessValues(LineOfBusinessValuesObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LineOfBusinessValues passed into the constructor
 * @return Simulated response
 *
 */
  public LineOfBusinessValuesObjectDataList getLineOfBusinessValues() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LineOfBusinessValuesObjectHelper.fromMapList(inputMap, "LineOfBusinessValuesList");
  }
}
