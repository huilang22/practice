/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupsGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqGroupsGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupsGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupsObjectData noOpIn;

/**
 *
 * Constructor to create a   HqGroupsGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupsGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupsObjectData noOpInIn) {
    super(id, context, "HqGroupsGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("HqGroups", HqGroupsObjectHelper.toMap(noOpIn, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }
/**
 *
 * Sets the  HqGroups
 * @param noOpInIn HqGroupsObjectData to set
 *
 */
  public void setHqGroups(HqGroupsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqGroups passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupsObjectData getHqGroups() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupsObjectHelper.fromMap(inputMap, "HqGroups");
  }
}
