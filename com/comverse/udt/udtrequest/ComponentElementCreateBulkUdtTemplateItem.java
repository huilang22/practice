/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentElementCreateBulkUdtTemplateItem.java
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
 * Class used to create a ComponentElementCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentElementCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentElementObjectData ComponentElementCreateIn;
/**
 *
 * Constructor to create a  ComponentElementCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentElementCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentElementObjectData ComponentElementCreateInIn) {
    super(id, context, "ComponentElementCreate");
    ComponentElementCreateIn = ComponentElementCreateInIn;
  }

  public void translateToMap() {
    if (ComponentElementCreateIn != null) {
      ComponentElementCreateIn.resetFlags(true, true);
      addInput("ComponentElement", ComponentElementObjectHelper.toMap(ComponentElementCreateIn, new HashMap(), "ComponentElement").get("ComponentElement"));
    }
  }


/**
 *
 * Sets the ComponentElement
 * @param ComponentElementCreateInIn Value of the ComponentElementCreateIn
 *
 */

  public void setComponentElement(ComponentElementObjectData ComponentElementCreateInIn) {
    ComponentElementCreateIn = ComponentElementCreateInIn;
  }

  public void translateFromMap() {
    ComponentElementCreateIn = ComponentElementObjectHelper.fromMap(inputMap, "ComponentElement");
  }

/**
 *
 * Gets the ComponentElement
 * @return Value of the ComponentElement
 *
 */

  public ComponentElementObjectData getComponentElement( ) {
    return ComponentElementCreateIn;
  }

}
