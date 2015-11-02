/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorFindBulkUdtTemplateItem.java
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
 * Class used to create a CorridorFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CorridorObjectFilter CCFindIn;
/**
 *
 * Constructor to create a  CorridorFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CorridorObjectFilter CCFindInIn) {
    super(id, context, "CorridorFind");
    CCFindIn = CCFindInIn;
  }

  public void translateToMap() {
    if (CCFindIn != null) {
      Integer index =  CCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Corridor", CorridorObjectHelper.toMap(CCFindIn, new HashMap(), "Corridor").get("Corridor"));
    }
  }


/**
 *
 * Sets the Corridor
 * @param CCFindInIn Value of the CCFindIn
 *
 */

  public void setCorridor(CorridorObjectFilter CCFindInIn) {
    CCFindIn = CCFindInIn;
  }

  public void translateFromMap() {
    CCFindIn = CorridorObjectHelper.fromMapFilter(inputMap, "Corridor");
  }

/**
 *
 * Gets the Corridor
 * @return Value of the Corridor
 *
 */

  public CorridorObjectFilter getCorridor( ) {
    return CCFindIn;
  }

}
