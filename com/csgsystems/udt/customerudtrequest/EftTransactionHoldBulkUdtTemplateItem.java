/*
 * Generated code DO NOT EDIT
 * Generated file: EftTransactionHoldBulkUdtTemplateItem.java
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
 * Class used to create a EftTransactionHoldBulkUdtTemplateItem Bulk Template
 *
 */

public class EftTransactionHoldBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EftTransactionObjectKeyData eftHoldIn;
/**
 *
 * Constructor to create a  EftTransactionHoldBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EftTransactionHoldBulkUdtTemplateItem(String id, BSDMSessionContext context, EftTransactionObjectKeyData eftHoldInIn) {
    super(id, context, "EftTransactionHold");
    eftHoldIn = eftHoldInIn;
  }

  public void translateToMap() {
    if (eftHoldIn != null) {
      eftHoldIn.resetFlags(true, true);
      addInput("EftTransaction", EftTransactionObjectKeyHelper.toMap(eftHoldIn, new HashMap(), "EftTransactionObjectKeyData").get("EftTransactionObjectKeyData"));
    }
  }


/**
 *
 * Sets the EftTransaction
 * @param eftHoldInIn Value of the eftHoldIn
 *
 */

  public void setEftTransaction(EftTransactionObjectKeyData eftHoldInIn) {
    eftHoldIn = eftHoldInIn;
  }

  public void translateFromMap() {
    eftHoldIn = EftTransactionObjectKeyHelper.fromMap(inputMap, "EftTransaction");
  }

/**
 *
 * Gets the EftTransaction
 * @return Value of the EftTransaction
 *
 */

  public EftTransactionObjectKeyData getEftTransaction( ) {
    return eftHoldIn;
  }

}
