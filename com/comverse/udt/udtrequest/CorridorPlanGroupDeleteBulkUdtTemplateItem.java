/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanGroupDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CorridorPlanGroupDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorPlanGroupDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CPGObjectKeyData CPGDeleteIn;
/**
 *
 * Constructor to create a  CorridorPlanGroupDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorPlanGroupDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CPGObjectKeyData CPGDeleteInIn) {
    super(id, context, "CorridorPlanGroupDelete");
    CPGDeleteIn = CPGDeleteInIn;
  }

  public void translateToMap() {
    if (CPGDeleteIn != null) {
      CPGDeleteIn.resetFlags(true, true);
      addInput("CorridorPlanGroup", CPGObjectKeyHelper.toMap(CPGDeleteIn, new HashMap(), "CPGObjectKeyData").get("CPGObjectKeyData"));
    }
  }


/**
 *
 * Sets the CorridorPlanGroup
 * @param CPGDeleteInIn Value of the CPGDeleteIn
 *
 */

  public void setCorridorPlanGroup(CPGObjectKeyData CPGDeleteInIn) {
    CPGDeleteIn = CPGDeleteInIn;
  }

  public void translateFromMap() {
    CPGDeleteIn = CPGObjectKeyHelper.fromMap(inputMap, "CorridorPlanGroup");
  }

/**
 *
 * Gets the CorridorPlanGroup
 * @return Value of the CorridorPlanGroup
 *
 */

  public CPGObjectKeyData getCorridorPlanGroup( ) {
    return CPGDeleteIn;
  }

}
