/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LineOfBusinessValuesGetBulkUdtTemplateItem.java
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
 * Class used to create a LineOfBusinessValuesGetBulkUdtTemplateItem Bulk Template
 *
 */

public class LineOfBusinessValuesGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LineOfBusinessValuesObjectKeyData LineOfBusinessValuesGetIn;
/**
 *
 * Constructor to create a  LineOfBusinessValuesGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LineOfBusinessValuesGetBulkUdtTemplateItem(String id, BSDMSessionContext context, LineOfBusinessValuesObjectKeyData LineOfBusinessValuesGetInIn) {
    super(id, context, "LineOfBusinessValuesGet");
    LineOfBusinessValuesGetIn = LineOfBusinessValuesGetInIn;
  }

  public void translateToMap() {
    if (LineOfBusinessValuesGetIn != null) {
      LineOfBusinessValuesGetIn.resetFlags(true, true);
      addInput("LineOfBusinessValues", LineOfBusinessValuesObjectKeyHelper.toMap(LineOfBusinessValuesGetIn, new HashMap(), "LineOfBusinessValuesObjectKeyData").get("LineOfBusinessValuesObjectKeyData"));
    }
  }


/**
 *
 * Sets the LineOfBusinessValues
 * @param LineOfBusinessValuesGetInIn Value of the LineOfBusinessValuesGetIn
 *
 */

  public void setLineOfBusinessValues(LineOfBusinessValuesObjectKeyData LineOfBusinessValuesGetInIn) {
    LineOfBusinessValuesGetIn = LineOfBusinessValuesGetInIn;
  }

  public void translateFromMap() {
    LineOfBusinessValuesGetIn = LineOfBusinessValuesObjectKeyHelper.fromMap(inputMap, "LineOfBusinessValues");
  }

/**
 *
 * Gets the LineOfBusinessValues
 * @return Value of the LineOfBusinessValues
 *
 */

  public LineOfBusinessValuesObjectKeyData getLineOfBusinessValues( ) {
    return LineOfBusinessValuesGetIn;
  }

}
