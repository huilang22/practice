/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupCorridorDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a HqGroupCorridorDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupCorridorDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupCorridorObjectData HQGCdeleteIn;
/**
 *
 * Constructor to create a  HqGroupCorridorDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupCorridorDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupCorridorObjectData HQGCdeleteInIn) {
    super(id, context, "HqGroupCorridorDelete");
    HQGCdeleteIn = HQGCdeleteInIn;
  }

  public void translateToMap() {
    if (HQGCdeleteIn != null) {
      HQGCdeleteIn.resetFlags(true, true);
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(HQGCdeleteIn, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }


/**
 *
 * Sets the HqGroupCorridor
 * @param HQGCdeleteInIn Value of the HQGCdeleteIn
 *
 */

  public void setHqGroupCorridor(HqGroupCorridorObjectData HQGCdeleteInIn) {
    HQGCdeleteIn = HQGCdeleteInIn;
  }

  public void translateFromMap() {
    HQGCdeleteIn = HqGroupCorridorObjectHelper.fromMap(inputMap, "HqGroupCorridor");
  }

/**
 *
 * Gets the HqGroupCorridor
 * @return Value of the HqGroupCorridor
 *
 */

  public HqGroupCorridorObjectData getHqGroupCorridor( ) {
    return HQGCdeleteIn;
  }

}
