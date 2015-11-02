/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountHqContractUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AccountHqContractUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountHqContractUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountHqContractObjectData AHCupdateIn;
/**
 *
 * Constructor to create a  AccountHqContractUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountHqContractUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountHqContractObjectData AHCupdateInIn) {
    super(id, context, "AccountHqContractUpdate");
    AHCupdateIn = AHCupdateInIn;
  }

  public void translateToMap() {
    if (AHCupdateIn != null) {
      AHCupdateIn.resetFlags(true, true);
      addInput("AccountHqContract", AccountHqContractObjectHelper.toMap(AHCupdateIn, new HashMap(), "AccountHqContract").get("AccountHqContract"));
    }
  }


/**
 *
 * Sets the AccountHqContract
 * @param AHCupdateInIn Value of the AHCupdateIn
 *
 */

  public void setAccountHqContract(AccountHqContractObjectData AHCupdateInIn) {
    AHCupdateIn = AHCupdateInIn;
  }

  public void translateFromMap() {
    AHCupdateIn = AccountHqContractObjectHelper.fromMap(inputMap, "AccountHqContract");
  }

/**
 *
 * Gets the AccountHqContract
 * @return Value of the AccountHqContract
 *
 */

  public AccountHqContractObjectData getAccountHqContract( ) {
    return AHCupdateIn;
  }

}
