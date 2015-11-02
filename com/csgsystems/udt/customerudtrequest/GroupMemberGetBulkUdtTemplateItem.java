/*
 * Generated code DO NOT EDIT
 * Generated file: GroupMemberGetBulkUdtTemplateItem.java
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
 * Class used to create a GroupMemberGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GroupMemberGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GroupMemberObjectKeyData GMgetIn;
/**
 *
 * Constructor to create a  GroupMemberGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GroupMemberGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupMemberObjectKeyData GMgetInIn) {
    super(id, context, "GroupMemberGet");
    GMgetIn = GMgetInIn;
  }

  public void translateToMap() {
    if (GMgetIn != null) {
      GMgetIn.resetFlags(true, true);
      addInput("GroupMember", GroupMemberObjectKeyHelper.toMap(GMgetIn, new HashMap(), "GroupMemberObjectKeyData").get("GroupMemberObjectKeyData"));
    }
  }


/**
 *
 * Sets the GroupMember
 * @param GMgetInIn Value of the GMgetIn
 *
 */

  public void setGroupMember(GroupMemberObjectKeyData GMgetInIn) {
    GMgetIn = GMgetInIn;
  }

  public void translateFromMap() {
    GMgetIn = GroupMemberObjectKeyHelper.fromMap(inputMap, "GroupMember");
  }

/**
 *
 * Gets the GroupMember
 * @return Value of the GroupMember
 *
 */

  public GroupMemberObjectKeyData getGroupMember( ) {
    return GMgetIn;
  }

}
