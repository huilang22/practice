/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentElementUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ComponentElementUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentElementUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentElementObjectData ComponentElementUpdateIn;
/**
 *
 * Constructor to create a  ComponentElementUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentElementUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentElementObjectData ComponentElementUpdateInIn) {
    super(id, context, "ComponentElementUpdate");
    ComponentElementUpdateIn = ComponentElementUpdateInIn;
  }

  public void translateToMap() {
    if (ComponentElementUpdateIn != null) {
      ComponentElementUpdateIn.resetFlags(true, true);
      addInput("ComponentElement", ComponentElementObjectHelper.toMap(ComponentElementUpdateIn, new HashMap(), "ComponentElement").get("ComponentElement"));
    }
  }


/**
 *
 * Sets the ComponentElement
 * @param ComponentElementUpdateInIn Value of the ComponentElementUpdateIn
 *
 */

  public void setComponentElement(ComponentElementObjectData ComponentElementUpdateInIn) {
    ComponentElementUpdateIn = ComponentElementUpdateInIn;
  }

  public void translateFromMap() {
    ComponentElementUpdateIn = ComponentElementObjectHelper.fromMap(inputMap, "ComponentElement");
  }

/**
 *
 * Gets the ComponentElement
 * @return Value of the ComponentElement
 *
 */

  public ComponentElementObjectData getComponentElement( ) {
    return ComponentElementUpdateIn;
  }

}
