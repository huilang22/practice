/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionGetInternalBulkUdtTemplateItem.java
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
import com.csgsystems.sfq.data.*;

/**
 *
 * Class used to create a BsdExceptionGetInternalBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdExceptionGetInternalBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdExceptionObjectKeyData BsdExceptionGetIn;
/**
 *
 * Constructor to create a  BsdExceptionGetInternalBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdExceptionGetInternalBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdExceptionObjectKeyData BsdExceptionGetInIn) {
    super(id, context, "BsdExceptionGetInternal");
    BsdExceptionGetIn = BsdExceptionGetInIn;
  }

  public void translateToMap() {
    if (BsdExceptionGetIn != null) {
      BsdExceptionGetIn.resetFlags(true, true);
      addInput("BsdException", BsdExceptionObjectKeyHelper.toMap(BsdExceptionGetIn, new HashMap(), "BsdExceptionObjectKeyData").get("BsdExceptionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdException
 * @param BsdExceptionGetInIn Value of the BsdExceptionGetIn
 *
 */

  public void setBsdException(BsdExceptionObjectKeyData BsdExceptionGetInIn) {
    BsdExceptionGetIn = BsdExceptionGetInIn;
  }

  public void translateFromMap() {
    BsdExceptionGetIn = BsdExceptionObjectKeyHelper.fromMap(inputMap, "BsdException");
  }

/**
 *
 * Gets the BsdException
 * @return Value of the BsdException
 *
 */

  public BsdExceptionObjectKeyData getBsdException( ) {
    return BsdExceptionGetIn;
  }

}
