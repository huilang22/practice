/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeSplitFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageTypeSplitFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageTypeSplitFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageTypeSplitObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UsageTypeSplitFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageTypeSplitFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeSplitObjectDataList noOpInIn) {
    super(id, context, "UsageTypeSplitFind");
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
        mapArray[i] = UsageTypeSplitObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageTypeSplit", noOpIn);
      }
      addInput("UsageTypeSplit", mapList);
    }
  }
/**
 *
 * Sets the  UsageTypeSplit
 * @param noOpInIn UsageTypeSplitObjectDataList to set
 *
 */
  public void setUsageTypeSplit(UsageTypeSplitObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageTypeSplit passed into the constructor
 * @return Simulated response
 *
 */
  public UsageTypeSplitObjectDataList getUsageTypeSplit() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageTypeSplitObjectHelper.fromMapList(inputMap, "UsageTypeSplitList");
  }
}
