/*
 * Generated code DO NOT EDIT
 * Generated file: EftTransactionReleaseBulkUdtTemplateItem.java
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
 * Class used to create a EftTransactionReleaseBulkUdtTemplateItem Bulk Template
 *
 */

public class EftTransactionReleaseBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EftTransactionObjectKeyData eftRelIn;
/**
 *
 * Constructor to create a  EftTransactionReleaseBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EftTransactionReleaseBulkUdtTemplateItem(String id, BSDMSessionContext context, EftTransactionObjectKeyData eftRelInIn) {
    super(id, context, "EftTransactionRelease");
    eftRelIn = eftRelInIn;
  }

  public void translateToMap() {
    if (eftRelIn != null) {
      eftRelIn.resetFlags(true, true);
      addInput("EftTransaction", EftTransactionObjectKeyHelper.toMap(eftRelIn, new HashMap(), "EftTransactionObjectKeyData").get("EftTransactionObjectKeyData"));
    }
  }


/**
 *
 * Sets the EftTransaction
 * @param eftRelInIn Value of the eftRelIn
 *
 */

  public void setEftTransaction(EftTransactionObjectKeyData eftRelInIn) {
    eftRelIn = eftRelInIn;
  }

  public void translateFromMap() {
    eftRelIn = EftTransactionObjectKeyHelper.fromMap(inputMap, "EftTransaction");
  }

/**
 *
 * Gets the EftTransaction
 * @return Value of the EftTransaction
 *
 */

  public EftTransactionObjectKeyData getEftTransaction( ) {
    return eftRelIn;
  }

}
