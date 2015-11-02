/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineRefFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsLineRefFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLineRefFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLineRefObjectFilter InvsLineRefFindIn;
/**
 *
 * Constructor to create a  InvsLineRefFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLineRefFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineRefObjectFilter InvsLineRefFindInIn) {
    super(id, context, "InvsLineRefFind");
    InvsLineRefFindIn = InvsLineRefFindInIn;
  }

  public void translateToMap() {
    if (InvsLineRefFindIn != null) {
      Integer index =  InvsLineRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLineRef", InvsLineRefObjectHelper.toMap(InvsLineRefFindIn, new HashMap(), "InvsLineRef").get("InvsLineRef"));
    }
  }


/**
 *
 * Sets the InvsLineRef
 * @param InvsLineRefFindInIn Value of the InvsLineRefFindIn
 *
 */

  public void setInvsLineRef(InvsLineRefObjectFilter InvsLineRefFindInIn) {
    InvsLineRefFindIn = InvsLineRefFindInIn;
  }

  public void translateFromMap() {
    InvsLineRefFindIn = InvsLineRefObjectHelper.fromMapFilter(inputMap, "InvsLineRef");
  }

/**
 *
 * Gets the InvsLineRef
 * @return Value of the InvsLineRef
 *
 */

  public InvsLineRefObjectFilter getInvsLineRef( ) {
    return InvsLineRefFindIn;
  }

}
