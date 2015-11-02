/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqGroupsFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupsFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupsObjectDataList noOpIn;

/**
 *
 * Constructor to create a   HqGroupsFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupsFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupsObjectDataList noOpInIn) {
    super(id, context, "HqGroupsFind");
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
        mapArray[i] = HqGroupsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HqGroups", noOpIn);
      }
      addInput("HqGroups", mapList);
    }
  }
/**
 *
 * Sets the  HqGroups
 * @param noOpInIn HqGroupsObjectDataList to set
 *
 */
  public void setHqGroups(HqGroupsObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqGroups passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupsObjectDataList getHqGroups() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupsObjectHelper.fromMapList(inputMap, "HqGroupsList");
  }
}
