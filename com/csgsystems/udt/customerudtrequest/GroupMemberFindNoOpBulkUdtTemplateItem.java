/*
 * Generated code DO NOT EDIT
 * Generated file: GroupMemberFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GroupMemberFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GroupMemberFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GroupMemberObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GroupMemberFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GroupMemberFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupMemberObjectDataList noOpInIn) {
    super(id, context, "GroupMemberFind");
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
        mapArray[i] = GroupMemberObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GroupMember", noOpIn);
      }
      addInput("GroupMember", mapList);
    }
  }
/**
 *
 * Sets the  GroupMember
 * @param noOpInIn GroupMemberObjectDataList to set
 *
 */
  public void setGroupMember(GroupMemberObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GroupMember passed into the constructor
 * @return Simulated response
 *
 */
  public GroupMemberObjectDataList getGroupMember() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GroupMemberObjectHelper.fromMapList(inputMap, "GroupMemberList");
  }
}
