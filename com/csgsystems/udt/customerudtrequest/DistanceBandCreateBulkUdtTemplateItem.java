/*
 * Generated code DO NOT EDIT
 * Generated file: DistanceBandCreateBulkUdtTemplateItem.java
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
 * Class used to create a DistanceBandCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class DistanceBandCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DistanceBandObjectData DBCreateIn;
/**
 *
 * Constructor to create a  DistanceBandCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DistanceBandCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, DistanceBandObjectData DBCreateInIn) {
    super(id, context, "DistanceBandCreate");
    DBCreateIn = DBCreateInIn;
  }

  public void translateToMap() {
    if (DBCreateIn != null) {
      DBCreateIn.resetFlags(true, true);
      addInput("DistanceBand", DistanceBandObjectHelper.toMap(DBCreateIn, new HashMap(), "DistanceBand").get("DistanceBand"));
    }
  }


/**
 *
 * Sets the DistanceBand
 * @param DBCreateInIn Value of the DBCreateIn
 *
 */

  public void setDistanceBand(DistanceBandObjectData DBCreateInIn) {
    DBCreateIn = DBCreateInIn;
  }

  public void translateFromMap() {
    DBCreateIn = DistanceBandObjectHelper.fromMap(inputMap, "DistanceBand");
  }

/**
 *
 * Gets the DistanceBand
 * @return Value of the DistanceBand
 *
 */

  public DistanceBandObjectData getDistanceBand( ) {
    return DBCreateIn;
  }

}
