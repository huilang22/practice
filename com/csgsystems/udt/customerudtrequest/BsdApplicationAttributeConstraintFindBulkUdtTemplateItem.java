/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationAttributeConstraintFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationAttributeConstraintFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationAttributeConstraintFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected String BusinessUnitName;
  protected String ApplicationName;
  protected Integer LanguageCode;
/**
 *
 * Constructor to create a  BsdApplicationAttributeConstraintFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationAttributeConstraintFindBulkUdtTemplateItem(String id, BSDMSessionContext context, String BusinessUnitNameIn, String ApplicationNameIn, Integer LanguageCodeIn) {
    super(id, context, "BsdApplicationAttributeConstraintFind");
    BusinessUnitName = BusinessUnitNameIn;
    ApplicationName = ApplicationNameIn;
    LanguageCode = LanguageCodeIn;
  }

  public void translateToMap() {
    if (BusinessUnitName != null) {
      addInput("BusinessUnitName", BusinessUnitName);
    }
    if (ApplicationName != null) {
      addInput("ApplicationName", ApplicationName);
    }
    if (LanguageCode != null) {
      addInput("LanguageCode", LanguageCode);
    }
  }


/**
 *
 * Sets the BusinessUnitName
 * @param BusinessUnitNameIn Value of the BusinessUnitName
 *
 */

  public void setBusinessUnitName(String BusinessUnitNameIn) {
    BusinessUnitName = BusinessUnitNameIn;
  }

/**
 *
 * Sets the ApplicationName
 * @param ApplicationNameIn Value of the ApplicationName
 *
 */

  public void setApplicationName(String ApplicationNameIn) {
    ApplicationName = ApplicationNameIn;
  }

/**
 *
 * Sets the LanguageCode
 * @param LanguageCodeIn Value of the LanguageCode
 *
 */

  public void setLanguageCode(Integer LanguageCodeIn) {
    LanguageCode = LanguageCodeIn;
  }

  public void translateFromMap() {
    BusinessUnitName = (String)inputMap.get("BusinessUnitName");
    ApplicationName = (String)inputMap.get("ApplicationName");
    LanguageCode = (Integer)inputMap.get("LanguageCode");
  }

/**
 *
 * Gets the BusinessUnitName
 * @return Value of the BusinessUnitName
 *
 */

  public String getBusinessUnitName( ) {
    return BusinessUnitName;
  }

/**
 *
 * Gets the ApplicationName
 * @return Value of the ApplicationName
 *
 */

  public String getApplicationName( ) {
    return ApplicationName;
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public Integer getLanguageCode( ) {
    return LanguageCode;
  }

}
