/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorGetBulkUdtTemplateItem.java
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
 * Class used to create a CorridorGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CorridorObjectKeyData CCGetIn;
/**
 *
 * Constructor to create a  CorridorGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CorridorObjectKeyData CCGetInIn) {
    super(id, context, "CorridorGet");
    CCGetIn = CCGetInIn;
  }

  public void translateToMap() {
    if (CCGetIn != null) {
      CCGetIn.resetFlags(true, true);
      addInput("Corridor", CorridorObjectKeyHelper.toMap(CCGetIn, new HashMap(), "CorridorObjectKeyData").get("CorridorObjectKeyData"));
    }
  }


/**
 *
 * Sets the Corridor
 * @param CCGetInIn Value of the CCGetIn
 *
 */

  public void setCorridor(CorridorObjectKeyData CCGetInIn) {
    CCGetIn = CCGetInIn;
  }

  public void translateFromMap() {
    CCGetIn = CorridorObjectKeyHelper.fromMap(inputMap, "Corridor");
  }

/**
 *
 * Gets the Corridor
 * @return Value of the Corridor
 *
 */

  public CorridorObjectKeyData getCorridor( ) {
    return CCGetIn;
  }

}
