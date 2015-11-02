/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrDefinitionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrDefinitionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrDefinitionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrDefinitionObjectData ucdUpdIn;
/**
 *
 * Constructor to create a  UnitCrDefinitionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrDefinitionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrDefinitionObjectData ucdUpdInIn) {
    super(id, context, "UnitCrDefinitionUpdate");
    ucdUpdIn = ucdUpdInIn;
  }

  public void translateToMap() {
    if (ucdUpdIn != null) {
      ucdUpdIn.resetFlags(true, true);
      addInput("UnitCrDefinition", UnitCrDefinitionObjectHelper.toMap(ucdUpdIn, new HashMap(), "UnitCrDefinition").get("UnitCrDefinition"));
    }
  }


/**
 *
 * Sets the UnitCrDefinition
 * @param ucdUpdInIn Value of the ucdUpdIn
 *
 */

  public void setUnitCrDefinition(UnitCrDefinitionObjectData ucdUpdInIn) {
    ucdUpdIn = ucdUpdInIn;
  }

  public void translateFromMap() {
    ucdUpdIn = UnitCrDefinitionObjectHelper.fromMap(inputMap, "UnitCrDefinition");
  }

/**
 *
 * Gets the UnitCrDefinition
 * @return Value of the UnitCrDefinition
 *
 */

  public UnitCrDefinitionObjectData getUnitCrDefinition( ) {
    return ucdUpdIn;
  }

}
