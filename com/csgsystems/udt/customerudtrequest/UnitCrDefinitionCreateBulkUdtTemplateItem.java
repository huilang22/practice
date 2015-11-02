/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrDefinitionCreateBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrDefinitionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrDefinitionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrDefinitionObjectData ucdCrIn;
/**
 *
 * Constructor to create a  UnitCrDefinitionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrDefinitionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrDefinitionObjectData ucdCrInIn) {
    super(id, context, "UnitCrDefinitionCreate");
    ucdCrIn = ucdCrInIn;
  }

  public void translateToMap() {
    if (ucdCrIn != null) {
      ucdCrIn.resetFlags(true, true);
      addInput("UnitCrDefinition", UnitCrDefinitionObjectHelper.toMap(ucdCrIn, new HashMap(), "UnitCrDefinition").get("UnitCrDefinition"));
    }
  }


/**
 *
 * Sets the UnitCrDefinition
 * @param ucdCrInIn Value of the ucdCrIn
 *
 */

  public void setUnitCrDefinition(UnitCrDefinitionObjectData ucdCrInIn) {
    ucdCrIn = ucdCrInIn;
  }

  public void translateFromMap() {
    ucdCrIn = UnitCrDefinitionObjectHelper.fromMap(inputMap, "UnitCrDefinition");
  }

/**
 *
 * Gets the UnitCrDefinition
 * @return Value of the UnitCrDefinition
 *
 */

  public UnitCrDefinitionObjectData getUnitCrDefinition( ) {
    return ucdCrIn;
  }

}
