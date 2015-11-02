/*
 * Generated code DO NOT EDIT
 * Generated file: DistanceBandGetBulkUdtTemplateItem.java
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
 * Class used to create a DistanceBandGetBulkUdtTemplateItem Bulk Template
 *
 */

public class DistanceBandGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DistanceBandObjectKeyData DBGetIn;
/**
 *
 * Constructor to create a  DistanceBandGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DistanceBandGetBulkUdtTemplateItem(String id, BSDMSessionContext context, DistanceBandObjectKeyData DBGetInIn) {
    super(id, context, "DistanceBandGet");
    DBGetIn = DBGetInIn;
  }

  public void translateToMap() {
    if (DBGetIn != null) {
      DBGetIn.resetFlags(true, true);
      addInput("DistanceBand", DistanceBandObjectKeyHelper.toMap(DBGetIn, new HashMap(), "DistanceBandObjectKeyData").get("DistanceBandObjectKeyData"));
    }
  }


/**
 *
 * Sets the DistanceBand
 * @param DBGetInIn Value of the DBGetIn
 *
 */

  public void setDistanceBand(DistanceBandObjectKeyData DBGetInIn) {
    DBGetIn = DBGetInIn;
  }

  public void translateFromMap() {
    DBGetIn = DistanceBandObjectKeyHelper.fromMap(inputMap, "DistanceBand");
  }

/**
 *
 * Gets the DistanceBand
 * @return Value of the DistanceBand
 *
 */

  public DistanceBandObjectKeyData getDistanceBand( ) {
    return DBGetIn;
  }

}
