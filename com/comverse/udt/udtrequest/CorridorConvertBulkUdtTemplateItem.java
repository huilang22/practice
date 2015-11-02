/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorConvertBulkUdtTemplateItem.java
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
 * Class used to create a CorridorConvertBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorConvertBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CorridorObjectData CorrConvertIn;
/**
 *
 * Constructor to create a  CorridorConvertBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorConvertBulkUdtTemplateItem(String id, BSDMSessionContext context, CorridorObjectData CorrConvertInIn) {
    super(id, context, "CorridorConvert");
    CorrConvertIn = CorrConvertInIn;
  }

  public void translateToMap() {
    if (CorrConvertIn != null) {
      CorrConvertIn.resetFlags(true, true);
      addInput("Corridor", CorridorObjectHelper.toMap(CorrConvertIn, new HashMap(), "Corridor").get("Corridor"));
    }
  }


/**
 *
 * Sets the Corridor
 * @param CorrConvertInIn Value of the CorrConvertIn
 *
 */

  public void setCorridor(CorridorObjectData CorrConvertInIn) {
    CorrConvertIn = CorrConvertInIn;
  }

  public void translateFromMap() {
    CorrConvertIn = CorridorObjectHelper.fromMap(inputMap, "Corridor");
  }

/**
 *
 * Gets the Corridor
 * @return Value of the Corridor
 *
 */

  public CorridorObjectData getCorridor( ) {
    return CorrConvertIn;
  }

}
