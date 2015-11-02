/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrFindByAccountBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a NrcTransDescrFindByAccountBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcTransDescrFindByAccountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer language_code;
  protected Integer account_internal_id;
/**
 *
 * Constructor to create a  NrcTransDescrFindByAccountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcTransDescrFindByAccountBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer language_codeIn, Integer account_internal_idIn) {
    super(id, context, "NrcTransDescrFindByAccount");
    language_code = language_codeIn;
    account_internal_id = account_internal_idIn;
  }

  public void translateToMap() {
    if (language_code != null) {
      addInput("LanguageCode", language_code);
    }
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
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

/**
 *
 * Sets the AccountInternalId
 * @param account_internal_idIn Value of the account_internal_id
 *
 */

  public void setAccountInternalId(Integer account_internal_idIn) {
    account_internal_id = account_internal_idIn;
  }

  public void translateFromMap() {
    language_code = (Integer)inputMap.get("LanguageCode");
    account_internal_id = (Integer)inputMap.get("AccountInternalId");
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

/**
 *
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return account_internal_id;
  }

}
