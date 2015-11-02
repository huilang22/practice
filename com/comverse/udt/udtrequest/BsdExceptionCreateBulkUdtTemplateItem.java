/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdExceptionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdExceptionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdExceptionObjectData BsdExceptionCreateIn;
/**
 *
 * Constructor to create a  BsdExceptionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdExceptionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdExceptionObjectData BsdExceptionCreateInIn) {
    super(id, context, "BsdExceptionCreate");
    BsdExceptionCreateIn = BsdExceptionCreateInIn;
  }

  public void translateToMap() {
    if (BsdExceptionCreateIn != null) {
      BsdExceptionCreateIn.resetFlags(true, true);
      addInput("BsdException", BsdExceptionObjectHelper.toMap(BsdExceptionCreateIn, new HashMap(), "BsdException").get("BsdException"));
    }
  }


/**
 *
 * Sets the BsdException
 * @param BsdExceptionCreateInIn Value of the BsdExceptionCreateIn
 *
 */

  public void setBsdException(BsdExceptionObjectData BsdExceptionCreateInIn) {
    BsdExceptionCreateIn = BsdExceptionCreateInIn;
  }

  public void translateFromMap() {
    BsdExceptionCreateIn = BsdExceptionObjectHelper.fromMap(inputMap, "BsdException");
  }

/**
 *
 * Gets the BsdException
 * @return Value of the BsdException
 *
 */

  public BsdExceptionObjectData getBsdException( ) {
    return BsdExceptionCreateIn;
  }

}
