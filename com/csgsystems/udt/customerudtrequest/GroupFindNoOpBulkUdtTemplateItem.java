/*
 * Generated code DO NOT EDIT
 * Generated file: GroupFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a GroupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GroupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GroupObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GroupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GroupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupObjectDataList noOpInIn) {
    super(id, context, "GroupFind");
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
        mapArray[i] = GroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Group", noOpIn);
      }
      addInput("Group", mapList);
    }
  }
/**
 *
 * Sets the  Group
 * @param noOpInIn GroupObjectDataList to set
 *
 */
  public void setGroup(GroupObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Group passed into the constructor
 * @return Simulated response
 *
 */
  public GroupObjectDataList getGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GroupObjectHelper.fromMapList(inputMap, "GroupList");
  }
}
