/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdExceptionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdExceptionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdExceptionObjectData BsdExceptionDeleteIn;
/**
 *
 * Constructor to create a  BsdExceptionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdExceptionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdExceptionObjectData BsdExceptionDeleteInIn) {
    super(id, context, "BsdExceptionDelete");
    BsdExceptionDeleteIn = BsdExceptionDeleteInIn;
  }

  public void translateToMap() {
    if (BsdExceptionDeleteIn != null) {
      BsdExceptionDeleteIn.resetFlags(true, true);
      addInput("BsdException", BsdExceptionObjectHelper.toMap(BsdExceptionDeleteIn, new HashMap(), "BsdException").get("BsdException"));
    }
  }


/**
 *
 * Sets the BsdException
 * @param BsdExceptionDeleteInIn Value of the BsdExceptionDeleteIn
 *
 */

  public void setBsdException(BsdExceptionObjectData BsdExceptionDeleteInIn) {
    BsdExceptionDeleteIn = BsdExceptionDeleteInIn;
  }

  public void translateFromMap() {
    BsdExceptionDeleteIn = BsdExceptionObjectHelper.fromMap(inputMap, "BsdException");
  }

/**
 *
 * Gets the BsdException
 * @return Value of the BsdException
 *
 */

  public BsdExceptionObjectData getBsdException( ) {
    return BsdExceptionDeleteIn;
  }

}
