/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjTransGroupFindBulkUdtTemplateItem.java
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
 * Class used to create a AdjTransGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjTransGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ATGObjectFilter ADGFindIn;
/**
 *
 * Constructor to create a  AdjTransGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjTransGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ATGObjectFilter ADGFindInIn) {
    super(id, context, "AdjTransGroupFind");
    ADGFindIn = ADGFindInIn;
  }

  public void translateToMap() {
    if (ADGFindIn != null) {
      Integer index =  ADGFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AdjTransGroup", ATGObjectHelper.toMap(ADGFindIn, new HashMap(), "AdjTransGroup").get("AdjTransGroup"));
    }
  }


/**
 *
 * Sets the AdjTransGroup
 * @param ADGFindInIn Value of the ADGFindIn
 *
 */

  public void setAdjTransGroup(ATGObjectFilter ADGFindInIn) {
    ADGFindIn = ADGFindInIn;
  }

  public void translateFromMap() {
    ADGFindIn = ATGObjectHelper.fromMapFilter(inputMap, "AdjTransGroup");
  }

/**
 *
 * Gets the AdjTransGroup
 * @return Value of the AdjTransGroup
 *
 */

  public ATGObjectFilter getAdjTransGroup( ) {
    return ADGFindIn;
  }

}
