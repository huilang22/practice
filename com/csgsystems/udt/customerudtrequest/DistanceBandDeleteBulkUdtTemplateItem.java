/*
 * Generated code DO NOT EDIT
 * Generated file: DistanceBandDeleteBulkUdtTemplateItem.java
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
 * Class used to create a DistanceBandDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class DistanceBandDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DistanceBandObjectKeyData DBDeleteIn;
/**
 *
 * Constructor to create a  DistanceBandDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DistanceBandDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, DistanceBandObjectKeyData DBDeleteInIn) {
    super(id, context, "DistanceBandDelete");
    DBDeleteIn = DBDeleteInIn;
  }

  public void translateToMap() {
    if (DBDeleteIn != null) {
      DBDeleteIn.resetFlags(true, true);
      addInput("DistanceBand", DistanceBandObjectKeyHelper.toMap(DBDeleteIn, new HashMap(), "DistanceBandObjectKeyData").get("DistanceBandObjectKeyData"));
    }
  }


/**
 *
 * Sets the DistanceBand
 * @param DBDeleteInIn Value of the DBDeleteIn
 *
 */

  public void setDistanceBand(DistanceBandObjectKeyData DBDeleteInIn) {
    DBDeleteIn = DBDeleteInIn;
  }

  public void translateFromMap() {
    DBDeleteIn = DistanceBandObjectKeyHelper.fromMap(inputMap, "DistanceBand");
  }

/**
 *
 * Gets the DistanceBand
 * @return Value of the DistanceBand
 *
 */

  public DistanceBandObjectKeyData getDistanceBand( ) {
    return DBDeleteIn;
  }

}
