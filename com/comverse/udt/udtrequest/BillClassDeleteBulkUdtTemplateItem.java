/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillClassDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a BillClassDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BillClassDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BCObjectKeyData BCDeleteIn;
/**
 *
 * Constructor to create a  BillClassDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillClassDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BCObjectKeyData BCDeleteInIn) {
    super(id, context, "BillClassDelete");
    BCDeleteIn = BCDeleteInIn;
  }

  public void translateToMap() {
    if (BCDeleteIn != null) {
      BCDeleteIn.resetFlags(true, true);
      addInput("BillClass", BCObjectKeyHelper.toMap(BCDeleteIn, new HashMap(), "BCObjectKeyData").get("BCObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillClass
 * @param BCDeleteInIn Value of the BCDeleteIn
 *
 */

  public void setBillClass(BCObjectKeyData BCDeleteInIn) {
    BCDeleteIn = BCDeleteInIn;
  }

  public void translateFromMap() {
    BCDeleteIn = BCObjectKeyHelper.fromMap(inputMap, "BillClass");
  }

/**
 *
 * Gets the BillClass
 * @return Value of the BillClass
 *
 */

  public BCObjectKeyData getBillClass( ) {
    return BCDeleteIn;
  }

}
