/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ActivityDefFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a ActivityDefFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ActivityDefFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ActivityDefObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ActivityDefFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ActivityDefFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ActivityDefObjectDataList noOpInIn) {
    super(id, context, "ActivityDefFind");
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
        mapArray[i] = ActivityDefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ActivityDef", noOpIn);
      }
      addInput("ActivityDef", mapList);
    }
  }
/**
 *
 * Sets the  ActivityDef
 * @param noOpInIn ActivityDefObjectDataList to set
 *
 */
  public void setActivityDef(ActivityDefObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ActivityDef passed into the constructor
 * @return Simulated response
 *
 */
  public ActivityDefObjectDataList getActivityDef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ActivityDefObjectHelper.fromMapList(inputMap, "ActivityDefList");
  }
}
