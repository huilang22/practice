/*
 * Generated code DO NOT EDIT
 * Generated file: GroupCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GroupCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GroupCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GroupObjectData noOpIn;

/**
 *
 * Constructor to create a   GroupCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GroupCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupObjectData noOpInIn) {
    super(id, context, "GroupCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Group", GroupObjectHelper.toMap(noOpIn, new HashMap(), "Group").get("Group"));
    }
  }
/**
 *
 * Sets the  Group
 * @param noOpInIn GroupObjectData to set
 *
 */
  public void setGroup(GroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Group passed into the constructor
 * @return Simulated response
 *
 */
  public GroupObjectData getGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GroupObjectHelper.fromMap(inputMap, "Group");
  }
}
