/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountDefinitionGetBulkUdtTemplateItem.java
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
 * Class used to create a DiscountDefinitionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountDefinitionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DiscountDefinitionObjectKeyData DDGetIn;
/**
 *
 * Constructor to create a  DiscountDefinitionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountDefinitionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, DiscountDefinitionObjectKeyData DDGetInIn) {
    super(id, context, "DiscountDefinitionGet");
    DDGetIn = DDGetInIn;
  }

  public void translateToMap() {
    if (DDGetIn != null) {
      DDGetIn.resetFlags(true, true);
      addInput("DiscountDefinition", DiscountDefinitionObjectKeyHelper.toMap(DDGetIn, new HashMap(), "DiscountDefinitionObjectKeyData").get("DiscountDefinitionObjectKeyData"));
    }
  }


/**
 *
 * Sets the DiscountDefinition
 * @param DDGetInIn Value of the DDGetIn
 *
 */

  public void setDiscountDefinition(DiscountDefinitionObjectKeyData DDGetInIn) {
    DDGetIn = DDGetInIn;
  }

  public void translateFromMap() {
    DDGetIn = DiscountDefinitionObjectKeyHelper.fromMap(inputMap, "DiscountDefinition");
  }

/**
 *
 * Gets the DiscountDefinition
 * @return Value of the DiscountDefinition
 *
 */

  public DiscountDefinitionObjectKeyData getDiscountDefinition( ) {
    return DDGetIn;
  }

}
