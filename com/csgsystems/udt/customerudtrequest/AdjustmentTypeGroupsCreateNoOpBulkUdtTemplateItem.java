/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentTypeGroupsCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a AdjustmentTypeGroupsCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdjustmentTypeGroupsCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdjustmentTypeGroupsObjectData noOpIn;

/**
 *
 * Constructor to create a   AdjustmentTypeGroupsCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdjustmentTypeGroupsCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentTypeGroupsObjectData noOpInIn) {
    super(id, context, "AdjustmentTypeGroupsCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectHelper.toMap(noOpIn, new HashMap(), "AdjustmentTypeGroups").get("AdjustmentTypeGroups"));
    }
  }
/**
 *
 * Sets the  AdjustmentTypeGroups
 * @param noOpInIn AdjustmentTypeGroupsObjectData to set
 *
 */
  public void setAdjustmentTypeGroups(AdjustmentTypeGroupsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AdjustmentTypeGroups passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentTypeGroupsObjectData getAdjustmentTypeGroups() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AdjustmentTypeGroupsObjectHelper.fromMap(inputMap, "AdjustmentTypeGroups");
  }
}
