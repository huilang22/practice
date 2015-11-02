/*
 * Generated code DO NOT EDIT
 * Generated file: GroupGetBulkUdtTemplateItem.java
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
 * Class used to create a GroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GroupObjectKeyData GgetIn;
/**
 *
 * Constructor to create a  GroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupObjectKeyData GgetInIn) {
    super(id, context, "GroupGet");
    GgetIn = GgetInIn;
  }

  public void translateToMap() {
    if (GgetIn != null) {
      GgetIn.resetFlags(true, true);
      addInput("Group", GroupObjectKeyHelper.toMap(GgetIn, new HashMap(), "GroupObjectKeyData").get("GroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the Group
 * @param GgetInIn Value of the GgetIn
 *
 */

  public void setGroup(GroupObjectKeyData GgetInIn) {
    GgetIn = GgetInIn;
  }

  public void translateFromMap() {
    GgetIn = GroupObjectKeyHelper.fromMap(inputMap, "Group");
  }

/**
 *
 * Gets the Group
 * @return Value of the Group
 *
 */

  public GroupObjectKeyData getGroup( ) {
    return GgetIn;
  }

}
