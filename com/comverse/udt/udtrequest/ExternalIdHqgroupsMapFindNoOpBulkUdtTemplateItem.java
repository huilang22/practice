/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdHqgroupsMapFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExternalIdHqgroupsMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExternalIdHqgroupsMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EIHGMObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ExternalIdHqgroupsMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExternalIdHqgroupsMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EIHGMObjectDataList noOpInIn) {
    super(id, context, "ExternalIdHqgroupsMapFind");
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
        mapArray[i] = EIHGMObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExternalIdHqGroupsMap", noOpIn);
      }
      addInput("ExternalIdHqGroupsMap", mapList);
    }
  }
/**
 *
 * Sets the  ExternalIdHqGroupsMap
 * @param noOpInIn EIHGMObjectDataList to set
 *
 */
  public void setExternalIdHqGroupsMap(EIHGMObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExternalIdHqGroupsMap passed into the constructor
 * @return Simulated response
 *
 */
  public EIHGMObjectDataList getExternalIdHqGroupsMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EIHGMObjectHelper.fromMapList(inputMap, "ExternalIdHqGroupsMapList");
  }
}
