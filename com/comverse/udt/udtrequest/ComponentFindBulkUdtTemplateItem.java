/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentFindBulkUdtTemplateItem.java
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
 * Class used to create a ComponentFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentObjectBaseFilter CompFindIn;
/**
 *
 * Constructor to create a  ComponentFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectBaseFilter CompFindInIn) {
    super(id, context, "ComponentFind");
    CompFindIn = CompFindInIn;
  }

  public void translateToMap() {
    if (CompFindIn != null) {
      Integer index =  CompFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Component", ComponentObjectBaseHelper.toMap(CompFindIn, new HashMap(), "Component").get("Component"));
    }
  }


/**
 *
 * Sets the Component
 * @param CompFindInIn Value of the CompFindIn
 *
 */

  public void setComponent(ComponentObjectBaseFilter CompFindInIn) {
    CompFindIn = CompFindInIn;
  }

  public void translateFromMap() {
    CompFindIn = ComponentObjectBaseHelper.fromMapFilter(inputMap, "Component");
  }

/**
 *
 * Gets the Component
 * @return Value of the Component
 *
 */

  public ComponentObjectBaseFilter getComponent( ) {
    return CompFindIn;
  }

}
