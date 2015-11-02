/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeGroupsCreateBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentTypeGroupsCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentTypeGroupsCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentTypeGroupsObjectData AdjustmentTypeGroupsCreateIn;
/**
 *
 * Constructor to create a  AdjustmentTypeGroupsCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentTypeGroupsCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentTypeGroupsObjectData AdjustmentTypeGroupsCreateInIn) {
    super(id, context, "AdjustmentTypeGroupsCreate");
    AdjustmentTypeGroupsCreateIn = AdjustmentTypeGroupsCreateInIn;
  }

  public void translateToMap() {
    if (AdjustmentTypeGroupsCreateIn != null) {
      AdjustmentTypeGroupsCreateIn.resetFlags(true, true);
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectHelper.toMap(AdjustmentTypeGroupsCreateIn, new HashMap(), "AdjustmentTypeGroups").get("AdjustmentTypeGroups"));
    }
  }


/**
 *
 * Sets the AdjustmentTypeGroups
 * @param AdjustmentTypeGroupsCreateInIn Value of the AdjustmentTypeGroupsCreateIn
 *
 */

  public void setAdjustmentTypeGroups(AdjustmentTypeGroupsObjectData AdjustmentTypeGroupsCreateInIn) {
    AdjustmentTypeGroupsCreateIn = AdjustmentTypeGroupsCreateInIn;
  }

  public void translateFromMap() {
    AdjustmentTypeGroupsCreateIn = AdjustmentTypeGroupsObjectHelper.fromMap(inputMap, "AdjustmentTypeGroups");
  }

/**
 *
 * Gets the AdjustmentTypeGroups
 * @return Value of the AdjustmentTypeGroups
 *
 */

  public AdjustmentTypeGroupsObjectData getAdjustmentTypeGroups( ) {
    return AdjustmentTypeGroupsCreateIn;
  }

}
