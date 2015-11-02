/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdActionDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * Class used to create a BsdActionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdActionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdActionObjectKeyData bsdActionDeleteIn;
/**
 *
 * Constructor to create a  BsdActionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdActionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdActionObjectKeyData bsdActionDeleteInIn) {
    super(id, context, "BsdActionDelete");
    bsdActionDeleteIn = bsdActionDeleteInIn;
  }

  public void translateToMap() {
    if (bsdActionDeleteIn != null) {
      bsdActionDeleteIn.resetFlags(true, true);
      addInput("BsdAction", BsdActionObjectKeyHelper.toMap(bsdActionDeleteIn, new HashMap(), "BsdActionObjectKeyData").get("BsdActionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdAction
 * @param bsdActionDeleteInIn Value of the bsdActionDeleteIn
 *
 */

  public void setBsdAction(BsdActionObjectKeyData bsdActionDeleteInIn) {
    bsdActionDeleteIn = bsdActionDeleteInIn;
  }

  public void translateFromMap() {
    bsdActionDeleteIn = BsdActionObjectKeyHelper.fromMap(inputMap, "BsdAction");
  }

/**
 *
 * Gets the BsdAction
 * @return Value of the BsdAction
 *
 */

  public BsdActionObjectKeyData getBsdAction( ) {
    return bsdActionDeleteIn;
  }

}
