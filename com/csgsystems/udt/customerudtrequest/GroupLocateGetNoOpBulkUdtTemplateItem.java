/*
 * Generated code DO NOT EDIT
 * Generated file: GroupLocateGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GroupLocateGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GroupLocateGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GroupLocateObjectData noOpIn;

/**
 *
 * Constructor to create a   GroupLocateGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GroupLocateGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupLocateObjectData noOpInIn) {
    super(id, context, "GroupLocateGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GroupLocate", GroupLocateObjectHelper.toMap(noOpIn, new HashMap(), "GroupLocate").get("GroupLocate"));
    }
  }
/**
 *
 * Sets the  GroupLocate
 * @param noOpInIn GroupLocateObjectData to set
 *
 */
  public void setGroupLocate(GroupLocateObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GroupLocate passed into the constructor
 * @return Simulated response
 *
 */
  public GroupLocateObjectData getGroupLocate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GroupLocateObjectHelper.fromMap(inputMap, "GroupLocate");
  }
}
