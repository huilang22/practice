/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DistanceBandUpdateBulkUdtTemplateItem.java
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
 * Class used to create a DistanceBandUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class DistanceBandUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DistanceBandObjectData DBUpdateIn;
/**
 *
 * Constructor to create a  DistanceBandUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DistanceBandUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, DistanceBandObjectData DBUpdateInIn) {
    super(id, context, "DistanceBandUpdate");
    DBUpdateIn = DBUpdateInIn;
  }

  public void translateToMap() {
    if (DBUpdateIn != null) {
      DBUpdateIn.resetFlags(true, true);
      addInput("DistanceBand", DistanceBandObjectHelper.toMap(DBUpdateIn, new HashMap(), "DistanceBand").get("DistanceBand"));
    }
  }


/**
 *
 * Sets the DistanceBand
 * @param DBUpdateInIn Value of the DBUpdateIn
 *
 */

  public void setDistanceBand(DistanceBandObjectData DBUpdateInIn) {
    DBUpdateIn = DBUpdateInIn;
  }

  public void translateFromMap() {
    DBUpdateIn = DistanceBandObjectHelper.fromMap(inputMap, "DistanceBand");
  }

/**
 *
 * Gets the DistanceBand
 * @return Value of the DistanceBand
 *
 */

  public DistanceBandObjectData getDistanceBand( ) {
    return DBUpdateIn;
  }

}
