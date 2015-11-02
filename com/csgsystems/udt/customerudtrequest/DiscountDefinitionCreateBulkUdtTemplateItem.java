/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountDefinitionCreateBulkUdtTemplateItem.java
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
 * Class used to create a DiscountDefinitionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountDefinitionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DiscountDefinitionObjectData DDCrIn;
/**
 *
 * Constructor to create a  DiscountDefinitionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountDefinitionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, DiscountDefinitionObjectData DDCrInIn) {
    super(id, context, "DiscountDefinitionCreate");
    DDCrIn = DDCrInIn;
  }

  public void translateToMap() {
    if (DDCrIn != null) {
      DDCrIn.resetFlags(true, true);
      addInput("DiscountDefinition", DiscountDefinitionObjectHelper.toMap(DDCrIn, new HashMap(), "DiscountDefinition").get("DiscountDefinition"));
    }
  }


/**
 *
 * Sets the DiscountDefinition
 * @param DDCrInIn Value of the DDCrIn
 *
 */

  public void setDiscountDefinition(DiscountDefinitionObjectData DDCrInIn) {
    DDCrIn = DDCrInIn;
  }

  public void translateFromMap() {
    DDCrIn = DiscountDefinitionObjectHelper.fromMap(inputMap, "DiscountDefinition");
  }

/**
 *
 * Gets the DiscountDefinition
 * @return Value of the DiscountDefinition
 *
 */

  public DiscountDefinitionObjectData getDiscountDefinition( ) {
    return DDCrIn;
  }

}
