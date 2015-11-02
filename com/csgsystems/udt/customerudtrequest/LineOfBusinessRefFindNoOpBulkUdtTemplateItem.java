/*
 * Generated code DO NOT EDIT
 * Generated file: LineOfBusinessRefFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LineOfBusinessRefFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LineOfBusinessRefFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LineOfBusinessRefObjectDataList noOpIn;

/**
 *
 * Constructor to create a   LineOfBusinessRefFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LineOfBusinessRefFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LineOfBusinessRefObjectDataList noOpInIn) {
    super(id, context, "LineOfBusinessRefFind");
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
        mapArray[i] = LineOfBusinessRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("LineOfBusinessRef", noOpIn);
      }
      addInput("LineOfBusinessRef", mapList);
    }
  }
/**
 *
 * Sets the  LineOfBusinessRef
 * @param noOpInIn LineOfBusinessRefObjectDataList to set
 *
 */
  public void setLineOfBusinessRef(LineOfBusinessRefObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LineOfBusinessRef passed into the constructor
 * @return Simulated response
 *
 */
  public LineOfBusinessRefObjectDataList getLineOfBusinessRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LineOfBusinessRefObjectHelper.fromMapList(inputMap, "LineOfBusinessRefList");
  }
}
