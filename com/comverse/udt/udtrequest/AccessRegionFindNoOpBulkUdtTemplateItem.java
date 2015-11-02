/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccessRegionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccessRegionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccessRegionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccessRegionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccessRegionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccessRegionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccessRegionObjectDataList noOpInIn) {
    super(id, context, "AccessRegionFind");
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
        mapArray[i] = AccessRegionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccessRegion", noOpIn);
      }
      addInput("AccessRegion", mapList);
    }
  }
/**
 *
 * Sets the  AccessRegion
 * @param noOpInIn AccessRegionObjectDataList to set
 *
 */
  public void setAccessRegion(AccessRegionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccessRegion passed into the constructor
 * @return Simulated response
 *
 */
  public AccessRegionObjectDataList getAccessRegion() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccessRegionObjectHelper.fromMapList(inputMap, "AccessRegionList");
  }
}
