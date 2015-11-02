/*
 * Generated code DO NOT EDIT
 * Generated file: EftTransactionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a EftTransactionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class EftTransactionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EftTransactionObjectData eftUpdateIn;
/**
 *
 * Constructor to create a  EftTransactionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EftTransactionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, EftTransactionObjectData eftUpdateInIn) {
    super(id, context, "EftTransactionUpdate");
    eftUpdateIn = eftUpdateInIn;
  }

  public void translateToMap() {
    if (eftUpdateIn != null) {
      eftUpdateIn.resetFlags(true, true);
      addInput("EftTransaction", EftTransactionObjectHelper.toMap(eftUpdateIn, new HashMap(), "EftTransaction").get("EftTransaction"));
    }
  }


/**
 *
 * Sets the EftTransaction
 * @param eftUpdateInIn Value of the eftUpdateIn
 *
 */

  public void setEftTransaction(EftTransactionObjectData eftUpdateInIn) {
    eftUpdateIn = eftUpdateInIn;
  }

  public void translateFromMap() {
    eftUpdateIn = EftTransactionObjectHelper.fromMap(inputMap, "EftTransaction");
  }

/**
 *
 * Gets the EftTransaction
 * @return Value of the EftTransaction
 *
 */

  public EftTransactionObjectData getEftTransaction( ) {
    return eftUpdateIn;
  }

}
