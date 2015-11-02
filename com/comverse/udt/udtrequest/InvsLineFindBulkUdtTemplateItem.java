/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsLineFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLineFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLineObjectFilter InvsLineFindIn;
/**
 *
 * Constructor to create a  InvsLineFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLineFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineObjectFilter InvsLineFindInIn) {
    super(id, context, "InvsLineFind");
    InvsLineFindIn = InvsLineFindInIn;
  }

  public void translateToMap() {
    if (InvsLineFindIn != null) {
      Integer index =  InvsLineFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLine", InvsLineObjectHelper.toMap(InvsLineFindIn, new HashMap(), "InvsLine").get("InvsLine"));
    }
  }


/**
 *
 * Sets the InvsLine
 * @param InvsLineFindInIn Value of the InvsLineFindIn
 *
 */

  public void setInvsLine(InvsLineObjectFilter InvsLineFindInIn) {
    InvsLineFindIn = InvsLineFindInIn;
  }

  public void translateFromMap() {
    InvsLineFindIn = InvsLineObjectHelper.fromMapFilter(inputMap, "InvsLine");
  }

/**
 *
 * Gets the InvsLine
 * @return Value of the InvsLine
 *
 */

  public InvsLineObjectFilter getInvsLine( ) {
    return InvsLineFindIn;
  }

}
