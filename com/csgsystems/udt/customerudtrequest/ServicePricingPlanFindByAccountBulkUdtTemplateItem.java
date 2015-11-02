/*
 * Generated code DO NOT EDIT
 * Generated file: ServicePricingPlanFindByAccountBulkUdtTemplateItem.java
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
 * Class used to create a ServicePricingPlanFindByAccountBulkUdtTemplateItem Bulk Template
 *
 */

public class ServicePricingPlanFindByAccountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer account_internal_id;
  protected Integer language_code;
/**
 *
 * Constructor to create a  ServicePricingPlanFindByAccountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServicePricingPlanFindByAccountBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer account_internal_idIn, Integer language_codeIn) {
    super(id, context, "ServicePricingPlanFindByAccount");
    account_internal_id = account_internal_idIn;
    language_code = language_codeIn;
  }

  public void translateToMap() {
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
    if (language_code != null) {
      addInput("LanguageCode", language_code);
    }
  }


/**
 *
 * Sets the AccountInternalId
 * @param account_internal_idIn Value of the account_internal_id
 *
 */

  public void setAccountInternalId(Integer account_internal_idIn) {
    account_internal_id = account_internal_idIn;
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
    account_internal_id = (Integer)inputMap.get("AccountInternalId");
    language_code = (Integer)inputMap.get("LanguageCode");
  }

/**
 *
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return account_internal_id;
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
