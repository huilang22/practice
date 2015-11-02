/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsLineCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLineCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLineObjectData InvsLineCreateIn;
/**
 *
 * Constructor to create a  InvsLineCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLineCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineObjectData InvsLineCreateInIn) {
    super(id, context, "InvsLineCreate");
    InvsLineCreateIn = InvsLineCreateInIn;
  }

  public void translateToMap() {
    if (InvsLineCreateIn != null) {
      InvsLineCreateIn.resetFlags(true, true);
      addInput("InvsLine", InvsLineObjectHelper.toMap(InvsLineCreateIn, new HashMap(), "InvsLine").get("InvsLine"));
    }
  }


/**
 *
 * Sets the InvsLine
 * @param InvsLineCreateInIn Value of the InvsLineCreateIn
 *
 */

  public void setInvsLine(InvsLineObjectData InvsLineCreateInIn) {
    InvsLineCreateIn = InvsLineCreateInIn;
  }

  public void translateFromMap() {
    InvsLineCreateIn = InvsLineObjectHelper.fromMap(inputMap, "InvsLine");
  }

/**
 *
 * Gets the InvsLine
 * @return Value of the InvsLine
 *
 */

  public InvsLineObjectData getInvsLine( ) {
    return InvsLineCreateIn;
  }

}
