/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrProcedureUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RbrProcedureUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrProcedureUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrProcObjectData RbrProcUpdateIn;
/**
 *
 * Constructor to create a  RbrProcedureUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrProcedureUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrProcObjectData RbrProcUpdateInIn) {
    super(id, context, "RbrProcedureUpdate");
    RbrProcUpdateIn = RbrProcUpdateInIn;
  }

  public void translateToMap() {
    if (RbrProcUpdateIn != null) {
      RbrProcUpdateIn.resetFlags(true, true);
      addInput("RbrProcedure", RbrProcObjectHelper.toMap(RbrProcUpdateIn, new HashMap(), "RbrProcedure").get("RbrProcedure"));
    }
  }


/**
 *
 * Sets the RbrProcedure
 * @param RbrProcUpdateInIn Value of the RbrProcUpdateIn
 *
 */

  public void setRbrProcedure(RbrProcObjectData RbrProcUpdateInIn) {
    RbrProcUpdateIn = RbrProcUpdateInIn;
  }

  public void translateFromMap() {
    RbrProcUpdateIn = RbrProcObjectHelper.fromMap(inputMap, "RbrProcedure");
  }

/**
 *
 * Gets the RbrProcedure
 * @return Value of the RbrProcedure
 *
 */

  public RbrProcObjectData getRbrProcedure( ) {
    return RbrProcUpdateIn;
  }

}
