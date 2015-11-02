/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDefinitionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ComponentDefinitionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentDefinitionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CDObjectData CDUpdateIn;
/**
 *
 * Constructor to create a  ComponentDefinitionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentDefinitionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CDObjectData CDUpdateInIn) {
    super(id, context, "ComponentDefinitionUpdate");
    CDUpdateIn = CDUpdateInIn;
  }

  public void translateToMap() {
    if (CDUpdateIn != null) {
      CDUpdateIn.resetFlags(true, true);
      addInput("ComponentDefinition", CDObjectHelper.toMap(CDUpdateIn, new HashMap(), "ComponentDefinition").get("ComponentDefinition"));
    }
  }


/**
 *
 * Sets the ComponentDefinition
 * @param CDUpdateInIn Value of the CDUpdateIn
 *
 */

  public void setComponentDefinition(CDObjectData CDUpdateInIn) {
    CDUpdateIn = CDUpdateInIn;
  }

  public void translateFromMap() {
    CDUpdateIn = CDObjectHelper.fromMap(inputMap, "ComponentDefinition");
  }

/**
 *
 * Gets the ComponentDefinition
 * @return Value of the ComponentDefinition
 *
 */

  public CDObjectData getComponentDefinition( ) {
    return CDUpdateIn;
  }

}
