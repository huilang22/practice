/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionGetInternalNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdExceptionGetInternalNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdExceptionGetInternalNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdExceptionObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdExceptionGetInternalNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdExceptionGetInternalNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdExceptionObjectData noOpInIn) {
    super(id, context, "BsdExceptionGetInternal");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdException", BsdExceptionObjectHelper.toMap(noOpIn, new HashMap(), "BsdException").get("BsdException"));
    }
  }
/**
 *
 * Sets the  BsdException
 * @param noOpInIn BsdExceptionObjectData to set
 *
 */
  public void setBsdException(BsdExceptionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdException passed into the constructor
 * @return Simulated response
 *
 */
  public BsdExceptionObjectData getBsdException() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdExceptionObjectHelper.fromMap(inputMap, "BsdException");
  }
}
