/*
 * Generated code DO NOT EDIT
 * Generated file: GroupCreateBulkUdtTemplateItem.java
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
 * Class used to create a GroupCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GroupCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GroupObjectData GcreateIn;
/**
 *
 * Constructor to create a  GroupCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GroupCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupObjectData GcreateInIn) {
    super(id, context, "GroupCreate");
    GcreateIn = GcreateInIn;
  }

  public void translateToMap() {
    if (GcreateIn != null) {
      GcreateIn.resetFlags(true, true);
      addInput("Group", GroupObjectHelper.toMap(GcreateIn, new HashMap(), "Group").get("Group"));
    }
  }


/**
 *
 * Sets the Group
 * @param GcreateInIn Value of the GcreateIn
 *
 */

  public void setGroup(GroupObjectData GcreateInIn) {
    GcreateIn = GcreateInIn;
  }

  public void translateFromMap() {
    GcreateIn = GroupObjectHelper.fromMap(inputMap, "Group");
  }

/**
 *
 * Gets the Group
 * @return Value of the Group
 *
 */

  public GroupObjectData getGroup( ) {
    return GcreateIn;
  }

}
