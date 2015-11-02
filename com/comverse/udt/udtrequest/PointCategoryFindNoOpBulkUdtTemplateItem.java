/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointCategoryFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PointCategoryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PointCategoryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PointCategoryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PointCategoryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PointCategoryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PointCategoryObjectDataList noOpInIn) {
    super(id, context, "PointCategoryFind");
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
        mapArray[i] = PointCategoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PointCategory", noOpIn);
      }
      addInput("PointCategory", mapList);
    }
  }
/**
 *
 * Sets the  PointCategory
 * @param noOpInIn PointCategoryObjectDataList to set
 *
 */
  public void setPointCategory(PointCategoryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PointCategory passed into the constructor
 * @return Simulated response
 *
 */
  public PointCategoryObjectDataList getPointCategory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PointCategoryObjectHelper.fromMapList(inputMap, "PointCategoryList");
  }
}
