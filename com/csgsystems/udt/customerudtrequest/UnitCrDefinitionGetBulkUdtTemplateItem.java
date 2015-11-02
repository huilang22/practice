/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrDefinitionGetBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrDefinitionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrDefinitionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrDefinitionObjectKeyData ucdGetIn;
/**
 *
 * Constructor to create a  UnitCrDefinitionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrDefinitionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrDefinitionObjectKeyData ucdGetInIn) {
    super(id, context, "UnitCrDefinitionGet");
    ucdGetIn = ucdGetInIn;
  }

  public void translateToMap() {
    if (ucdGetIn != null) {
      ucdGetIn.resetFlags(true, true);
      addInput("UnitCrDefinition", UnitCrDefinitionObjectKeyHelper.toMap(ucdGetIn, new HashMap(), "UnitCrDefinitionObjectKeyData").get("UnitCrDefinitionObjectKeyData"));
    }
  }


/**
 *
 * Sets the UnitCrDefinition
 * @param ucdGetInIn Value of the ucdGetIn
 *
 */

  public void setUnitCrDefinition(UnitCrDefinitionObjectKeyData ucdGetInIn) {
    ucdGetIn = ucdGetInIn;
  }

  public void translateFromMap() {
    ucdGetIn = UnitCrDefinitionObjectKeyHelper.fromMap(inputMap, "UnitCrDefinition");
  }

/**
 *
 * Gets the UnitCrDefinition
 * @return Value of the UnitCrDefinition
 *
 */

  public UnitCrDefinitionObjectKeyData getUnitCrDefinition( ) {
    return ucdGetIn;
  }

}
