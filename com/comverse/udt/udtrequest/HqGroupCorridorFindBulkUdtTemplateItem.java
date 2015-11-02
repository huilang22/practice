/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupCorridorFindBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupCorridorFindBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupCorridorFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupCorridorObjectFilter HQGCfindIn;
/**
 *
 * Constructor to create a  HqGroupCorridorFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupCorridorFindBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupCorridorObjectFilter HQGCfindInIn) {
    super(id, context, "HqGroupCorridorFind");
    HQGCfindIn = HQGCfindInIn;
  }

  public void translateToMap() {
    if (HQGCfindIn != null) {
      Integer index =  HQGCfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(HQGCfindIn, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }


/**
 *
 * Sets the HqGroupCorridor
 * @param HQGCfindInIn Value of the HQGCfindIn
 *
 */

  public void setHqGroupCorridor(HqGroupCorridorObjectFilter HQGCfindInIn) {
    HQGCfindIn = HQGCfindInIn;
  }

  public void translateFromMap() {
    HQGCfindIn = HqGroupCorridorObjectHelper.fromMapFilter(inputMap, "HqGroupCorridor");
  }

/**
 *
 * Gets the HqGroupCorridor
 * @return Value of the HqGroupCorridor
 *
 */

  public HqGroupCorridorObjectFilter getHqGroupCorridor( ) {
    return HQGCfindIn;
  }

}
