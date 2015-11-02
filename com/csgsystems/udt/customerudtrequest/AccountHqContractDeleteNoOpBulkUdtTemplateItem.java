/*
 * Generated code DO NOT EDIT
 * Generated file: AccountHqContractDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountHqContractDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountHqContractDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountHqContractObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountHqContractDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountHqContractDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountHqContractObjectData noOpInIn) {
    super(id, context, "AccountHqContractDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountHqContract", AccountHqContractObjectHelper.toMap(noOpIn, new HashMap(), "AccountHqContract").get("AccountHqContract"));
    }
  }
/**
 *
 * Sets the  AccountHqContract
 * @param noOpInIn AccountHqContractObjectData to set
 *
 */
  public void setAccountHqContract(AccountHqContractObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountHqContract passed into the constructor
 * @return Simulated response
 *
 */
  public AccountHqContractObjectData getAccountHqContract() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountHqContractObjectHelper.fromMap(inputMap, "AccountHqContract");
  }
}
