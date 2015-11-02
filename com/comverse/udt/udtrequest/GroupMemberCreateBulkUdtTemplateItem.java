/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupMemberCreateBulkUdtTemplateItem.java
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
 * Class used to create a GroupMemberCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GroupMemberCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GroupMemberObjectData GMcreateIn;
/**
 *
 * Constructor to create a  GroupMemberCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GroupMemberCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupMemberObjectData GMcreateInIn) {
    super(id, context, "GroupMemberCreate");
    GMcreateIn = GMcreateInIn;
  }

  public void translateToMap() {
    if (GMcreateIn != null) {
      GMcreateIn.resetFlags(true, true);
      addInput("GroupMember", GroupMemberObjectHelper.toMap(GMcreateIn, new HashMap(), "GroupMember").get("GroupMember"));
    }
  }


/**
 *
 * Sets the GroupMember
 * @param GMcreateInIn Value of the GMcreateIn
 *
 */

  public void setGroupMember(GroupMemberObjectData GMcreateInIn) {
    GMcreateIn = GMcreateInIn;
  }

  public void translateFromMap() {
    GMcreateIn = GroupMemberObjectHelper.fromMap(inputMap, "GroupMember");
  }

/**
 *
 * Gets the GroupMember
 * @return Value of the GroupMember
 *
 */

  public GroupMemberObjectData getGroupMember( ) {
    return GMcreateIn;
  }

}
