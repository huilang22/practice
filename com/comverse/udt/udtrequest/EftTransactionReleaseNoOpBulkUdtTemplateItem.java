/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftTransactionReleaseNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EftTransactionReleaseNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EftTransactionReleaseNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EftTransactionObjectData noOpIn;

/**
 *
 * Constructor to create a   EftTransactionReleaseNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EftTransactionReleaseNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EftTransactionObjectData noOpInIn) {
    super(id, context, "EftTransactionRelease");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EftTransaction", EftTransactionObjectHelper.toMap(noOpIn, new HashMap(), "EftTransaction").get("EftTransaction"));
    }
  }
/**
 *
 * Sets the  EftTransaction
 * @param noOpInIn EftTransactionObjectData to set
 *
 */
  public void setEftTransaction(EftTransactionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EftTransaction passed into the constructor
 * @return Simulated response
 *
 */
  public EftTransactionObjectData getEftTransaction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EftTransactionObjectHelper.fromMap(inputMap, "EftTransaction");
  }
}
