/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GroupUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GroupUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GroupObjectData noOpIn;

/**
 *
 * Constructor to create a   GroupUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GroupUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupObjectData noOpInIn) {
    super(id, context, "GroupUpdate");
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
