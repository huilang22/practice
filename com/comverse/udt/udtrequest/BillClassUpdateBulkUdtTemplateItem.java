/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillClassUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BillClassUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillClassUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BCObjectData BCUpdateIn;
/**
 *
 * Constructor to create a  BillClassUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillClassUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BCObjectData BCUpdateInIn) {
    super(id, context, "BillClassUpdate");
    BCUpdateIn = BCUpdateInIn;
  }

  public void translateToMap() {
    if (BCUpdateIn != null) {
      BCUpdateIn.resetFlags(true, true);
      addInput("BillClass", BCObjectHelper.toMap(BCUpdateIn, new HashMap(), "BillClass").get("BillClass"));
    }
  }


/**
 *
 * Sets the BillClass
 * @param BCUpdateInIn Value of the BCUpdateIn
 *
 */

  public void setBillClass(BCObjectData BCUpdateInIn) {
    BCUpdateIn = BCUpdateInIn;
  }

  public void translateFromMap() {
    BCUpdateIn = BCObjectHelper.fromMap(inputMap, "BillClass");
  }

/**
 *
 * Gets the BillClass
 * @return Value of the BillClass
 *
 */

  public BCObjectData getBillClass( ) {
    return BCUpdateIn;
  }

}
