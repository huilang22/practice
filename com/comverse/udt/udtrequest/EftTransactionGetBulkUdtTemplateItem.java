/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftTransactionGetBulkUdtTemplateItem.java
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
 * Class used to create a EftTransactionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class EftTransactionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EftTransactionObjectKeyData eftGetIn;
/**
 *
 * Constructor to create a  EftTransactionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EftTransactionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, EftTransactionObjectKeyData eftGetInIn) {
    super(id, context, "EftTransactionGet");
    eftGetIn = eftGetInIn;
  }

  public void translateToMap() {
    if (eftGetIn != null) {
      eftGetIn.resetFlags(true, true);
      addInput("EftTransaction", EftTransactionObjectKeyHelper.toMap(eftGetIn, new HashMap(), "EftTransactionObjectKeyData").get("EftTransactionObjectKeyData"));
    }
  }


/**
 *
 * Sets the EftTransaction
 * @param eftGetInIn Value of the eftGetIn
 *
 */

  public void setEftTransaction(EftTransactionObjectKeyData eftGetInIn) {
    eftGetIn = eftGetInIn;
  }

  public void translateFromMap() {
    eftGetIn = EftTransactionObjectKeyHelper.fromMap(inputMap, "EftTransaction");
  }

/**
 *
 * Gets the EftTransaction
 * @return Value of the EftTransaction
 *
 */

  public EftTransactionObjectKeyData getEftTransaction( ) {
    return eftGetIn;
  }

}
