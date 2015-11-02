/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsagePointFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsagePointFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsgPntObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UsagePointFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsagePointFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsgPntObjectDataList noOpInIn) {
    super(id, context, "UsagePointFind");
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
        mapArray[i] = UsgPntObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsagePoint", noOpIn);
      }
      addInput("UsagePoint", mapList);
    }
  }
/**
 *
 * Sets the  UsagePoint
 * @param noOpInIn UsgPntObjectDataList to set
 *
 */
  public void setUsagePoint(UsgPntObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsagePoint passed into the constructor
 * @return Simulated response
 *
 */
  public UsgPntObjectDataList getUsagePoint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsgPntObjectHelper.fromMapList(inputMap, "UsagePointList");
  }
}
