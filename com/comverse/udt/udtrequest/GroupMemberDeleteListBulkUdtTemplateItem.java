/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupMemberDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a GroupMemberDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class GroupMemberDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GroupMemberObjectFilter GMLdeleteIn;
  protected Date GMLInactiveDate;
/**
 *
 * Constructor to create a  GroupMemberDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GroupMemberDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupMemberObjectFilter GMLdeleteInIn, Date GMLInactiveDateIn) {
    super(id, context, "GroupMemberDeleteList");
    GMLdeleteIn = GMLdeleteInIn;
    GMLInactiveDate = GMLInactiveDateIn;
  }

  public void translateToMap() {
    if (GMLdeleteIn != null) {
      Integer index =  GMLdeleteIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GroupMember", GroupMemberObjectHelper.toMap(GMLdeleteIn, new HashMap(), "Void").get("Void"));
    }
    if (GMLInactiveDate != null) {
      addInput("InactiveDate", GMLInactiveDate);
    }
  }


/**
 *
 * Sets the GroupMember
 * @param GMLdeleteInIn Value of the GMLdeleteIn
 *
 */

  public void setGroupMember(GroupMemberObjectFilter GMLdeleteInIn) {
    GMLdeleteIn = GMLdeleteInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param GMLInactiveDateIn Value of the GMLInactiveDate
 *
 */

  public void setInactiveDate(Date GMLInactiveDateIn) {
    GMLInactiveDate = GMLInactiveDateIn;
  }

  public void translateFromMap() {
    GMLdeleteIn = GroupMemberObjectHelper.fromMapFilter(inputMap, "GroupMember");
    GMLInactiveDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the GroupMember
 * @return Value of the GroupMember
 *
 */

  public GroupMemberObjectFilter getGroupMember( ) {
    return GMLdeleteIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return GMLInactiveDate;
  }

}
