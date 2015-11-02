/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimCardConfigFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimCardConfigFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimCardConfigObjectFilter InvsSimCardConfigFindIn;
/**
 *
 * Constructor to create a  InvsSimCardConfigFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimCardConfigFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimCardConfigObjectFilter InvsSimCardConfigFindInIn) {
    super(id, context, "InvsSimCardConfigFind");
    InvsSimCardConfigFindIn = InvsSimCardConfigFindInIn;
  }

  public void translateToMap() {
    if (InvsSimCardConfigFindIn != null) {
      Integer index =  InvsSimCardConfigFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectHelper.toMap(InvsSimCardConfigFindIn, new HashMap(), "InvsSimCardConfig").get("InvsSimCardConfig"));
    }
  }


/**
 *
 * Sets the InvsSimCardConfig
 * @param InvsSimCardConfigFindInIn Value of the InvsSimCardConfigFindIn
 *
 */

  public void setInvsSimCardConfig(InvsSimCardConfigObjectFilter InvsSimCardConfigFindInIn) {
    InvsSimCardConfigFindIn = InvsSimCardConfigFindInIn;
  }

  public void translateFromMap() {
    InvsSimCardConfigFindIn = InvsSimCardConfigObjectHelper.fromMapFilter(inputMap, "InvsSimCardConfig");
  }

/**
 *
 * Gets the InvsSimCardConfig
 * @return Value of the InvsSimCardConfig
 *
 */

  public InvsSimCardConfigObjectFilter getInvsSimCardConfig( ) {
    return InvsSimCardConfigFindIn;
  }

}
