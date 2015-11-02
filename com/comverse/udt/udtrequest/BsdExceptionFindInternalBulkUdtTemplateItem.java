/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionFindInternalBulkUdtTemplateItem.java
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
 * Class used to create a BsdExceptionFindInternalBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdExceptionFindInternalBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdExceptionObjectFilter BsdExceptionFindIn;
/**
 *
 * Constructor to create a  BsdExceptionFindInternalBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdExceptionFindInternalBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdExceptionObjectFilter BsdExceptionFindInIn) {
    super(id, context, "BsdExceptionFindInternal");
    BsdExceptionFindIn = BsdExceptionFindInIn;
  }

  public void translateToMap() {
    if (BsdExceptionFindIn != null) {
      Integer index =  BsdExceptionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdException", BsdExceptionObjectHelper.toMap(BsdExceptionFindIn, new HashMap(), "BsdException").get("BsdException"));
    }
  }


/**
 *
 * Sets the BsdException
 * @param BsdExceptionFindInIn Value of the BsdExceptionFindIn
 *
 */

  public void setBsdException(BsdExceptionObjectFilter BsdExceptionFindInIn) {
    BsdExceptionFindIn = BsdExceptionFindInIn;
  }

  public void translateFromMap() {
    BsdExceptionFindIn = BsdExceptionObjectHelper.fromMapFilter(inputMap, "BsdException");
  }

/**
 *
 * Gets the BsdException
 * @return Value of the BsdException
 *
 */

  public BsdExceptionObjectFilter getBsdException( ) {
    return BsdExceptionFindIn;
  }

}
