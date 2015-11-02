/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointClassFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a PointClassFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PointClassFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PointClassObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PointClassFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PointClassFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PointClassObjectDataList noOpInIn) {
    super(id, context, "PointClassFind");
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
        mapArray[i] = PointClassObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PointClass", noOpIn);
      }
      addInput("PointClass", mapList);
    }
  }
/**
 *
 * Sets the  PointClass
 * @param noOpInIn PointClassObjectDataList to set
 *
 */
  public void setPointClass(PointClassObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PointClass passed into the constructor
 * @return Simulated response
 *
 */
  public PointClassObjectDataList getPointClass() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PointClassObjectHelper.fromMapList(inputMap, "PointClassList");
  }
}
