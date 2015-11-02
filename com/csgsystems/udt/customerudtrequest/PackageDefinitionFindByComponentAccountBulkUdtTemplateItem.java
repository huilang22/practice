/*
 * Generated code DO NOT EDIT
 * Generated file: PackageDefinitionFindByComponentAccountBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a PackageDefinitionFindByComponentAccountBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageDefinitionFindByComponentAccountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer _account_internal_id;
  protected Integer _language_code;
/**
 *
 * Constructor to create a  PackageDefinitionFindByComponentAccountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageDefinitionFindByComponentAccountBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer _account_internal_idIn, Integer _language_codeIn) {
    super(id, context, "PackageDefinitionFindByComponentAccount");
    _account_internal_id = _account_internal_idIn;
    _language_code = _language_codeIn;
  }

  public void translateToMap() {
    if (_account_internal_id != null) {
      addInput("AccountInternalId", _account_internal_id);
    }
    if (_language_code != null) {
      addInput("LanguageCode", _language_code);
    }
  }


/**
 *
 * Sets the AccountInternalId
 * @param _account_internal_idIn Value of the _account_internal_id
 *
 */

  public void setAccountInternalId(Integer _account_internal_idIn) {
    _account_internal_id = _account_internal_idIn;
  }

/**
 *
 * Sets the LanguageCode
 * @param _language_codeIn Value of the _language_code
 *
 */

  public void setLanguageCode(Integer _language_codeIn) {
    _language_code = _language_codeIn;
  }

  public void translateFromMap() {
    _account_internal_id = (Integer)inputMap.get("AccountInternalId");
    _language_code = (Integer)inputMap.get("LanguageCode");
  }

/**
 *
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return _account_internal_id;
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public Integer getLanguageCode( ) {
    return _language_code;
  }

}
