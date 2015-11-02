/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCategoryDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountCategoryDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountCategoryDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ACObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountCategoryDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountCategoryDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ACObjectData noOpInIn) {
    super(id, context, "AccountCategoryDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountCategory", ACObjectHelper.toMap(noOpIn, new HashMap(), "AccountCategory").get("AccountCategory"));
    }
  }
/**
 *
 * Sets the  AccountCategory
 * @param noOpInIn ACObjectData to set
 *
 */
  public void setAccountCategory(ACObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountCategory passed into the constructor
 * @return Simulated response
 *
 */
  public ACObjectData getAccountCategory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ACObjectHelper.fromMap(inputMap, "AccountCategory");
  }
}
