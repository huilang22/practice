/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanIdUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CorridorPlanIdUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorPlanIdUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CPIObjectData CPIUpdIn;
/**
 *
 * Constructor to create a  CorridorPlanIdUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorPlanIdUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CPIObjectData CPIUpdInIn) {
    super(id, context, "CorridorPlanIdUpdate");
    CPIUpdIn = CPIUpdInIn;
  }

  public void translateToMap() {
    if (CPIUpdIn != null) {
      CPIUpdIn.resetFlags(true, true);
      addInput("CorridorPlanId", CPIObjectHelper.toMap(CPIUpdIn, new HashMap(), "CorridorPlanId").get("CorridorPlanId"));
    }
  }


/**
 *
 * Sets the CorridorPlanId
 * @param CPIUpdInIn Value of the CPIUpdIn
 *
 */

  public void setCorridorPlanId(CPIObjectData CPIUpdInIn) {
    CPIUpdIn = CPIUpdInIn;
  }

  public void translateFromMap() {
    CPIUpdIn = CPIObjectHelper.fromMap(inputMap, "CorridorPlanId");
  }

/**
 *
 * Gets the CorridorPlanId
 * @return Value of the CorridorPlanId
 *
 */

  public CPIObjectData getCorridorPlanId( ) {
    return CPIUpdIn;
  }

}
