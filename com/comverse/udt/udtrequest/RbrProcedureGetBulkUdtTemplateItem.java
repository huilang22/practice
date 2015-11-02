/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrProcedureGetBulkUdtTemplateItem.java
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
 * Class used to create a RbrProcedureGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrProcedureGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrProcObjectKeyData RbrProcGetIn;
/**
 *
 * Constructor to create a  RbrProcedureGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrProcedureGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrProcObjectKeyData RbrProcGetInIn) {
    super(id, context, "RbrProcedureGet");
    RbrProcGetIn = RbrProcGetInIn;
  }

  public void translateToMap() {
    if (RbrProcGetIn != null) {
      RbrProcGetIn.resetFlags(true, true);
      addInput("RbrProcedure", RbrProcObjectKeyHelper.toMap(RbrProcGetIn, new HashMap(), "RbrProcObjectKeyData").get("RbrProcObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrProcedure
 * @param RbrProcGetInIn Value of the RbrProcGetIn
 *
 */

  public void setRbrProcedure(RbrProcObjectKeyData RbrProcGetInIn) {
    RbrProcGetIn = RbrProcGetInIn;
  }

  public void translateFromMap() {
    RbrProcGetIn = RbrProcObjectKeyHelper.fromMap(inputMap, "RbrProcedure");
  }

/**
 *
 * Gets the RbrProcedure
 * @return Value of the RbrProcedure
 *
 */

  public RbrProcObjectKeyData getRbrProcedure( ) {
    return RbrProcGetIn;
  }

}
