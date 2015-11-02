/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupCorridorDeleteListBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a HqGroupCorridorDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupCorridorDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupCorridorObjectFilter HQGCdeleteListIn;
/**
 *
 * Constructor to create a  HqGroupCorridorDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupCorridorDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupCorridorObjectFilter HQGCdeleteListInIn) {
    super(id, context, "HqGroupCorridorDeleteList");
    HQGCdeleteListIn = HQGCdeleteListInIn;
  }

  public void translateToMap() {
    if (HQGCdeleteListIn != null) {
      Integer index =  HQGCdeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(HQGCdeleteListIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the HqGroupCorridor
 * @param HQGCdeleteListInIn Value of the HQGCdeleteListIn
 *
 */

  public void setHqGroupCorridor(HqGroupCorridorObjectFilter HQGCdeleteListInIn) {
    HQGCdeleteListIn = HQGCdeleteListInIn;
  }

  public void translateFromMap() {
    HQGCdeleteListIn = HqGroupCorridorObjectHelper.fromMapFilter(inputMap, "HqGroupCorridor");
  }

/**
 *
 * Gets the HqGroupCorridor
 * @return Value of the HqGroupCorridor
 *
 */

  public HqGroupCorridorObjectFilter getHqGroupCorridor( ) {
    return HQGCdeleteListIn;
  }

}
