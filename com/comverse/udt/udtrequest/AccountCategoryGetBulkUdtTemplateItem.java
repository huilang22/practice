/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCategoryGetBulkUdtTemplateItem.java
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
 * Class used to create a AccountCategoryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountCategoryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ACObjectKeyData ACGetIn;
/**
 *
 * Constructor to create a  AccountCategoryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountCategoryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ACObjectKeyData ACGetInIn) {
    super(id, context, "AccountCategoryGet");
    ACGetIn = ACGetInIn;
  }

  public void translateToMap() {
    if (ACGetIn != null) {
      ACGetIn.resetFlags(true, true);
      addInput("AccountCategory", ACObjectKeyHelper.toMap(ACGetIn, new HashMap(), "ACObjectKeyData").get("ACObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountCategory
 * @param ACGetInIn Value of the ACGetIn
 *
 */

  public void setAccountCategory(ACObjectKeyData ACGetInIn) {
    ACGetIn = ACGetInIn;
  }

  public void translateFromMap() {
    ACGetIn = ACObjectKeyHelper.fromMap(inputMap, "AccountCategory");
  }

/**
 *
 * Gets the AccountCategory
 * @return Value of the AccountCategory
 *
 */

  public ACObjectKeyData getAccountCategory( ) {
    return ACGetIn;
  }

}
