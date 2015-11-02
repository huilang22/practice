/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a ComponentDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentObjectBaseFilter ComponentFilter;
  protected Date CDLCeaseDate;
/**
 *
 * Constructor to create a  ComponentDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectBaseFilter ComponentFilterIn, Date CDLCeaseDateIn) {
    super(id, context, "ComponentDeleteList");
    ComponentFilter = ComponentFilterIn;
    CDLCeaseDate = CDLCeaseDateIn;
  }

  public void translateToMap() {
    if (ComponentFilter != null) {
      Integer index =  ComponentFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ComponentFilter", ComponentObjectBaseHelper.toMap(ComponentFilter, new HashMap(), "Void").get("Void"));
    }
    if (CDLCeaseDate != null) {
      addInput("InactiveDate", CDLCeaseDate);
    }
  }


/**
 *
 * Sets the ComponentFilter
 * @param ComponentFilterIn Value of the ComponentFilter
 *
 */

  public void setComponentFilter(ComponentObjectBaseFilter ComponentFilterIn) {
    ComponentFilter = ComponentFilterIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param CDLCeaseDateIn Value of the CDLCeaseDate
 *
 */

  public void setInactiveDate(Date CDLCeaseDateIn) {
    CDLCeaseDate = CDLCeaseDateIn;
  }

  public void translateFromMap() {
    ComponentFilter = ComponentObjectBaseHelper.fromMapFilter(inputMap, "ComponentFilter");
    CDLCeaseDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the ComponentFilter
 * @return Value of the ComponentFilter
 *
 */

  public ComponentObjectBaseFilter getComponentFilter( ) {
    return ComponentFilter;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return CDLCeaseDate;
  }

}
