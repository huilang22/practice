/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsOperatorCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsOperatorCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsOperatorCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsOperatorObjectData InvsOperatorCreateIn;
/**
 *
 * Constructor to create a  InvsOperatorCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsOperatorCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsOperatorObjectData InvsOperatorCreateInIn) {
    super(id, context, "InvsOperatorCreate");
    InvsOperatorCreateIn = InvsOperatorCreateInIn;
  }

  public void translateToMap() {
    if (InvsOperatorCreateIn != null) {
      InvsOperatorCreateIn.resetFlags(true, true);
      addInput("InvsOperator", InvsOperatorObjectHelper.toMap(InvsOperatorCreateIn, new HashMap(), "InvsOperator").get("InvsOperator"));
    }
  }


/**
 *
 * Sets the InvsOperator
 * @param InvsOperatorCreateInIn Value of the InvsOperatorCreateIn
 *
 */

  public void setInvsOperator(InvsOperatorObjectData InvsOperatorCreateInIn) {
    InvsOperatorCreateIn = InvsOperatorCreateInIn;
  }

  public void translateFromMap() {
    InvsOperatorCreateIn = InvsOperatorObjectHelper.fromMap(inputMap, "InvsOperator");
  }

/**
 *
 * Gets the InvsOperator
 * @return Value of the InvsOperator
 *
 */

  public InvsOperatorObjectData getInvsOperator( ) {
    return InvsOperatorCreateIn;
  }

}
