/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentTypeGroupsGetBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentTypeGroupsGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentTypeGroupsGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentTypeGroupsObjectKeyData AdjustmentTypeGroupsGetIn;
/**
 *
 * Constructor to create a  AdjustmentTypeGroupsGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentTypeGroupsGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentTypeGroupsObjectKeyData AdjustmentTypeGroupsGetInIn) {
    super(id, context, "AdjustmentTypeGroupsGet");
    AdjustmentTypeGroupsGetIn = AdjustmentTypeGroupsGetInIn;
  }

  public void translateToMap() {
    if (AdjustmentTypeGroupsGetIn != null) {
      AdjustmentTypeGroupsGetIn.resetFlags(true, true);
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectKeyHelper.toMap(AdjustmentTypeGroupsGetIn, new HashMap(), "AdjustmentTypeGroupsObjectKeyData").get("AdjustmentTypeGroupsObjectKeyData"));
    }
  }


/**
 *
 * Sets the AdjustmentTypeGroups
 * @param AdjustmentTypeGroupsGetInIn Value of the AdjustmentTypeGroupsGetIn
 *
 */

  public void setAdjustmentTypeGroups(AdjustmentTypeGroupsObjectKeyData AdjustmentTypeGroupsGetInIn) {
    AdjustmentTypeGroupsGetIn = AdjustmentTypeGroupsGetInIn;
  }

  public void translateFromMap() {
    AdjustmentTypeGroupsGetIn = AdjustmentTypeGroupsObjectKeyHelper.fromMap(inputMap, "AdjustmentTypeGroups");
  }

/**
 *
 * Gets the AdjustmentTypeGroups
 * @return Value of the AdjustmentTypeGroups
 *
 */

  public AdjustmentTypeGroupsObjectKeyData getAdjustmentTypeGroups( ) {
    return AdjustmentTypeGroupsGetIn;
  }

}
