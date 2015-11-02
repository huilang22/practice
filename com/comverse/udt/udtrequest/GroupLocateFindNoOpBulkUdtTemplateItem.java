/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupLocateFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GroupLocateFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GroupLocateFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GroupLocateObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GroupLocateFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GroupLocateFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupLocateObjectDataList noOpInIn) {
    super(id, context, "GroupLocateFind");
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
        mapArray[i] = GroupLocateObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GroupLocate", noOpIn);
      }
      addInput("GroupLocate", mapList);
    }
  }
/**
 *
 * Sets the  GroupLocate
 * @param noOpInIn GroupLocateObjectDataList to set
 *
 */
  public void setGroupLocate(GroupLocateObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GroupLocate passed into the constructor
 * @return Simulated response
 *
 */
  public GroupLocateObjectDataList getGroupLocate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GroupLocateObjectHelper.fromMapList(inputMap, "GroupLocateList");
  }
}
