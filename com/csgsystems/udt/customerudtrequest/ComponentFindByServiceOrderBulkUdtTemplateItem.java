/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentFindByServiceOrderBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a ComponentFindByServiceOrderBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentFindByServiceOrderBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentObjectBaseFilter CompFindByServiceOrderIn;
  protected String ServiceOrderId;
/**
 *
 * Constructor to create a  ComponentFindByServiceOrderBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentFindByServiceOrderBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectBaseFilter CompFindByServiceOrderInIn, String ServiceOrderIdIn) {
    super(id, context, "ComponentFindByServiceOrder");
    CompFindByServiceOrderIn = CompFindByServiceOrderInIn;
    ServiceOrderId = ServiceOrderIdIn;
  }

  public void translateToMap() {
    if (CompFindByServiceOrderIn != null) {
      Integer index =  CompFindByServiceOrderIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Component", ComponentObjectBaseHelper.toMap(CompFindByServiceOrderIn, new HashMap(), "Component").get("Component"));
    }
    if (ServiceOrderId != null) {
      addInput("ServiceOrderId", ServiceOrderId);
    }
  }


/**
 *
 * Sets the Component
 * @param CompFindByServiceOrderInIn Value of the CompFindByServiceOrderIn
 *
 */

  public void setComponent(ComponentObjectBaseFilter CompFindByServiceOrderInIn) {
    CompFindByServiceOrderIn = CompFindByServiceOrderInIn;
  }

/**
 *
 * Sets the ServiceOrderId
 * @param ServiceOrderIdIn Value of the ServiceOrderId
 *
 */

  public void setServiceOrderId(String ServiceOrderIdIn) {
    ServiceOrderId = ServiceOrderIdIn;
  }

  public void translateFromMap() {
    CompFindByServiceOrderIn = ComponentObjectBaseHelper.fromMapFilter(inputMap, "Component");
    ServiceOrderId = (String)inputMap.get("ServiceOrderId");
  }

/**
 *
 * Gets the Component
 * @return Value of the Component
 *
 */

  public ComponentObjectBaseFilter getComponent( ) {
    return CompFindByServiceOrderIn;
  }

/**
 *
 * Gets the ServiceOrderId
 * @return Value of the ServiceOrderId
 *
 */

  public String getServiceOrderId( ) {
    return ServiceOrderId;
  }

}
