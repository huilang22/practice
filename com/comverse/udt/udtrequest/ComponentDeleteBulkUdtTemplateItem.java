/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ComponentDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentObjectBaseKeyData ComponentDeleteIn;
  protected Date CDCeaseDate;
/**
 *
 * Constructor to create a  ComponentDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectBaseKeyData ComponentDeleteInIn, Date CDCeaseDateIn) {
    super(id, context, "ComponentDelete");
    ComponentDeleteIn = ComponentDeleteInIn;
    CDCeaseDate = CDCeaseDateIn;
  }

  public void translateToMap() {
    if (ComponentDeleteIn != null) {
      ComponentDeleteIn.resetFlags(true, true);
      addInput("Component", ComponentObjectBaseKeyHelper.toMap(ComponentDeleteIn, new HashMap(), "ComponentObjectBaseKeyData").get("ComponentObjectBaseKeyData"));
    }
    if (CDCeaseDate != null) {
      addInput("InactiveDate", CDCeaseDate);
    }
  }


/**
 *
 * Sets the Component
 * @param ComponentDeleteInIn Value of the ComponentDeleteIn
 *
 */

  public void setComponent(ComponentObjectBaseKeyData ComponentDeleteInIn) {
    ComponentDeleteIn = ComponentDeleteInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param CDCeaseDateIn Value of the CDCeaseDate
 *
 */

  public void setInactiveDate(Date CDCeaseDateIn) {
    CDCeaseDate = CDCeaseDateIn;
  }

  public void translateFromMap() {
    ComponentDeleteIn = ComponentObjectBaseKeyHelper.fromMap(inputMap, "Component");
    CDCeaseDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the Component
 * @return Value of the Component
 *
 */

  public ComponentObjectBaseKeyData getComponent( ) {
    return ComponentDeleteIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return CDCeaseDate;
  }

}
