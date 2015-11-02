/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentTypeGroupsDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentTypeGroupsDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentTypeGroupsDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentTypeGroupsObjectKeyData AdjustmentTypeGroupsDeleteIn;
/**
 *
 * Constructor to create a  AdjustmentTypeGroupsDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentTypeGroupsDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentTypeGroupsObjectKeyData AdjustmentTypeGroupsDeleteInIn) {
    super(id, context, "AdjustmentTypeGroupsDelete");
    AdjustmentTypeGroupsDeleteIn = AdjustmentTypeGroupsDeleteInIn;
  }

  public void translateToMap() {
    if (AdjustmentTypeGroupsDeleteIn != null) {
      AdjustmentTypeGroupsDeleteIn.resetFlags(true, true);
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectKeyHelper.toMap(AdjustmentTypeGroupsDeleteIn, new HashMap(), "AdjustmentTypeGroupsObjectKeyData").get("AdjustmentTypeGroupsObjectKeyData"));
    }
  }


/**
 *
 * Sets the AdjustmentTypeGroups
 * @param AdjustmentTypeGroupsDeleteInIn Value of the AdjustmentTypeGroupsDeleteIn
 *
 */

  public void setAdjustmentTypeGroups(AdjustmentTypeGroupsObjectKeyData AdjustmentTypeGroupsDeleteInIn) {
    AdjustmentTypeGroupsDeleteIn = AdjustmentTypeGroupsDeleteInIn;
  }

  public void translateFromMap() {
    AdjustmentTypeGroupsDeleteIn = AdjustmentTypeGroupsObjectKeyHelper.fromMap(inputMap, "AdjustmentTypeGroups");
  }

/**
 *
 * Gets the AdjustmentTypeGroups
 * @return Value of the AdjustmentTypeGroups
 *
 */

  public AdjustmentTypeGroupsObjectKeyData getAdjustmentTypeGroups( ) {
    return AdjustmentTypeGroupsDeleteIn;
  }

}
