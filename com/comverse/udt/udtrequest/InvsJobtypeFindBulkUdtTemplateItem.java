/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobtypeFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsJobtypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsJobtypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsJobtypeObjectFilter InvsJobtypeFindIn;
/**
 *
 * Constructor to create a  InvsJobtypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsJobtypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobtypeObjectFilter InvsJobtypeFindInIn) {
    super(id, context, "InvsJobtypeFind");
    InvsJobtypeFindIn = InvsJobtypeFindInIn;
  }

  public void translateToMap() {
    if (InvsJobtypeFindIn != null) {
      Integer index =  InvsJobtypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsJobtype", InvsJobtypeObjectHelper.toMap(InvsJobtypeFindIn, new HashMap(), "InvsJobtype").get("InvsJobtype"));
    }
  }


/**
 *
 * Sets the InvsJobtype
 * @param InvsJobtypeFindInIn Value of the InvsJobtypeFindIn
 *
 */

  public void setInvsJobtype(InvsJobtypeObjectFilter InvsJobtypeFindInIn) {
    InvsJobtypeFindIn = InvsJobtypeFindInIn;
  }

  public void translateFromMap() {
    InvsJobtypeFindIn = InvsJobtypeObjectHelper.fromMapFilter(inputMap, "InvsJobtype");
  }

/**
 *
 * Gets the InvsJobtype
 * @return Value of the InvsJobtype
 *
 */

  public InvsJobtypeObjectFilter getInvsJobtype( ) {
    return InvsJobtypeFindIn;
  }

}
