/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanGroupCreateBulkUdtTemplateItem.java
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
 * Class used to create a CorridorPlanGroupCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorPlanGroupCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CPGObjectData CPGCreateIn;
/**
 *
 * Constructor to create a  CorridorPlanGroupCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorPlanGroupCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CPGObjectData CPGCreateInIn) {
    super(id, context, "CorridorPlanGroupCreate");
    CPGCreateIn = CPGCreateInIn;
  }

  public void translateToMap() {
    if (CPGCreateIn != null) {
      CPGCreateIn.resetFlags(true, true);
      addInput("CorridorPlanGroup", CPGObjectHelper.toMap(CPGCreateIn, new HashMap(), "CorridorPlanGroup").get("CorridorPlanGroup"));
    }
  }


/**
 *
 * Sets the CorridorPlanGroup
 * @param CPGCreateInIn Value of the CPGCreateIn
 *
 */

  public void setCorridorPlanGroup(CPGObjectData CPGCreateInIn) {
    CPGCreateIn = CPGCreateInIn;
  }

  public void translateFromMap() {
    CPGCreateIn = CPGObjectHelper.fromMap(inputMap, "CorridorPlanGroup");
  }

/**
 *
 * Gets the CorridorPlanGroup
 * @return Value of the CorridorPlanGroup
 *
 */

  public CPGObjectData getCorridorPlanGroup( ) {
    return CPGCreateIn;
  }

}
