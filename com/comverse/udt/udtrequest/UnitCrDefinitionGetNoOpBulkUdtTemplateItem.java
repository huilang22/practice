/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrDefinitionGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UnitCrDefinitionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnitCrDefinitionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnitCrDefinitionObjectData noOpIn;

/**
 *
 * Constructor to create a   UnitCrDefinitionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnitCrDefinitionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrDefinitionObjectData noOpInIn) {
    super(id, context, "UnitCrDefinitionGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UnitCrDefinition", UnitCrDefinitionObjectHelper.toMap(noOpIn, new HashMap(), "UnitCrDefinition").get("UnitCrDefinition"));
    }
  }
/**
 *
 * Sets the  UnitCrDefinition
 * @param noOpInIn UnitCrDefinitionObjectData to set
 *
 */
  public void setUnitCrDefinition(UnitCrDefinitionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnitCrDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrDefinitionObjectData getUnitCrDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnitCrDefinitionObjectHelper.fromMap(inputMap, "UnitCrDefinition");
  }
}
