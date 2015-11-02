/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCategoryFindBulkUdtTemplateItem.java
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
 * Class used to create a AccountCategoryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountCategoryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ACObjectFilter ACFindIn;
/**
 *
 * Constructor to create a  AccountCategoryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountCategoryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ACObjectFilter ACFindInIn) {
    super(id, context, "AccountCategoryFind");
    ACFindIn = ACFindInIn;
  }

  public void translateToMap() {
    if (ACFindIn != null) {
      Integer index =  ACFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountCategory", ACObjectHelper.toMap(ACFindIn, new HashMap(), "AccountCategory").get("AccountCategory"));
    }
  }


/**
 *
 * Sets the AccountCategory
 * @param ACFindInIn Value of the ACFindIn
 *
 */

  public void setAccountCategory(ACObjectFilter ACFindInIn) {
    ACFindIn = ACFindInIn;
  }

  public void translateFromMap() {
    ACFindIn = ACObjectHelper.fromMapFilter(inputMap, "AccountCategory");
  }

/**
 *
 * Gets the AccountCategory
 * @return Value of the AccountCategory
 *
 */

  public ACObjectFilter getAccountCategory( ) {
    return ACFindIn;
  }

}
