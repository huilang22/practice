/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DistanceBandFindBulkUdtTemplateItem.java
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
 * Class used to create a DistanceBandFindBulkUdtTemplateItem Bulk Template
 *
 */

public class DistanceBandFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DistanceBandObjectFilter DBFindIn;
/**
 *
 * Constructor to create a  DistanceBandFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DistanceBandFindBulkUdtTemplateItem(String id, BSDMSessionContext context, DistanceBandObjectFilter DBFindInIn) {
    super(id, context, "DistanceBandFind");
    DBFindIn = DBFindInIn;
  }

  public void translateToMap() {
    if (DBFindIn != null) {
      Integer index =  DBFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DistanceBand", DistanceBandObjectHelper.toMap(DBFindIn, new HashMap(), "DistanceBand").get("DistanceBand"));
    }
  }


/**
 *
 * Sets the DistanceBand
 * @param DBFindInIn Value of the DBFindIn
 *
 */

  public void setDistanceBand(DistanceBandObjectFilter DBFindInIn) {
    DBFindIn = DBFindInIn;
  }

  public void translateFromMap() {
    DBFindIn = DistanceBandObjectHelper.fromMapFilter(inputMap, "DistanceBand");
  }

/**
 *
 * Gets the DistanceBand
 * @return Value of the DistanceBand
 *
 */

  public DistanceBandObjectFilter getDistanceBand( ) {
    return DBFindIn;
  }

}
