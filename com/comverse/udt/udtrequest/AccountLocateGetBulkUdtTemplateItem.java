/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a AccountLocateGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountLocateGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountLocateObjectKeyData algIn;
/**
 *
 * Constructor to create a  AccountLocateGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountLocateGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountLocateObjectKeyData algInIn) {
    super(id, context, "AccountLocateGet");
    algIn = algInIn;
  }

  public void translateToMap() {
    if (algIn != null) {
      algIn.resetFlags(true, true);
      addInput("AccountLocate", AccountLocateObjectKeyHelper.toMap(algIn, new HashMap(), "AccountLocateObjectKeyData").get("AccountLocateObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountLocate
 * @param algInIn Value of the algIn
 *
 */

  public void setAccountLocate(AccountLocateObjectKeyData algInIn) {
    algIn = algInIn;
  }

  public void translateFromMap() {
    algIn = AccountLocateObjectKeyHelper.fromMap(inputMap, "AccountLocate");
  }

/**
 *
 * Gets the AccountLocate
 * @return Value of the AccountLocate
 *
 */

  public AccountLocateObjectKeyData getAccountLocate( ) {
    return algIn;
  }

}
