/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftTransactionFindBulkUdtTemplateItem.java
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
 * Class used to create a EftTransactionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class EftTransactionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EftTransactionObjectFilter eftFindIn;
/**
 *
 * Constructor to create a  EftTransactionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EftTransactionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, EftTransactionObjectFilter eftFindInIn) {
    super(id, context, "EftTransactionFind");
    eftFindIn = eftFindInIn;
  }

  public void translateToMap() {
    if (eftFindIn != null) {
      Integer index =  eftFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EftTransaction", EftTransactionObjectHelper.toMap(eftFindIn, new HashMap(), "EftTransaction").get("EftTransaction"));
    }
  }


/**
 *
 * Sets the EftTransaction
 * @param eftFindInIn Value of the eftFindIn
 *
 */

  public void setEftTransaction(EftTransactionObjectFilter eftFindInIn) {
    eftFindIn = eftFindInIn;
  }

  public void translateFromMap() {
    eftFindIn = EftTransactionObjectHelper.fromMapFilter(inputMap, "EftTransaction");
  }

/**
 *
 * Gets the EftTransaction
 * @return Value of the EftTransaction
 *
 */

  public EftTransactionObjectFilter getEftTransaction( ) {
    return eftFindIn;
  }

}
