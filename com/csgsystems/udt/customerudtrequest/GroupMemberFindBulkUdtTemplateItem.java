/*
 * Generated code DO NOT EDIT
 * Generated file: GroupMemberFindBulkUdtTemplateItem.java
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
 * Class used to create a GroupMemberFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GroupMemberFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GroupMemberObjectFilter GMfindIn;
/**
 *
 * Constructor to create a  GroupMemberFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GroupMemberFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupMemberObjectFilter GMfindInIn) {
    super(id, context, "GroupMemberFind");
    GMfindIn = GMfindInIn;
  }

  public void translateToMap() {
    if (GMfindIn != null) {
      Integer index =  GMfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GroupMember", GroupMemberObjectHelper.toMap(GMfindIn, new HashMap(), "GroupMember").get("GroupMember"));
    }
  }


/**
 *
 * Sets the GroupMember
 * @param GMfindInIn Value of the GMfindIn
 *
 */

  public void setGroupMember(GroupMemberObjectFilter GMfindInIn) {
    GMfindIn = GMfindInIn;
  }

  public void translateFromMap() {
    GMfindIn = GroupMemberObjectHelper.fromMapFilter(inputMap, "GroupMember");
  }

/**
 *
 * Gets the GroupMember
 * @return Value of the GroupMember
 *
 */

  public GroupMemberObjectFilter getGroupMember( ) {
    return GMfindIn;
  }

}
