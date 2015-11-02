/*
 * Generated code DO NOT EDIT
 * Generated file: EftTransactionUpdateFromAccountBulkUdtTemplateItem.java
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
 * Class used to create a EftTransactionUpdateFromAccountBulkUdtTemplateItem Bulk Template
 *
 */

public class EftTransactionUpdateFromAccountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EftTransUFAObjectData eftUpdateFAIn;
/**
 *
 * Constructor to create a  EftTransactionUpdateFromAccountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EftTransactionUpdateFromAccountBulkUdtTemplateItem(String id, BSDMSessionContext context, EftTransUFAObjectData eftUpdateFAInIn) {
    super(id, context, "EftTransactionUpdateFromAccount");
    eftUpdateFAIn = eftUpdateFAInIn;
  }

  public void translateToMap() {
    if (eftUpdateFAIn != null) {
      eftUpdateFAIn.resetFlags(true, true);
      addInput("EftTransaction", EftTransUFAObjectHelper.toMap(eftUpdateFAIn, new HashMap(), "EftTransaction").get("EftTransaction"));
    }
  }


/**
 *
 * Sets the EftTransaction
 * @param eftUpdateFAInIn Value of the eftUpdateFAIn
 *
 */

  public void setEftTransaction(EftTransUFAObjectData eftUpdateFAInIn) {
    eftUpdateFAIn = eftUpdateFAInIn;
  }

  public void translateFromMap() {
    eftUpdateFAIn = EftTransUFAObjectHelper.fromMap(inputMap, "EftTransaction");
  }

/**
 *
 * Gets the EftTransaction
 * @return Value of the EftTransaction
 *
 */

  public EftTransUFAObjectData getEftTransaction( ) {
    return eftUpdateFAIn;
  }

}
