/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationRelationalConstraintActionFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationRelationalConstraintActionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationRelationalConstraintActionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected String businessUnitName;
  protected String applicationName;
  protected String sourceObjectName;
  protected String targetObjectName;
  protected String actionName;
  protected Integer languageCode;
  protected Date effectiveDate;
/**
 *
 * Constructor to create a  BsdApplicationRelationalConstraintActionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationRelationalConstraintActionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, String businessUnitNameIn, String applicationNameIn, String sourceObjectNameIn, String targetObjectNameIn, String actionNameIn, Integer languageCodeIn, Date effectiveDateIn) {
    super(id, context, "BsdApplicationRelationalConstraintActionFind");
    businessUnitName = businessUnitNameIn;
    applicationName = applicationNameIn;
    sourceObjectName = sourceObjectNameIn;
    targetObjectName = targetObjectNameIn;
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
    if (sourceObjectName != null) {
      addInput("SourceObjectName", sourceObjectName);
    }
    if (targetObjectName != null) {
      addInput("TargetObjectName", targetObjectName);
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
 * Sets the SourceObjectName
 * @param sourceObjectNameIn Value of the sourceObjectName
 *
 */

  public void setSourceObjectName(String sourceObjectNameIn) {
    sourceObjectName = sourceObjectNameIn;
  }

/**
 *
 * Sets the TargetObjectName
 * @param targetObjectNameIn Value of the targetObjectName
 *
 */

  public void setTargetObjectName(String targetObjectNameIn) {
    targetObjectName = targetObjectNameIn;
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
    sourceObjectName = (String)inputMap.get("SourceObjectName");
    targetObjectName = (String)inputMap.get("TargetObjectName");
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
 * Gets the SourceObjectName
 * @return Value of the SourceObjectName
 *
 */

  public String getSourceObjectName( ) {
    return sourceObjectName;
  }

/**
 *
 * Gets the TargetObjectName
 * @return Value of the TargetObjectName
 *
 */

  public String getTargetObjectName( ) {
    return targetObjectName;
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
