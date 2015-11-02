/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SpecialDestinationTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a SpecialDestinationTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class SpecialDestinationTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SpecialDestinationTypeObjectData sdCrIn;
/**
 *
 * Constructor to create a  SpecialDestinationTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SpecialDestinationTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, SpecialDestinationTypeObjectData sdCrInIn) {
    super(id, context, "SpecialDestinationTypeCreate");
    sdCrIn = sdCrInIn;
  }

  public void translateToMap() {
    if (sdCrIn != null) {
      sdCrIn.resetFlags(true, true);
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectHelper.toMap(sdCrIn, new HashMap(), "SpecialDestinationType").get("SpecialDestinationType"));
    }
  }


/**
 *
 * Sets the SpecialDestinationType
 * @param sdCrInIn Value of the sdCrIn
 *
 */

  public void setSpecialDestinationType(SpecialDestinationTypeObjectData sdCrInIn) {
    sdCrIn = sdCrInIn;
  }

  public void translateFromMap() {
    sdCrIn = SpecialDestinationTypeObjectHelper.fromMap(inputMap, "SpecialDestinationType");
  }

/**
 *
 * Gets the SpecialDestinationType
 * @return Value of the SpecialDestinationType
 *
 */

  public SpecialDestinationTypeObjectData getSpecialDestinationType( ) {
    return sdCrIn;
  }

}
