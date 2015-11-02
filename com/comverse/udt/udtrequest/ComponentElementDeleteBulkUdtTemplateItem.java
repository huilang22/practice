/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentElementDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ComponentElementDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentElementDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentElementObjectKeyData ComponentElementDeleteIn;
  protected Date CEDCeaseDate;
/**
 *
 * Constructor to create a  ComponentElementDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentElementDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentElementObjectKeyData ComponentElementDeleteInIn, Date CEDCeaseDateIn) {
    super(id, context, "ComponentElementDelete");
    ComponentElementDeleteIn = ComponentElementDeleteInIn;
    CEDCeaseDate = CEDCeaseDateIn;
  }

  public void translateToMap() {
    if (ComponentElementDeleteIn != null) {
      ComponentElementDeleteIn.resetFlags(true, true);
      addInput("ComponentElement", ComponentElementObjectKeyHelper.toMap(ComponentElementDeleteIn, new HashMap(), "ComponentElementObjectKeyData").get("ComponentElementObjectKeyData"));
    }
    if (CEDCeaseDate != null) {
      addInput("InactiveDate", CEDCeaseDate);
    }
  }


/**
 *
 * Sets the ComponentElement
 * @param ComponentElementDeleteInIn Value of the ComponentElementDeleteIn
 *
 */

  public void setComponentElement(ComponentElementObjectKeyData ComponentElementDeleteInIn) {
    ComponentElementDeleteIn = ComponentElementDeleteInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param CEDCeaseDateIn Value of the CEDCeaseDate
 *
 */

  public void setInactiveDate(Date CEDCeaseDateIn) {
    CEDCeaseDate = CEDCeaseDateIn;
  }

  public void translateFromMap() {
    ComponentElementDeleteIn = ComponentElementObjectKeyHelper.fromMap(inputMap, "ComponentElement");
    CEDCeaseDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the ComponentElement
 * @return Value of the ComponentElement
 *
 */

  public ComponentElementObjectKeyData getComponentElement( ) {
    return ComponentElementDeleteIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return CEDCeaseDate;
  }

}
