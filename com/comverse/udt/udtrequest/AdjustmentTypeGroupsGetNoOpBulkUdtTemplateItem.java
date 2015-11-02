/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeGroupsGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a AdjustmentTypeGroupsGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdjustmentTypeGroupsGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdjustmentTypeGroupsObjectData noOpIn;

/**
 *
 * Constructor to create a   AdjustmentTypeGroupsGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdjustmentTypeGroupsGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentTypeGroupsObjectData noOpInIn) {
    super(id, context, "AdjustmentTypeGroupsGet");
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
