/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountDefinitionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a DiscountDefinitionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountDefinitionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DiscountDefinitionObjectData DDUpdIn;
/**
 *
 * Constructor to create a  DiscountDefinitionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountDefinitionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, DiscountDefinitionObjectData DDUpdInIn) {
    super(id, context, "DiscountDefinitionUpdate");
    DDUpdIn = DDUpdInIn;
  }

  public void translateToMap() {
    if (DDUpdIn != null) {
      DDUpdIn.resetFlags(true, true);
      addInput("DiscountDefinition", DiscountDefinitionObjectHelper.toMap(DDUpdIn, new HashMap(), "DiscountDefinition").get("DiscountDefinition"));
    }
  }


/**
 *
 * Sets the DiscountDefinition
 * @param DDUpdInIn Value of the DDUpdIn
 *
 */

  public void setDiscountDefinition(DiscountDefinitionObjectData DDUpdInIn) {
    DDUpdIn = DDUpdInIn;
  }

  public void translateFromMap() {
    DDUpdIn = DiscountDefinitionObjectHelper.fromMap(inputMap, "DiscountDefinition");
  }

/**
 *
 * Gets the DiscountDefinition
 * @return Value of the DiscountDefinition
 *
 */

  public DiscountDefinitionObjectData getDiscountDefinition( ) {
    return DDUpdIn;
  }

}
