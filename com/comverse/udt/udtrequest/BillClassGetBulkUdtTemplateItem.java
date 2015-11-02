/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillClassGetBulkUdtTemplateItem.java
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
 * Class used to create a BillClassGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BillClassGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BCObjectKeyData BCGetIn;
/**
 *
 * Constructor to create a  BillClassGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillClassGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BCObjectKeyData BCGetInIn) {
    super(id, context, "BillClassGet");
    BCGetIn = BCGetInIn;
  }

  public void translateToMap() {
    if (BCGetIn != null) {
      BCGetIn.resetFlags(true, true);
      addInput("BillClass", BCObjectKeyHelper.toMap(BCGetIn, new HashMap(), "BCObjectKeyData").get("BCObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillClass
 * @param BCGetInIn Value of the BCGetIn
 *
 */

  public void setBillClass(BCObjectKeyData BCGetInIn) {
    BCGetIn = BCGetInIn;
  }

  public void translateFromMap() {
    BCGetIn = BCObjectKeyHelper.fromMap(inputMap, "BillClass");
  }

/**
 *
 * Gets the BillClass
 * @return Value of the BillClass
 *
 */

  public BCObjectKeyData getBillClass( ) {
    return BCGetIn;
  }

}
