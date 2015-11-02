/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointRegionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PointRegionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PointRegionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PointRegionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PointRegionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PointRegionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PointRegionObjectDataList noOpInIn) {
    super(id, context, "PointRegionFind");
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
        mapArray[i] = PointRegionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PointRegion", noOpIn);
      }
      addInput("PointRegion", mapList);
    }
  }
/**
 *
 * Sets the  PointRegion
 * @param noOpInIn PointRegionObjectDataList to set
 *
 */
  public void setPointRegion(PointRegionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PointRegion passed into the constructor
 * @return Simulated response
 *
 */
  public PointRegionObjectDataList getPointRegion() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PointRegionObjectHelper.fromMapList(inputMap, "PointRegionList");
  }
}
