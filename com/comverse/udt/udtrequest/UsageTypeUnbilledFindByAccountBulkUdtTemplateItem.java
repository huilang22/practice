/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeUnbilledFindByAccountBulkUdtTemplateItem.java
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
 * Class used to create a UsageTypeUnbilledFindByAccountBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeUnbilledFindByAccountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer Language_code;
  protected Integer account_no;
/**
 *
 * Constructor to create a  UsageTypeUnbilledFindByAccountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeUnbilledFindByAccountBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer Language_codeIn, Integer account_noIn) {
    super(id, context, "UsageTypeUnbilledFindByAccount");
    Language_code = Language_codeIn;
    account_no = account_noIn;
  }

  public void translateToMap() {
    if (Language_code != null) {
      addInput("LanguageCode", Language_code);
    }
    if (account_no != null) {
      addInput("AccountInternalId", account_no);
    }
  }


/**
 *
 * Sets the LanguageCode
 * @param Language_codeIn Value of the Language_code
 *
 */

  public void setLanguageCode(Integer Language_codeIn) {
    Language_code = Language_codeIn;
  }

/**
 *
 * Sets the AccountInternalId
 * @param account_noIn Value of the account_no
 *
 */

  public void setAccountInternalId(Integer account_noIn) {
    account_no = account_noIn;
  }

  public void translateFromMap() {
    Language_code = (Integer)inputMap.get("LanguageCode");
    account_no = (Integer)inputMap.get("AccountInternalId");
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public Integer getLanguageCode( ) {
    return Language_code;
  }

/**
 *
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return account_no;
  }

}
