/*
 * Generated code DO NOT EDIT
 * Generated file: GroupUpdateBulkUdtTemplateItem.java
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
 * Class used to create a GroupUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GroupUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GroupObjectData GupdateIn;
/**
 *
 * Constructor to create a  GroupUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GroupUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupObjectData GupdateInIn) {
    super(id, context, "GroupUpdate");
    GupdateIn = GupdateInIn;
  }

  public void translateToMap() {
    if (GupdateIn != null) {
      GupdateIn.resetFlags(true, true);
      addInput("Group", GroupObjectHelper.toMap(GupdateIn, new HashMap(), "Group").get("Group"));
    }
  }


/**
 *
 * Sets the Group
 * @param GupdateInIn Value of the GupdateIn
 *
 */

  public void setGroup(GroupObjectData GupdateInIn) {
    GupdateIn = GupdateInIn;
  }

  public void translateFromMap() {
    GupdateIn = GroupObjectHelper.fromMap(inputMap, "Group");
  }

/**
 *
 * Gets the Group
 * @return Value of the Group
 *
 */

  public GroupObjectData getGroup( ) {
    return GupdateIn;
  }

}
