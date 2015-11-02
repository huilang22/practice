/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupMembersGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqGroupMembersGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupMembersGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupMembersObjectData noOpIn;

/**
 *
 * Constructor to create a   HqGroupMembersGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupMembersGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupMembersObjectData noOpInIn) {
    super(id, context, "HqGroupMembersGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(noOpIn, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }
/**
 *
 * Sets the  HqGroupMembers
 * @param noOpInIn HqGroupMembersObjectData to set
 *
 */
  public void setHqGroupMembers(HqGroupMembersObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqGroupMembers passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupMembersObjectData getHqGroupMembers() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupMembersObjectHelper.fromMap(inputMap, "HqGroupMembers");
  }
}
