/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentRemoveBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ComponentRemoveBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentRemoveBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentObjectBaseKeyData ComponentRemoveIn;
/**
 *
 * Constructor to create a  ComponentRemoveBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentRemoveBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectBaseKeyData ComponentRemoveInIn) {
    super(id, context, "ComponentRemove");
    ComponentRemoveIn = ComponentRemoveInIn;
  }

  public void translateToMap() {
    if (ComponentRemoveIn != null) {
      ComponentRemoveIn.resetFlags(true, true);
      addInput("Component", ComponentObjectBaseKeyHelper.toMap(ComponentRemoveIn, new HashMap(), "ComponentObjectBaseKeyData").get("ComponentObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the Component
 * @param ComponentRemoveInIn Value of the ComponentRemoveIn
 *
 */

  public void setComponent(ComponentObjectBaseKeyData ComponentRemoveInIn) {
    ComponentRemoveIn = ComponentRemoveInIn;
  }

  public void translateFromMap() {
    ComponentRemoveIn = ComponentObjectBaseKeyHelper.fromMap(inputMap, "Component");
  }

/**
 *
 * Gets the Component
 * @return Value of the Component
 *
 */

  public ComponentObjectBaseKeyData getComponent( ) {
    return ComponentRemoveIn;
  }

}
