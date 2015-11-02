/*
 * Generated code DO NOT EDIT
 * Generated file: LineOfBusinessRefFindBulkUdtTemplateItem.java
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
 * Class used to create a LineOfBusinessRefFindBulkUdtTemplateItem Bulk Template
 *
 */

public class LineOfBusinessRefFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LineOfBusinessRefObjectFilter LineOfBusinessRefFindIn;
/**
 *
 * Constructor to create a  LineOfBusinessRefFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LineOfBusinessRefFindBulkUdtTemplateItem(String id, BSDMSessionContext context, LineOfBusinessRefObjectFilter LineOfBusinessRefFindInIn) {
    super(id, context, "LineOfBusinessRefFind");
    LineOfBusinessRefFindIn = LineOfBusinessRefFindInIn;
  }

  public void translateToMap() {
    if (LineOfBusinessRefFindIn != null) {
      Integer index =  LineOfBusinessRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LineOfBusinessRef", LineOfBusinessRefObjectHelper.toMap(LineOfBusinessRefFindIn, new HashMap(), "LineOfBusinessRef").get("LineOfBusinessRef"));
    }
  }


/**
 *
 * Sets the LineOfBusinessRef
 * @param LineOfBusinessRefFindInIn Value of the LineOfBusinessRefFindIn
 *
 */

  public void setLineOfBusinessRef(LineOfBusinessRefObjectFilter LineOfBusinessRefFindInIn) {
    LineOfBusinessRefFindIn = LineOfBusinessRefFindInIn;
  }

  public void translateFromMap() {
    LineOfBusinessRefFindIn = LineOfBusinessRefObjectHelper.fromMapFilter(inputMap, "LineOfBusinessRef");
  }

/**
 *
 * Gets the LineOfBusinessRef
 * @return Value of the LineOfBusinessRef
 *
 */

  public LineOfBusinessRefObjectFilter getLineOfBusinessRef( ) {
    return LineOfBusinessRefFindIn;
  }

}
