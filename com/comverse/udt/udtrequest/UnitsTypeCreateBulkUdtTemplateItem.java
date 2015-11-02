/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitsTypeCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a UnitsTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitsTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitsTypeObjectData utCrIn;
/**
 *
 * Constructor to create a  UnitsTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitsTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitsTypeObjectData utCrInIn) {
    super(id, context, "UnitsTypeCreate");
    utCrIn = utCrInIn;
  }

  public void translateToMap() {
    if (utCrIn != null) {
      utCrIn.resetFlags(true, true);
      addInput("UnitsType", UnitsTypeObjectHelper.toMap(utCrIn, new HashMap(), "UnitsType").get("UnitsType"));
    }
  }


/**
 *
 * Sets the UnitsType
 * @param utCrInIn Value of the utCrIn
 *
 */

  public void setUnitsType(UnitsTypeObjectData utCrInIn) {
    utCrIn = utCrInIn;
  }

  public void translateFromMap() {
    utCrIn = UnitsTypeObjectHelper.fromMap(inputMap, "UnitsType");
  }

/**
 *
 * Gets the UnitsType
 * @return Value of the UnitsType
 *
 */

  public UnitsTypeObjectData getUnitsType( ) {
    return utCrIn;
  }

}
