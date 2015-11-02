/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdExceptionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdExceptionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdExceptionObjectFilter BsdExceptionFindExtIn;
/**
 *
 * Constructor to create a  BsdExceptionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdExceptionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdExceptionObjectFilter BsdExceptionFindExtInIn) {
    super(id, context, "BsdExceptionFind");
    BsdExceptionFindExtIn = BsdExceptionFindExtInIn;
  }

  public void translateToMap() {
    if (BsdExceptionFindExtIn != null) {
      Integer index =  BsdExceptionFindExtIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdException", BsdExceptionObjectHelper.toMap(BsdExceptionFindExtIn, new HashMap(), "BsdException").get("BsdException"));
    }
  }


/**
 *
 * Sets the BsdException
 * @param BsdExceptionFindExtInIn Value of the BsdExceptionFindExtIn
 *
 */

  public void setBsdException(BsdExceptionObjectFilter BsdExceptionFindExtInIn) {
    BsdExceptionFindExtIn = BsdExceptionFindExtInIn;
  }

  public void translateFromMap() {
    BsdExceptionFindExtIn = BsdExceptionObjectHelper.fromMapFilter(inputMap, "BsdException");
  }

/**
 *
 * Gets the BsdException
 * @return Value of the BsdException
 *
 */

  public BsdExceptionObjectFilter getBsdException( ) {
    return BsdExceptionFindExtIn;
  }

}
