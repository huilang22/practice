/*
 * Generated code DO NOT EDIT
 * Generated file: GroupFindBulkUdtTemplateItem.java
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
 * Class used to create a GroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GroupObjectFilter GfindIn;
/**
 *
 * Constructor to create a  GroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupObjectFilter GfindInIn) {
    super(id, context, "GroupFind");
    GfindIn = GfindInIn;
  }

  public void translateToMap() {
    if (GfindIn != null) {
      Integer index =  GfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Group", GroupObjectHelper.toMap(GfindIn, new HashMap(), "Group").get("Group"));
    }
  }


/**
 *
 * Sets the Group
 * @param GfindInIn Value of the GfindIn
 *
 */

  public void setGroup(GroupObjectFilter GfindInIn) {
    GfindIn = GfindInIn;
  }

  public void translateFromMap() {
    GfindIn = GroupObjectHelper.fromMapFilter(inputMap, "Group");
  }

/**
 *
 * Gets the Group
 * @return Value of the Group
 *
 */

  public GroupObjectFilter getGroup( ) {
    return GfindIn;
  }

}
