/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCategoryUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AccountCategoryUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountCategoryUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ACObjectData ACUpdateIn;
/**
 *
 * Constructor to create a  AccountCategoryUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountCategoryUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ACObjectData ACUpdateInIn) {
    super(id, context, "AccountCategoryUpdate");
    ACUpdateIn = ACUpdateInIn;
  }

  public void translateToMap() {
    if (ACUpdateIn != null) {
      ACUpdateIn.resetFlags(true, true);
      addInput("AccountCategory", ACObjectHelper.toMap(ACUpdateIn, new HashMap(), "AccountCategory").get("AccountCategory"));
    }
  }


/**
 *
 * Sets the AccountCategory
 * @param ACUpdateInIn Value of the ACUpdateIn
 *
 */

  public void setAccountCategory(ACObjectData ACUpdateInIn) {
    ACUpdateIn = ACUpdateInIn;
  }

  public void translateFromMap() {
    ACUpdateIn = ACObjectHelper.fromMap(inputMap, "AccountCategory");
  }

/**
 *
 * Gets the AccountCategory
 * @return Value of the AccountCategory
 *
 */

  public ACObjectData getAccountCategory( ) {
    return ACUpdateIn;
  }

}
