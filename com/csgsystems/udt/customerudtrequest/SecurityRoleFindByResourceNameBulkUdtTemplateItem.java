/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityRoleFindByResourceNameBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a SecurityRoleFindByResourceNameBulkUdtTemplateItem Bulk Template
 *
 */

public class SecurityRoleFindByResourceNameBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected String res_name;
  protected Integer language_code;
/**
 *
 * Constructor to create a  SecurityRoleFindByResourceNameBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SecurityRoleFindByResourceNameBulkUdtTemplateItem(String id, BSDMSessionContext context, String res_nameIn, Integer language_codeIn) {
    super(id, context, "SecurityRoleFindByResourceName");
    res_name = res_nameIn;
    language_code = language_codeIn;
  }

  public void translateToMap() {
    if (res_name != null) {
      addInput("ResName", res_name);
    }
    if (language_code != null) {
      addInput("LanguageCode", language_code);
    }
  }


/**
 *
 * Sets the ResName
 * @param res_nameIn Value of the res_name
 *
 */

  public void setResName(String res_nameIn) {
    res_name = res_nameIn;
  }

/**
 *
 * Sets the LanguageCode
 * @param language_codeIn Value of the language_code
 *
 */

  public void setLanguageCode(Integer language_codeIn) {
    language_code = language_codeIn;
  }

  public void translateFromMap() {
    res_name = (String)inputMap.get("ResName");
    language_code = (Integer)inputMap.get("LanguageCode");
  }

/**
 *
 * Gets the ResName
 * @return Value of the ResName
 *
 */

  public String getResName( ) {
    return res_name;
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public Integer getLanguageCode( ) {
    return language_code;
  }

}
