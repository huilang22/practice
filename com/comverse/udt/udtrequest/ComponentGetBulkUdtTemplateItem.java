/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentGetBulkUdtTemplateItem.java
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
 * Class used to create a ComponentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentObjectBaseKeyData CompGetIn;
/**
 *
 * Constructor to create a  ComponentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectBaseKeyData CompGetInIn) {
    super(id, context, "ComponentGet");
    CompGetIn = CompGetInIn;
  }

  public void translateToMap() {
    if (CompGetIn != null) {
      CompGetIn.resetFlags(true, true);
      addInput("Component", ComponentObjectBaseKeyHelper.toMap(CompGetIn, new HashMap(), "ComponentObjectBaseKeyData").get("ComponentObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the Component
 * @param CompGetInIn Value of the CompGetIn
 *
 */

  public void setComponent(ComponentObjectBaseKeyData CompGetInIn) {
    CompGetIn = CompGetInIn;
  }

  public void translateFromMap() {
    CompGetIn = ComponentObjectBaseKeyHelper.fromMap(inputMap, "Component");
  }

/**
 *
 * Gets the Component
 * @return Value of the Component
 *
 */

  public ComponentObjectBaseKeyData getComponent( ) {
    return CompGetIn;
  }

}
