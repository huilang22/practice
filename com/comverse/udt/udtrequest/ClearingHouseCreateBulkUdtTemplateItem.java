/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseCreateBulkUdtTemplateItem.java
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
 * Class used to create a ClearingHouseCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ClearingHouseCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ClearingHouseObjectData CHICreateIn;
/**
 *
 * Constructor to create a  ClearingHouseCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ClearingHouseCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ClearingHouseObjectData CHICreateInIn) {
    super(id, context, "ClearingHouseCreate");
    CHICreateIn = CHICreateInIn;
  }

  public void translateToMap() {
    if (CHICreateIn != null) {
      CHICreateIn.resetFlags(true, true);
      addInput("ClearingHouse", ClearingHouseObjectHelper.toMap(CHICreateIn, new HashMap(), "ClearingHouse").get("ClearingHouse"));
    }
  }


/**
 *
 * Sets the ClearingHouse
 * @param CHICreateInIn Value of the CHICreateIn
 *
 */

  public void setClearingHouse(ClearingHouseObjectData CHICreateInIn) {
    CHICreateIn = CHICreateInIn;
  }

  public void translateFromMap() {
    CHICreateIn = ClearingHouseObjectHelper.fromMap(inputMap, "ClearingHouse");
  }

/**
 *
 * Gets the ClearingHouse
 * @return Value of the ClearingHouse
 *
 */

  public ClearingHouseObjectData getClearingHouse( ) {
    return CHICreateIn;
  }

}
