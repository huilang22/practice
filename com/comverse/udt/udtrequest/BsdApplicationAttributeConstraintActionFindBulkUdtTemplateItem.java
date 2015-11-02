/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationAttributeConstraintActionFindBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * Class used to create a BsdApplicationAttributeConstraintActionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationAttributeConstraintActionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected String businessUnitName;
  protected String applicationName;
  protected String objectName;
  protected String actionName;
  protected Integer languageCode;
  protected Date effectiveDate;
/**
 *
 * Constructor to create a  BsdApplicationAttributeConstraintActionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationAttributeConstraintActionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, String businessUnitNameIn, String applicationNameIn, String objectNameIn, String actionNameIn, Integer languageCodeIn, Date effectiveDateIn) {
    super(id, context, "BsdApplicationAttributeConstraintActionFind");
    businessUnitName = businessUnitNameIn;
    applicationName = applicationNameIn;
    objectName = objectNameIn;
    actionName = actionNameIn;
    languageCode = languageCodeIn;
    effectiveDate = effectiveDateIn;
  }

  public void translateToMap() {
    if (businessUnitName != null) {
      addInput("BusinessUnitName", businessUnitName);
    }
    if (applicationName != null) {
      addInput("ApplicationName", applicationName);
    }
    if (objectName != null) {
      addInput("ObjectName", objectName);
    }
    if (actionName != null) {
      addInput("ActionName", actionName);
    }
    if (languageCode != null) {
      addInput("LanguageCode", languageCode);
    }
    if (effectiveDate != null) {
      addInput("EffectiveDate", effectiveDate);
    }
  }


/**
 *
 * Sets the BusinessUnitName
 * @param businessUnitNameIn Value of the businessUnitName
 *
 */

  public void setBusinessUnitName(String businessUnitNameIn) {
    businessUnitName = businessUnitNameIn;
  }

/**
 *
 * Sets the ApplicationName
 * @param applicationNameIn Value of the applicationName
 *
 */

  public void setApplicationName(String applicationNameIn) {
    applicationName = applicationNameIn;
  }

/**
 *
 * Sets the ObjectName
 * @param objectNameIn Value of the objectName
 *
 */

  public void setObjectName(String objectNameIn) {
    objectName = objectNameIn;
  }

/**
 *
 * Sets the ActionName
 * @param actionNameIn Value of the actionName
 *
 */

  public void setActionName(String actionNameIn) {
    actionName = actionNameIn;
  }

/**
 *
 * Sets the LanguageCode
 * @param languageCodeIn Value of the languageCode
 *
 */

  public void setLanguageCode(Integer languageCodeIn) {
    languageCode = languageCodeIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param effectiveDateIn Value of the effectiveDate
 *
 */

  public void setEffectiveDate(Date effectiveDateIn) {
    effectiveDate = effectiveDateIn;
  }

  public void translateFromMap() {
    businessUnitName = (String)inputMap.get("BusinessUnitName");
    applicationName = (String)inputMap.get("ApplicationName");
    objectName = (String)inputMap.get("ObjectName");
    actionName = (String)inputMap.get("ActionName");
    languageCode = (Integer)inputMap.get("LanguageCode");
    effectiveDate = (Date)inputMap.get("EffectiveDate");
  }

/**
 *
 * Gets the BusinessUnitName
 * @return Value of the BusinessUnitName
 *
 */

  public String getBusinessUnitName( ) {
    return businessUnitName;
  }

/**
 *
 * Gets the ApplicationName
 * @return Value of the ApplicationName
 *
 */

  public String getApplicationName( ) {
    return applicationName;
  }

/**
 *
 * Gets the ObjectName
 * @return Value of the ObjectName
 *
 */

  public String getObjectName( ) {
    return objectName;
  }

/**
 *
 * Gets the ActionName
 * @return Value of the ActionName
 *
 */

  public String getActionName( ) {
    return actionName;
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public Integer getLanguageCode( ) {
    return languageCode;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return effectiveDate;
  }

}
