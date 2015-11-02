/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOrderMethodCreateBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcOrderMethodCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOrderMethodCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOrderMethodObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcOrderMethodCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOrderMethodCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOrderMethodObjectData CreateInIn) {
    super(id, context, "CtcOrderMethodCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcOrderMethod", CtcOrderMethodObjectHelper.toMap(CreateIn, new HashMap(), "CtcOrderMethod").get("CtcOrderMethod"));
    }
  }


/**
 *
 * Sets the CtcOrderMethod
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcOrderMethod(CtcOrderMethodObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcOrderMethodObjectHelper.fromMap(inputMap, "CtcOrderMethod");
  }

/**
 *
 * Gets the CtcOrderMethod
 * @return Value of the CtcOrderMethod
 *
 */

  public CtcOrderMethodObjectData getCtcOrderMethod( ) {
    return CreateIn;
  }

}
