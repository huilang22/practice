/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDefinitionGetBulkUdtTemplateItem.java
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
 * Class used to create a ComponentDefinitionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentDefinitionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CDObjectKeyData CDGetIn;
/**
 *
 * Constructor to create a  ComponentDefinitionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentDefinitionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CDObjectKeyData CDGetInIn) {
    super(id, context, "ComponentDefinitionGet");
    CDGetIn = CDGetInIn;
  }

  public void translateToMap() {
    if (CDGetIn != null) {
      CDGetIn.resetFlags(true, true);
      addInput("ComponentDefinition", CDObjectKeyHelper.toMap(CDGetIn, new HashMap(), "CDObjectKeyData").get("CDObjectKeyData"));
    }
  }


/**
 *
 * Sets the ComponentDefinition
 * @param CDGetInIn Value of the CDGetIn
 *
 */

  public void setComponentDefinition(CDObjectKeyData CDGetInIn) {
    CDGetIn = CDGetInIn;
  }

  public void translateFromMap() {
    CDGetIn = CDObjectKeyHelper.fromMap(inputMap, "ComponentDefinition");
  }

/**
 *
 * Gets the ComponentDefinition
 * @return Value of the ComponentDefinition
 *
 */

  public CDObjectKeyData getComponentDefinition( ) {
    return CDGetIn;
  }

}
