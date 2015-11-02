/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeGroupFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageTypeGroupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageTypeGroupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageTypeGroupObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UsageTypeGroupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageTypeGroupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeGroupObjectDataList noOpInIn) {
    super(id, context, "UsageTypeGroupFind");
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
        mapArray[i] = UsageTypeGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageTypeGroup", noOpIn);
      }
      addInput("UsageTypeGroup", mapList);
    }
  }
/**
 *
 * Sets the  UsageTypeGroup
 * @param noOpInIn UsageTypeGroupObjectDataList to set
 *
 */
  public void setUsageTypeGroup(UsageTypeGroupObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageTypeGroup passed into the constructor
 * @return Simulated response
 *
 */
  public UsageTypeGroupObjectDataList getUsageTypeGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageTypeGroupObjectHelper.fromMapList(inputMap, "UsageTypeGroupList");
  }
}
