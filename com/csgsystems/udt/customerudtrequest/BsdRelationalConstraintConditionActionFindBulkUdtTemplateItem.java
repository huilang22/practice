/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintConditionActionFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalConstraintConditionActionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalConstraintConditionActionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected String business_unit_name;
  protected String application_name;
  protected String source_object_name;
  protected String target_object_name;
  protected String action_name;
  protected Date effective_date;
/**
 *
 * Constructor to create a  BsdRelationalConstraintConditionActionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalConstraintConditionActionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, String business_unit_nameIn, String application_nameIn, String source_object_nameIn, String target_object_nameIn, String action_nameIn, Date effective_dateIn) {
    super(id, context, "BsdRelationalConstraintConditionActionFind");
    business_unit_name = business_unit_nameIn;
    application_name = application_nameIn;
    source_object_name = source_object_nameIn;
    target_object_name = target_object_nameIn;
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
    if (source_object_name != null) {
      addInput("SourceObjectName", source_object_name);
    }
    if (target_object_name != null) {
      addInput("TargetObjectName", target_object_name);
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
 * Sets the SourceObjectName
 * @param source_object_nameIn Value of the source_object_name
 *
 */

  public void setSourceObjectName(String source_object_nameIn) {
    source_object_name = source_object_nameIn;
  }

/**
 *
 * Sets the TargetObjectName
 * @param target_object_nameIn Value of the target_object_name
 *
 */

  public void setTargetObjectName(String target_object_nameIn) {
    target_object_name = target_object_nameIn;
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
    source_object_name = (String)inputMap.get("SourceObjectName");
    target_object_name = (String)inputMap.get("TargetObjectName");
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
 * Gets the SourceObjectName
 * @return Value of the SourceObjectName
 *
 */

  public String getSourceObjectName( ) {
    return source_object_name;
  }

/**
 *
 * Gets the TargetObjectName
 * @return Value of the TargetObjectName
 *
 */

  public String getTargetObjectName( ) {
    return target_object_name;
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
