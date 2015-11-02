/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsHlrCreateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsHlrCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsHlrCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsHlrObjectData InvsHlrCreateIn;
/**
 *
 * Constructor to create a  InvsHlrCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsHlrCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsHlrObjectData InvsHlrCreateInIn) {
    super(id, context, "InvsHlrCreate");
    InvsHlrCreateIn = InvsHlrCreateInIn;
  }

  public void translateToMap() {
    if (InvsHlrCreateIn != null) {
      InvsHlrCreateIn.resetFlags(true, true);
      addInput("InvsHlr", InvsHlrObjectHelper.toMap(InvsHlrCreateIn, new HashMap(), "InvsHlr").get("InvsHlr"));
    }
  }


/**
 *
 * Sets the InvsHlr
 * @param InvsHlrCreateInIn Value of the InvsHlrCreateIn
 *
 */

  public void setInvsHlr(InvsHlrObjectData InvsHlrCreateInIn) {
    InvsHlrCreateIn = InvsHlrCreateInIn;
  }

  public void translateFromMap() {
    InvsHlrCreateIn = InvsHlrObjectHelper.fromMap(inputMap, "InvsHlr");
  }

/**
 *
 * Gets the InvsHlr
 * @return Value of the InvsHlr
 *
 */

  public InvsHlrObjectData getInvsHlr( ) {
    return InvsHlrCreateIn;
  }

}
