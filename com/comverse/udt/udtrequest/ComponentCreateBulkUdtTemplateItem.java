/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentCreateBulkUdtTemplateItem.java
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
 * Class used to create a ComponentCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentObjectBaseData CompCreateIn;
/**
 *
 * Constructor to create a  ComponentCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectBaseData CompCreateInIn) {
    super(id, context, "ComponentCreate");
    CompCreateIn = CompCreateInIn;
  }

  public void translateToMap() {
    if (CompCreateIn != null) {
      CompCreateIn.resetFlags(true, true);
      addInput("Component", ComponentObjectBaseHelper.toMap(CompCreateIn, new HashMap(), "Component").get("Component"));
    }
  }


/**
 *
 * Sets the Component
 * @param CompCreateInIn Value of the CompCreateIn
 *
 */

  public void setComponent(ComponentObjectBaseData CompCreateInIn) {
    CompCreateIn = CompCreateInIn;
  }

  public void translateFromMap() {
    CompCreateIn = ComponentObjectBaseHelper.fromMap(inputMap, "Component");
  }

/**
 *
 * Gets the Component
 * @return Value of the Component
 *
 */

  public ComponentObjectBaseData getComponent( ) {
    return CompCreateIn;
  }

}
