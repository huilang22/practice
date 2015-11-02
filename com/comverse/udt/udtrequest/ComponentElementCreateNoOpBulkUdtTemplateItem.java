/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentElementCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ComponentElementCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ComponentElementCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ComponentElementObjectData noOpIn;

/**
 *
 * Constructor to create a   ComponentElementCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ComponentElementCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentElementObjectData noOpInIn) {
    super(id, context, "ComponentElementCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ComponentElement", ComponentElementObjectHelper.toMap(noOpIn, new HashMap(), "ComponentElement").get("ComponentElement"));
    }
  }
/**
 *
 * Sets the  ComponentElement
 * @param noOpInIn ComponentElementObjectData to set
 *
 */
  public void setComponentElement(ComponentElementObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ComponentElement passed into the constructor
 * @return Simulated response
 *
 */
  public ComponentElementObjectData getComponentElement() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ComponentElementObjectHelper.fromMap(inputMap, "ComponentElement");
  }
}
