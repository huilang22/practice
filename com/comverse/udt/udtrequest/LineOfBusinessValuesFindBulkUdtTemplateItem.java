/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LineOfBusinessValuesFindBulkUdtTemplateItem.java
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
 * Class used to create a LineOfBusinessValuesFindBulkUdtTemplateItem Bulk Template
 *
 */

public class LineOfBusinessValuesFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LineOfBusinessValuesObjectFilter LineOfBusinessValuesFindIn;
/**
 *
 * Constructor to create a  LineOfBusinessValuesFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LineOfBusinessValuesFindBulkUdtTemplateItem(String id, BSDMSessionContext context, LineOfBusinessValuesObjectFilter LineOfBusinessValuesFindInIn) {
    super(id, context, "LineOfBusinessValuesFind");
    LineOfBusinessValuesFindIn = LineOfBusinessValuesFindInIn;
  }

  public void translateToMap() {
    if (LineOfBusinessValuesFindIn != null) {
      Integer index =  LineOfBusinessValuesFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LineOfBusinessValues", LineOfBusinessValuesObjectHelper.toMap(LineOfBusinessValuesFindIn, new HashMap(), "LineOfBusinessValues").get("LineOfBusinessValues"));
    }
  }


/**
 *
 * Sets the LineOfBusinessValues
 * @param LineOfBusinessValuesFindInIn Value of the LineOfBusinessValuesFindIn
 *
 */

  public void setLineOfBusinessValues(LineOfBusinessValuesObjectFilter LineOfBusinessValuesFindInIn) {
    LineOfBusinessValuesFindIn = LineOfBusinessValuesFindInIn;
  }

  public void translateFromMap() {
    LineOfBusinessValuesFindIn = LineOfBusinessValuesObjectHelper.fromMapFilter(inputMap, "LineOfBusinessValues");
  }

/**
 *
 * Gets the LineOfBusinessValues
 * @return Value of the LineOfBusinessValues
 *
 */

  public LineOfBusinessValuesObjectFilter getLineOfBusinessValues( ) {
    return LineOfBusinessValuesFindIn;
  }

}
