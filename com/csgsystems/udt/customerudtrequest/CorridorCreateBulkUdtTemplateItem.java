/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorCreateBulkUdtTemplateItem.java
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
 * Class used to create a CorridorCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CorridorObjectData CorrCreateIn;
/**
 *
 * Constructor to create a  CorridorCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CorridorObjectData CorrCreateInIn) {
    super(id, context, "CorridorCreate");
    CorrCreateIn = CorrCreateInIn;
  }

  public void translateToMap() {
    if (CorrCreateIn != null) {
      CorrCreateIn.resetFlags(true, true);
      addInput("Corridor", CorridorObjectHelper.toMap(CorrCreateIn, new HashMap(), "Corridor").get("Corridor"));
    }
  }


/**
 *
 * Sets the Corridor
 * @param CorrCreateInIn Value of the CorrCreateIn
 *
 */

  public void setCorridor(CorridorObjectData CorrCreateInIn) {
    CorrCreateIn = CorrCreateInIn;
  }

  public void translateFromMap() {
    CorrCreateIn = CorridorObjectHelper.fromMap(inputMap, "Corridor");
  }

/**
 *
 * Gets the Corridor
 * @return Value of the Corridor
 *
 */

  public CorridorObjectData getCorridor( ) {
    return CorrCreateIn;
  }

}
