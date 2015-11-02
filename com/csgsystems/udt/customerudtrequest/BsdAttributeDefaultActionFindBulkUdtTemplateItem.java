/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeDefaultActionFindBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * Class used to create a BsdAttributeDefaultActionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeDefaultActionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected String business_unit_name;
  protected String application_name;
  protected String object_name;
  protected String action_name;
  protected Date effective_date;
/**
 *
 * Constructor to create a  BsdAttributeDefaultActionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeDefaultActionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, String business_unit_nameIn, String application_nameIn, String object_nameIn, String action_nameIn, Date effective_dateIn) {
    super(id, context, "BsdAttributeDefaultActionFind");
    business_unit_name = business_unit_nameIn;
    application_name = application_nameIn;
    object_name = object_nameIn;
    action_name = action_nameIn;
    effective_date = effective_dateIn;
  }

  public void translateToMap() {
    if (business_unit_name != null) {
      addInput("BusinessUnitName", business_unit_name);
    }
    if (application_name != null) {
      addInput("ApplicationName", application_name);
    }
    if (object_name != null) {
      addInput("ObjectName", object_name);
    }
    if (action_name != null) {
      addInput("ActionName", action_name);
    }
    if (effective_date != null) {
      addInput("EffectiveDate", effective_date);
    }
  }


/**
 *
 * Sets the BusinessUnitName
 * @param business_unit_nameIn Value of the business_unit_name
 *
 */

  public void setBusinessUnitName(String business_unit_nameIn) {
    business_unit_name = business_unit_nameIn;
  }

/**
 *
 * Sets the ApplicationName
 * @param application_nameIn Value of the application_name
 *
 */

  public void setApplicationName(String application_nameIn) {
    application_name = application_nameIn;
  }

/**
 *
 * Sets the ObjectName
 * @param object_nameIn Value of the object_name
 *
 */

  public void setObjectName(String object_nameIn) {
    object_name = object_nameIn;
  }

/**
 *
 * Sets the ActionName
 * @param action_nameIn Value of the action_name
 *
 */

  public void setActionName(String action_nameIn) {
    action_name = action_nameIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param effective_dateIn Value of the effective_date
 *
 */

  public void setEffectiveDate(Date effective_dateIn) {
    effective_date = effective_dateIn;
  }

  public void translateFromMap() {
    business_unit_name = (String)inputMap.get("BusinessUnitName");
    application_name = (String)inputMap.get("ApplicationName");
    object_name = (String)inputMap.get("ObjectName");
    action_name = (String)inputMap.get("ActionName");
    effective_date = (Date)inputMap.get("EffectiveDate");
  }

/**
 *
 * Gets the BusinessUnitName
 * @return Value of the BusinessUnitName
 *
 */

  public String getBusinessUnitName( ) {
    return business_unit_name;
  }

/**
 *
 * Gets the ApplicationName
 * @return Value of the ApplicationName
 *
 */

  public String getApplicationName( ) {
    return application_name;
  }

/**
 *
 * Gets the ObjectName
 * @return Value of the ObjectName
 *
 */

  public String getObjectName( ) {
    return object_name;
  }

/**
 *
 * Gets the ActionName
 * @return Value of the ActionName
 *
 */

  public String getActionName( ) {
    return action_name;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return effective_date;
  }

}
