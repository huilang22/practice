/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a HqgroupUsageRedirectMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqgroupUsageRedirectMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupUsageRedirectMapObjectDataList noOpIn;

/**
 *
 * Constructor to create a   HqgroupUsageRedirectMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqgroupUsageRedirectMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectMapObjectDataList noOpInIn) {
    super(id, context, "HqgroupUsageRedirectMapFind");
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
        mapArray[i] = HqGroupUsageRedirectMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HqgroupUsageRedirectMap", noOpIn);
      }
      addInput("HqgroupUsageRedirectMap", mapList);
    }
  }
/**
 *
 * Sets the  HqgroupUsageRedirectMap
 * @param noOpInIn HqGroupUsageRedirectMapObjectDataList to set
 *
 */
  public void setHqgroupUsageRedirectMap(HqGroupUsageRedirectMapObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqgroupUsageRedirectMap passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupUsageRedirectMapObjectDataList getHqgroupUsageRedirectMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupUsageRedirectMapObjectHelper.fromMapList(inputMap, "HqgroupUsageRedirectMapList");
  }
}
