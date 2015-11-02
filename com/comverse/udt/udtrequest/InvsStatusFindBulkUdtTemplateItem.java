/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStatusFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsStatusFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsStatusFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsStatusObjectFilter InvsStatusFindIn;
/**
 *
 * Constructor to create a  InvsStatusFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsStatusFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStatusObjectFilter InvsStatusFindInIn) {
    super(id, context, "InvsStatusFind");
    InvsStatusFindIn = InvsStatusFindInIn;
  }

  public void translateToMap() {
    if (InvsStatusFindIn != null) {
      Integer index =  InvsStatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsStatus", InvsStatusObjectHelper.toMap(InvsStatusFindIn, new HashMap(), "InvsStatus").get("InvsStatus"));
    }
  }


/**
 *
 * Sets the InvsStatus
 * @param InvsStatusFindInIn Value of the InvsStatusFindIn
 *
 */

  public void setInvsStatus(InvsStatusObjectFilter InvsStatusFindInIn) {
    InvsStatusFindIn = InvsStatusFindInIn;
  }

  public void translateFromMap() {
    InvsStatusFindIn = InvsStatusObjectHelper.fromMapFilter(inputMap, "InvsStatus");
  }

/**
 *
 * Gets the InvsStatus
 * @return Value of the InvsStatus
 *
 */

  public InvsStatusObjectFilter getInvsStatus( ) {
    return InvsStatusFindIn;
  }

}
