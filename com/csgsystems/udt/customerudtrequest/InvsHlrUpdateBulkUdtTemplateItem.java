/*
 * Generated code DO NOT EDIT
 * Generated file: InvsHlrUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a InvsHlrUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsHlrUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsHlrObjectData InvsHlrUpdateIn;
/**
 *
 * Constructor to create a  InvsHlrUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsHlrUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsHlrObjectData InvsHlrUpdateInIn) {
    super(id, context, "InvsHlrUpdate");
    InvsHlrUpdateIn = InvsHlrUpdateInIn;
  }

  public void translateToMap() {
    if (InvsHlrUpdateIn != null) {
      InvsHlrUpdateIn.resetFlags(true, true);
      addInput("InvsHlr", InvsHlrObjectHelper.toMap(InvsHlrUpdateIn, new HashMap(), "InvsHlr").get("InvsHlr"));
    }
  }


/**
 *
 * Sets the InvsHlr
 * @param InvsHlrUpdateInIn Value of the InvsHlrUpdateIn
 *
 */

  public void setInvsHlr(InvsHlrObjectData InvsHlrUpdateInIn) {
    InvsHlrUpdateIn = InvsHlrUpdateInIn;
  }

  public void translateFromMap() {
    InvsHlrUpdateIn = InvsHlrObjectHelper.fromMap(inputMap, "InvsHlr");
  }

/**
 *
 * Gets the InvsHlr
 * @return Value of the InvsHlr
 *
 */

  public InvsHlrObjectData getInvsHlr( ) {
    return InvsHlrUpdateIn;
  }

}
