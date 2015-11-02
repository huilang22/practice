/*
 * Generated code DO NOT EDIT
 * Generated file: AccountHqContractFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a AccountHqContractFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountHqContractFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountHqContractObjectFilter AHCfindIn;
/**
 *
 * Constructor to create a  AccountHqContractFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountHqContractFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountHqContractObjectFilter AHCfindInIn) {
    super(id, context, "AccountHqContractFind");
    AHCfindIn = AHCfindInIn;
  }

  public void translateToMap() {
    if (AHCfindIn != null) {
      Integer index =  AHCfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountHqContract", AccountHqContractObjectHelper.toMap(AHCfindIn, new HashMap(), "AccountHqContract").get("AccountHqContract"));
    }
  }


/**
 *
 * Sets the AccountHqContract
 * @param AHCfindInIn Value of the AHCfindIn
 *
 */

  public void setAccountHqContract(AccountHqContractObjectFilter AHCfindInIn) {
    AHCfindIn = AHCfindInIn;
  }

  public void translateFromMap() {
    AHCfindIn = AccountHqContractObjectHelper.fromMapFilter(inputMap, "AccountHqContract");
  }

/**
 *
 * Gets the AccountHqContract
 * @return Value of the AccountHqContract
 *
 */

  public AccountHqContractObjectFilter getAccountHqContract( ) {
    return AHCfindIn;
  }

}
