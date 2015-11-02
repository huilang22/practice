/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ComponentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentObjectBaseData CompUpdateIn;
/**
 *
 * Constructor to create a  ComponentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectBaseData CompUpdateInIn) {
    super(id, context, "ComponentUpdate");
    CompUpdateIn = CompUpdateInIn;
  }

  public void translateToMap() {
    if (CompUpdateIn != null) {
      CompUpdateIn.resetFlags(true, true);
      addInput("Component", ComponentObjectBaseHelper.toMap(CompUpdateIn, new HashMap(), "Component").get("Component"));
    }
  }


/**
 *
 * Sets the Component
 * @param CompUpdateInIn Value of the CompUpdateIn
 *
 */

  public void setComponent(ComponentObjectBaseData CompUpdateInIn) {
    CompUpdateIn = CompUpdateInIn;
  }

  public void translateFromMap() {
    CompUpdateIn = ComponentObjectBaseHelper.fromMap(inputMap, "Component");
  }

/**
 *
 * Gets the Component
 * @return Value of the Component
 *
 */

  public ComponentObjectBaseData getComponent( ) {
    return CompUpdateIn;
  }

}
