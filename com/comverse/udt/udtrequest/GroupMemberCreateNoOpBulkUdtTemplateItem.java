/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupMemberCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GroupMemberCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GroupMemberCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GroupMemberObjectData noOpIn;

/**
 *
 * Constructor to create a   GroupMemberCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GroupMemberCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupMemberObjectData noOpInIn) {
    super(id, context, "GroupMemberCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GroupMember", GroupMemberObjectHelper.toMap(noOpIn, new HashMap(), "GroupMember").get("GroupMember"));
    }
  }
/**
 *
 * Sets the  GroupMember
 * @param noOpInIn GroupMemberObjectData to set
 *
 */
  public void setGroupMember(GroupMemberObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GroupMember passed into the constructor
 * @return Simulated response
 *
 */
  public GroupMemberObjectData getGroupMember() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GroupMemberObjectHelper.fromMap(inputMap, "GroupMember");
  }
}
