/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentExternalFindBulkUdtTemplateItem.java
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
 * Class used to create a ComponentExternalFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentExternalFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentObjectFilter CSEXFindIn;
/**
 *
 * Constructor to create a  ComponentExternalFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentExternalFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectFilter CSEXFindInIn) {
    super(id, context, "ComponentExternalFind");
    CSEXFindIn = CSEXFindInIn;
  }

  public void translateToMap() {
    if (CSEXFindIn != null) {
      Integer index =  CSEXFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Component", ComponentObjectHelper.toMap(CSEXFindIn, new HashMap(), "Component").get("Component"));
    }
  }


/**
 *
 * Sets the Component
 * @param CSEXFindInIn Value of the CSEXFindIn
 *
 */

  public void setComponent(ComponentObjectFilter CSEXFindInIn) {
    CSEXFindIn = CSEXFindInIn;
  }

  public void translateFromMap() {
    CSEXFindIn = ComponentObjectHelper.fromMapFilter(inputMap, "Component");
  }

/**
 *
 * Gets the Component
 * @return Value of the Component
 *
 */

  public ComponentObjectFilter getComponent( ) {
    return CSEXFindIn;
  }

}
