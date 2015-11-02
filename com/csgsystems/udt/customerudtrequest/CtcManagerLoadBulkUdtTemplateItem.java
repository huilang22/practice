/*
 * Generated code DO NOT EDIT
 * Generated file: CtcManagerLoadBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcManagerLoadBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcManagerLoadBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcManagerLoadObjectData CtcManagerLoadIn;
/**
 *
 * Constructor to create a  CtcManagerLoadBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcManagerLoadBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcManagerLoadObjectData CtcManagerLoadInIn) {
    super(id, context, "CtcManagerLoad");
    CtcManagerLoadIn = CtcManagerLoadInIn;
  }

  public void translateToMap() {
    if (CtcManagerLoadIn != null) {
      CtcManagerLoadIn.resetFlags(true, true);
      addInput("CtcManagerLoadIn", CtcManagerLoadObjectHelper.toMap(CtcManagerLoadIn, new HashMap(), "BatchId").get("BatchId"));
    }
  }


/**
 *
 * Sets the CtcManagerLoadIn
 * @param CtcManagerLoadInIn Value of the CtcManagerLoadIn
 *
 */

  public void setCtcManagerLoadIn(CtcManagerLoadObjectData CtcManagerLoadInIn) {
    CtcManagerLoadIn = CtcManagerLoadInIn;
  }

  public void translateFromMap() {
    CtcManagerLoadIn = CtcManagerLoadObjectHelper.fromMap(inputMap, "CtcManagerLoadIn");
  }

/**
 *
 * Gets the CtcManagerLoadIn
 * @return Value of the CtcManagerLoadIn
 *
 */

  public CtcManagerLoadObjectData getCtcManagerLoadIn( ) {
    return CtcManagerLoadIn;
  }

}
