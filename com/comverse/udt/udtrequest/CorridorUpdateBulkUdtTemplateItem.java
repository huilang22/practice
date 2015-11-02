/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CorridorUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CorridorObjectData CorrUpdateIn;
/**
 *
 * Constructor to create a  CorridorUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CorridorObjectData CorrUpdateInIn) {
    super(id, context, "CorridorUpdate");
    CorrUpdateIn = CorrUpdateInIn;
  }

  public void translateToMap() {
    if (CorrUpdateIn != null) {
      CorrUpdateIn.resetFlags(true, true);
      addInput("Corridor", CorridorObjectHelper.toMap(CorrUpdateIn, new HashMap(), "Corridor").get("Corridor"));
    }
  }


/**
 *
 * Sets the Corridor
 * @param CorrUpdateInIn Value of the CorrUpdateIn
 *
 */

  public void setCorridor(CorridorObjectData CorrUpdateInIn) {
    CorrUpdateIn = CorrUpdateInIn;
  }

  public void translateFromMap() {
    CorrUpdateIn = CorridorObjectHelper.fromMap(inputMap, "Corridor");
  }

/**
 *
 * Gets the Corridor
 * @return Value of the Corridor
 *
 */

  public CorridorObjectData getCorridor( ) {
    return CorrUpdateIn;
  }

}
