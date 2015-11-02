/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountHqContractCreateBulkUdtTemplateItem.java
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
 * Class used to create a AccountHqContractCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountHqContractCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountHqContractObjectData AHCcreateIn;
/**
 *
 * Constructor to create a  AccountHqContractCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountHqContractCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountHqContractObjectData AHCcreateInIn) {
    super(id, context, "AccountHqContractCreate");
    AHCcreateIn = AHCcreateInIn;
  }

  public void translateToMap() {
    if (AHCcreateIn != null) {
      AHCcreateIn.resetFlags(true, true);
      addInput("AccountHqContract", AccountHqContractObjectHelper.toMap(AHCcreateIn, new HashMap(), "AccountHqContract").get("AccountHqContract"));
    }
  }


/**
 *
 * Sets the AccountHqContract
 * @param AHCcreateInIn Value of the AHCcreateIn
 *
 */

  public void setAccountHqContract(AccountHqContractObjectData AHCcreateInIn) {
    AHCcreateIn = AHCcreateInIn;
  }

  public void translateFromMap() {
    AHCcreateIn = AccountHqContractObjectHelper.fromMap(inputMap, "AccountHqContract");
  }

/**
 *
 * Gets the AccountHqContract
 * @return Value of the AccountHqContract
 *
 */

  public AccountHqContractObjectData getAccountHqContract( ) {
    return AHCcreateIn;
  }

}
