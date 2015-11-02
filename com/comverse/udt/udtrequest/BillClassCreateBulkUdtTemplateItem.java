/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillClassCreateBulkUdtTemplateItem.java
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
 * Class used to create a BillClassCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillClassCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BCObjectData BCCreateIn;
/**
 *
 * Constructor to create a  BillClassCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillClassCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BCObjectData BCCreateInIn) {
    super(id, context, "BillClassCreate");
    BCCreateIn = BCCreateInIn;
  }

  public void translateToMap() {
    if (BCCreateIn != null) {
      BCCreateIn.resetFlags(true, true);
      addInput("BillClass", BCObjectHelper.toMap(BCCreateIn, new HashMap(), "BillClass").get("BillClass"));
    }
  }


/**
 *
 * Sets the BillClass
 * @param BCCreateInIn Value of the BCCreateIn
 *
 */

  public void setBillClass(BCObjectData BCCreateInIn) {
    BCCreateIn = BCCreateInIn;
  }

  public void translateFromMap() {
    BCCreateIn = BCObjectHelper.fromMap(inputMap, "BillClass");
  }

/**
 *
 * Gets the BillClass
 * @return Value of the BillClass
 *
 */

  public BCObjectData getBillClass( ) {
    return BCCreateIn;
  }

}
