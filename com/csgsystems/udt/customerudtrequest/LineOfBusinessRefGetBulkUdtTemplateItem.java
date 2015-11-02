/*
 * Generated code DO NOT EDIT
 * Generated file: LineOfBusinessRefGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a LineOfBusinessRefGetBulkUdtTemplateItem Bulk Template
 *
 */

public class LineOfBusinessRefGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LineOfBusinessRefObjectKeyData LineOfBusinessRefGetIn;
/**
 *
 * Constructor to create a  LineOfBusinessRefGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LineOfBusinessRefGetBulkUdtTemplateItem(String id, BSDMSessionContext context, LineOfBusinessRefObjectKeyData LineOfBusinessRefGetInIn) {
    super(id, context, "LineOfBusinessRefGet");
    LineOfBusinessRefGetIn = LineOfBusinessRefGetInIn;
  }

  public void translateToMap() {
    if (LineOfBusinessRefGetIn != null) {
      LineOfBusinessRefGetIn.resetFlags(true, true);
      addInput("LineOfBusinessRef", LineOfBusinessRefObjectKeyHelper.toMap(LineOfBusinessRefGetIn, new HashMap(), "LineOfBusinessRefObjectKeyData").get("LineOfBusinessRefObjectKeyData"));
    }
  }


/**
 *
 * Sets the LineOfBusinessRef
 * @param LineOfBusinessRefGetInIn Value of the LineOfBusinessRefGetIn
 *
 */

  public void setLineOfBusinessRef(LineOfBusinessRefObjectKeyData LineOfBusinessRefGetInIn) {
    LineOfBusinessRefGetIn = LineOfBusinessRefGetInIn;
  }

  public void translateFromMap() {
    LineOfBusinessRefGetIn = LineOfBusinessRefObjectKeyHelper.fromMap(inputMap, "LineOfBusinessRef");
  }

/**
 *
 * Gets the LineOfBusinessRef
 * @return Value of the LineOfBusinessRef
 *
 */

  public LineOfBusinessRefObjectKeyData getLineOfBusinessRef( ) {
    return LineOfBusinessRefGetIn;
  }

}
