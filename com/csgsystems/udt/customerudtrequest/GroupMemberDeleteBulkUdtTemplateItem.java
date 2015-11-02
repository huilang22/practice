/*
 * Generated code DO NOT EDIT
 * Generated file: GroupMemberDeleteBulkUdtTemplateItem.java
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
 * Class used to create a GroupMemberDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class GroupMemberDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GroupMemberObjectKeyData GMdeleteIn;
  protected Date GMInactiveDate;
/**
 *
 * Constructor to create a  GroupMemberDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GroupMemberDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupMemberObjectKeyData GMdeleteInIn, Date GMInactiveDateIn) {
    super(id, context, "GroupMemberDelete");
    GMdeleteIn = GMdeleteInIn;
    GMInactiveDate = GMInactiveDateIn;
  }

  public void translateToMap() {
    if (GMdeleteIn != null) {
      GMdeleteIn.resetFlags(true, true);
      addInput("GroupMember", GroupMemberObjectKeyHelper.toMap(GMdeleteIn, new HashMap(), "GroupMemberObjectKeyData").get("GroupMemberObjectKeyData"));
    }
    if (GMInactiveDate != null) {
      addInput("InactiveDate", GMInactiveDate);
    }
  }


/**
 *
 * Sets the GroupMember
 * @param GMdeleteInIn Value of the GMdeleteIn
 *
 */

  public void setGroupMember(GroupMemberObjectKeyData GMdeleteInIn) {
    GMdeleteIn = GMdeleteInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param GMInactiveDateIn Value of the GMInactiveDate
 *
 */

  public void setInactiveDate(Date GMInactiveDateIn) {
    GMInactiveDate = GMInactiveDateIn;
  }

  public void translateFromMap() {
    GMdeleteIn = GroupMemberObjectKeyHelper.fromMap(inputMap, "GroupMember");
    GMInactiveDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the GroupMember
 * @return Value of the GroupMember
 *
 */

  public GroupMemberObjectKeyData getGroupMember( ) {
    return GMdeleteIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return GMInactiveDate;
  }

}
