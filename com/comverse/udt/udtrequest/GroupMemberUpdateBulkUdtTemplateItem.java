/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupMemberUpdateBulkUdtTemplateItem.java
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
 * Class used to create a GroupMemberUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GroupMemberUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GroupMemberObjectData GMupdateIn;
/**
 *
 * Constructor to create a  GroupMemberUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GroupMemberUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupMemberObjectData GMupdateInIn) {
    super(id, context, "GroupMemberUpdate");
    GMupdateIn = GMupdateInIn;
  }

  public void translateToMap() {
    if (GMupdateIn != null) {
      GMupdateIn.resetFlags(true, true);
      addInput("GroupMember", GroupMemberObjectHelper.toMap(GMupdateIn, new HashMap(), "GroupMember").get("GroupMember"));
    }
  }


/**
 *
 * Sets the GroupMember
 * @param GMupdateInIn Value of the GMupdateIn
 *
 */

  public void setGroupMember(GroupMemberObjectData GMupdateInIn) {
    GMupdateIn = GMupdateInIn;
  }

  public void translateFromMap() {
    GMupdateIn = GroupMemberObjectHelper.fromMap(inputMap, "GroupMember");
  }

/**
 *
 * Gets the GroupMember
 * @return Value of the GroupMember
 *
 */

  public GroupMemberObjectData getGroupMember( ) {
    return GMupdateIn;
  }

}
