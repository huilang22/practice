/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountHqContractGetBulkUdtTemplateItem.java
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
 * Class used to create a AccountHqContractGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountHqContractGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountHqContractObjectKeyData AHCgetIn;
/**
 *
 * Constructor to create a  AccountHqContractGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountHqContractGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountHqContractObjectKeyData AHCgetInIn) {
    super(id, context, "AccountHqContractGet");
    AHCgetIn = AHCgetInIn;
  }

  public void translateToMap() {
    if (AHCgetIn != null) {
      AHCgetIn.resetFlags(true, true);
      addInput("AccountHqContract", AccountHqContractObjectKeyHelper.toMap(AHCgetIn, new HashMap(), "AccountHqContractObjectKeyData").get("AccountHqContractObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountHqContract
 * @param AHCgetInIn Value of the AHCgetIn
 *
 */

  public void setAccountHqContract(AccountHqContractObjectKeyData AHCgetInIn) {
    AHCgetIn = AHCgetInIn;
  }

  public void translateFromMap() {
    AHCgetIn = AccountHqContractObjectKeyHelper.fromMap(inputMap, "AccountHqContract");
  }

/**
 *
 * Gets the AccountHqContract
 * @return Value of the AccountHqContract
 *
 */

  public AccountHqContractObjectKeyData getAccountHqContract( ) {
    return AHCgetIn;
  }

}
