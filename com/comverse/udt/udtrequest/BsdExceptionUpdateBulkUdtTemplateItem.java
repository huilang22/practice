/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BsdExceptionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdExceptionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdExceptionObjectData BsdExceptionUpdateIn;
/**
 *
 * Constructor to create a  BsdExceptionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdExceptionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdExceptionObjectData BsdExceptionUpdateInIn) {
    super(id, context, "BsdExceptionUpdate");
    BsdExceptionUpdateIn = BsdExceptionUpdateInIn;
  }

  public void translateToMap() {
    if (BsdExceptionUpdateIn != null) {
      BsdExceptionUpdateIn.resetFlags(true, true);
      addInput("BsdException", BsdExceptionObjectHelper.toMap(BsdExceptionUpdateIn, new HashMap(), "BsdException").get("BsdException"));
    }
  }


/**
 *
 * Sets the BsdException
 * @param BsdExceptionUpdateInIn Value of the BsdExceptionUpdateIn
 *
 */

  public void setBsdException(BsdExceptionObjectData BsdExceptionUpdateInIn) {
    BsdExceptionUpdateIn = BsdExceptionUpdateInIn;
  }

  public void translateFromMap() {
    BsdExceptionUpdateIn = BsdExceptionObjectHelper.fromMap(inputMap, "BsdException");
  }

/**
 *
 * Gets the BsdException
 * @return Value of the BsdException
 *
 */

  public BsdExceptionObjectData getBsdException( ) {
    return BsdExceptionUpdateIn;
  }

}
