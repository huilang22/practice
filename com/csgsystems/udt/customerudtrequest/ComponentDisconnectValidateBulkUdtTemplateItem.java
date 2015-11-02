/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentDisconnectValidateBulkUdtTemplateItem.java
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
 * Class used to create a ComponentDisconnectValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentDisconnectValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentObjectData ComponentDisconnectValidateIn;
  protected Date EffectiveDt;
/**
 *
 * Constructor to create a  ComponentDisconnectValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentDisconnectValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectData ComponentDisconnectValidateInIn, Date EffectiveDtIn) {
    super(id, context, "ComponentDisconnectValidate");
    ComponentDisconnectValidateIn = ComponentDisconnectValidateInIn;
    EffectiveDt = EffectiveDtIn;
  }

  public void translateToMap() {
    if (ComponentDisconnectValidateIn != null) {
      ComponentDisconnectValidateIn.resetFlags(true, true);
      addInput("Component", ComponentObjectHelper.toMap(ComponentDisconnectValidateIn, new HashMap(), "Void").get("Void"));
    }
    if (EffectiveDt != null) {
      addInput("EffectiveDt", EffectiveDt);
    }
  }


/**
 *
 * Sets the Component
 * @param ComponentDisconnectValidateInIn Value of the ComponentDisconnectValidateIn
 *
 */

  public void setComponent(ComponentObjectData ComponentDisconnectValidateInIn) {
    ComponentDisconnectValidateIn = ComponentDisconnectValidateInIn;
  }

/**
 *
 * Sets the EffectiveDt
 * @param EffectiveDtIn Value of the EffectiveDt
 *
 */

  public void setEffectiveDt(Date EffectiveDtIn) {
    EffectiveDt = EffectiveDtIn;
  }

  public void translateFromMap() {
    ComponentDisconnectValidateIn = ComponentObjectHelper.fromMap(inputMap, "Component");
    EffectiveDt = (Date)inputMap.get("EffectiveDt");
  }

/**
 *
 * Gets the Component
 * @return Value of the Component
 *
 */

  public ComponentObjectData getComponent( ) {
    return ComponentDisconnectValidateIn;
  }

/**
 *
 * Gets the EffectiveDt
 * @return Value of the EffectiveDt
 *
 */

  public Date getEffectiveDt( ) {
    return EffectiveDt;
  }

}
